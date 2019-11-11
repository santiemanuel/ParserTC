import java.util.HashMap;
import java.util.Map;

import core.TPLList;
import core.Value;

public class EvalParserTC extends ParserTCBaseVisitor<Value> {

	
	private Map<String, Value> memory = new HashMap<String, Value>();
	

	@Override public Value visitAssign(ParserTCParser.AssignContext ctx)
	{
		 String ident = ctx.IDENT().getText();
		 Value value = this.visit(ctx.expression());
		 memory.put(ident, value);
		 return value;
		 
	}

	@Override public Value visitPrint(ParserTCParser.PrintContext ctx) {
		 Value value = this.visit(ctx.expression());
		 System.out.println(value.toString());
		 return value;
	}

	@Override public Value visitSetExpr(ParserTCParser.SetExprContext ctx) {
		return visitChildren(ctx); 
	}

	@Override public Value visitListExpr(ParserTCParser.ListExprContext ctx) {
		 Value left = this.visit(ctx.left);
		 
		 if (ctx.right != null) {
			 Value right = this.visit(ctx.right);
			 Value result = this.visit(ctx.left); 
			 result.asList().addAll(right.asList());
			 return new Value(result.asList());
		 }
		 
		 if (left.isInteger()) return new Value(left.asInteger());
		 if (left.isString()) return new Value(left.asString());
		 else return new Value(left.asList());
		 	 
	}

	@Override public Value visitIntExpr(ParserTCParser.IntExprContext ctx) {
		
		Value left = this.visit(ctx.left);
				
		if (ctx.right != null) {
			Value right = this.visit(ctx.right);
			
			switch(ctx.op.getType()) {
			case ParserTCParser.PLUS:
				return new Value(left.asInteger() + right.asInteger());
			case ParserTCParser.MINUS:
				return new Value(left.asInteger() - right.asInteger());
			default:
                throw new RuntimeException("operador desconocido.");
			}
		} else
		{
			if (left.isList()) return new Value(left.asList());
			if (left.isInteger()) return new Value(left.asInteger());
			if (left.isString()) return new Value(left.asString());
			return null;
		}

	}

	@Override public Value visitTextExpr(ParserTCParser.TextExprContext ctx) {
		Value left = this.visit(ctx.left);
		
		if (ctx.right != null) {
			Value right = this.visit(ctx.right);
			return new Value(left.asString() + right.asString());
		} else
			return new Value(left.asString());
		
	}

	@Override public Value visitSetTerm(ParserTCParser.SetTermContext ctx) {
		return visitChildren(ctx); 
	}

	@Override public Value visitSetExt(ParserTCParser.SetExtContext ctx) {
		return visitChildren(ctx); 
	}

	@Override public Value visitExprList(ParserTCParser.ExprListContext ctx) {
		return visitChildren(ctx); 
	}
	
	@Override public Value visitListIdExpr(ParserTCParser.ListIdExprContext ctx) {
		String ident = ctx.IDENT().getText();
		Value value = memory.get(ident);
		if (value == null) {
			throw new RuntimeException("La variable "+ident+" no existe." );
		}
		if (ctx.idpos == null) {
			return value;
		}else
		{
			Value element = this.visit(ctx.idpos);
			Integer index = element.asInteger(); 
			TPLList list = value.asList();
			if (index >= list.size())
				throw new RuntimeException("Indice "+index+" fuera del rango." );
			if (list.get(index).isInteger()) return new Value(list.get(index).asInteger());
			if (list.get(index).isString()) return new Value(list.get(index).asString());
			else return new Value(list.get(index).asList());
		}
		
		
	}
	
	@Override public Value visitIndex(ParserTCParser.IndexContext ctx) {
		Value result = this.visit(ctx.val);
		return new Value(result.asInteger());
	}
	
	@Override public Value visitListExtExpr(ParserTCParser.ListExtExprContext ctx) {
		return this.visit(ctx.list);
	}

	@Override public Value visitListExt(ParserTCParser.ListExtContext ctx) {
		
		TPLList list = new TPLList();
		
		if (ctx.exprList() != null)
		{
			for (ParserTCParser.ExpressionContext expr : ctx.exprList().expression()) {
				list.add(this.visit(expr));
			}
		}
		
		return new Value(list);
	}

	@Override public Value visitIntTerm(ParserTCParser.IntTermContext ctx) {
		
		
		Value left = this.visit(ctx.left);
		if (ctx.right != null) {
			Value right = this.visit(ctx.right);
			
			switch(ctx.op.getType()) {
			case ParserTCParser.MULTI:
				return new Value(left.asInteger() * right.asInteger());
			case ParserTCParser.DIVI: if (right.asInteger() != 0) 
										return new Value(left.asInteger() / right.asInteger());
									  else throw new RuntimeException("Division por cero.");
			case ParserTCParser.MOD: if (right.asInteger() != 0) 
										return new Value(left.asInteger() % right.asInteger());
			  						  else throw new RuntimeException("Division por cero.");
			default:
                throw new RuntimeException("operador desconocido.");
			}
		}
		else
		{
			if (left.isList()) return new Value(left.asList());
			if (left.isInteger()) return new Value(left.asInteger());
			if (left.isString()) return new Value(left.asString());
			return null;
		}		
	}
	
	@Override public Value visitIdExpr(ParserTCParser.IdExprContext ctx) {

		String ident = ctx.id.getText();
		Value value = memory.get(ident);
		if (value == null) {
			System.out.print("NULL");
			throw new RuntimeException("La variable "+ident+" no existe." );
		}
		if (ctx.idpos == null) {
			return value;
		}else
		{
			Value element = this.visit(ctx.idpos);
			Integer index = element.asInteger();
			TPLList list = value.asList();
			if (index >= list.size())
				throw new RuntimeException("Indice "+index+" fuera del rango." );
			if (list.get(index).isInteger()) return new Value(list.get(index).asInteger());
			else throw new RuntimeException("El elemento en la posicion "+index+" no es un numero.");
		}
		
	}
	
	@Override public Value visitNumExpr(ParserTCParser.NumExprContext ctx) {
		return new Value(Integer.valueOf(ctx.getText()));
	}
	
	@Override public Value visitParExpr(ParserTCParser.ParExprContext ctx) {
		return this.visit(ctx.inparen);
	}
	
	@Override public Value visitUnaryExpr(ParserTCParser.UnaryExprContext ctx) {
		return new Value(-1 * this.visit(ctx.inminus).asInteger());
	}

	@Override public Value visitTextTerm(ParserTCParser.TextTermContext ctx) {
		String str = ctx.getText();
		
		str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
        return new Value(str);
	}
}

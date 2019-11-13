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
	
	@Override public Value visitUnaryExpr(ParserTCParser.UnaryExprContext ctx) {
		Value val = this.visit(ctx.expr);
		
		if (!val.isInteger()) {
			throw new RuntimeException("No es un numero.");
		}
		
		return new Value((-1) * val.asInteger());
	}
	
	@Override public Value visitPowExpr(ParserTCParser.PowExprContext ctx) {
		Value left = this.visit(ctx.left);
		Value right = this.visit(ctx.right);
		if (left.isInteger() && right.isInteger()) {
			return new Value(pow(left.asInteger(), right.asInteger()));
		}
		throw new RuntimeException("No son numeros los dos.");
	}
	
	private Integer pow(Integer base, Integer exp) {
		Integer res = 1;
		for (int i=1; i<=exp;i++) {
			res *= base;
		}
		return res;
	}
	
	@Override public Value visitBoolExpr(ParserTCParser.BoolExprContext ctx) {
		switch(ctx.op.getType()) {
			case ParserTCParser.LT : return lessThan(ctx);
			case ParserTCParser.LTEQ : return lessEqThan(ctx);
			case ParserTCParser.GT : return greaterThan(ctx);
			case ParserTCParser.GTEQ : return greaterEqThan(ctx);
			default: throw new RuntimeException("Simbolo desconocido.");
		}
	}
	
	private Value lessThan(ParserTCParser.BoolExprContext ctx) {
		Value left = this.visit(ctx.left);
		Value right = this.visit(ctx.right);
		
		if (left.isInteger() && right.isInteger())
			return new Value(left.asInteger() < right.asInteger());
		throw new RuntimeException("Solo se puede comparar numeros.");
	}
	
	private Value lessEqThan(ParserTCParser.BoolExprContext ctx) {
		Value left = this.visit(ctx.left);
		Value right = this.visit(ctx.right);
		
		if (left.isInteger() && right.isInteger())
			return new Value(left.asInteger() <= right.asInteger());
		throw new RuntimeException("Solo se puede comparar numeros.");
	}
	
	private Value greaterThan(ParserTCParser.BoolExprContext ctx) {
		Value left = this.visit(ctx.left);
		Value right = this.visit(ctx.right);
		
		if (left.isInteger() && right.isInteger())
			return new Value(left.asInteger() > right.asInteger());
		throw new RuntimeException("Solo se puede comparar numeros.");
	}
	
	private Value greaterEqThan(ParserTCParser.BoolExprContext ctx) {
		Value left = this.visit(ctx.left);
		Value right = this.visit(ctx.right);
		
		if (left.isInteger() && right.isInteger())
			return new Value(left.asInteger() >= right.asInteger());
		throw new RuntimeException("Solo se puede comparar numeros.");
	}
	
	@Override public Value visitMultExpr(ParserTCParser.MultExprContext ctx) {
		switch(ctx.op.getType()) {
			case ParserTCParser.MULTI : return multi(ctx);
			case ParserTCParser.DIVI : return divi(ctx);
			case ParserTCParser.MOD : return mod(ctx);
			default: throw new RuntimeException("Simbolo desconocido");
		}
	}
	
	private Value multi(ParserTCParser.MultExprContext ctx) {
		Value left = this.visit(ctx.left);
		Value right = this.visit(ctx.right);
			
		if (left.isInteger() && right.isInteger()) {
			return new Value(left.asInteger() * right.asInteger());
		}
		
		throw new RuntimeException("Combinacion desconocida.");
	}
	
	private Value divi(ParserTCParser.MultExprContext ctx) {
		Value left = this.visit(ctx.left);
		Value right = this.visit(ctx.right);
		
		if (left.isInteger() && right.isInteger()) {
			return new Value(left.asInteger() / right.asInteger());
		}
		
		throw new RuntimeException("Combinacion desconocida.");
	}
	
	private Value mod(ParserTCParser.MultExprContext ctx) {
		Value left = this.visit(ctx.left);
		Value right = this.visit(ctx.right);
			
		if (left.isInteger() && right.isInteger()) {
			return new Value(left.asInteger() % right.asInteger());
		}
		
		throw new RuntimeException("Combinacion desconocida.");
	}

	@Override public Value visitSumExpr(ParserTCParser.SumExprContext ctx) {
		switch(ctx.op.getType()) {
			case ParserTCParser.PLUS : return sum(ctx);
			case ParserTCParser.MINUS : return substract(ctx);
			default: throw new RuntimeException("Simbolo desconocido.");
		}
	}
	
	private Value sum(ParserTCParser.SumExprContext ctx) {
		Value left = this.visit(ctx.left);
		Value right = this.visit(ctx.right);
		
		if (left.isInteger() && right.isInteger())
			return new Value(left.asInteger() + right.asInteger());
		
		if (left.isString())
			return new Value(left.asString() + right.toString());
		
		if (right.isString())
			return new Value(left.toString() + right.asString());
		
		return new Value(left.toString() + right.toString());
	}
	
	private Value substract(ParserTCParser.SumExprContext ctx) {
		Value left = this.visit(ctx.left);
		Value right = this.visit(ctx.right);
		
		if (left.isInteger() && right.isInteger())
			return new Value(left.asInteger() - right.asInteger());
		
		throw new RuntimeException("Combinacion desconocida.");
	}
	
	@Override public Value visitEqExpr(ParserTCParser.EqExprContext ctx) {
		switch(ctx.op.getType()) {
			case ParserTCParser.EQUALS : return eq(ctx);
			case ParserTCParser.NOTEQ : return notEq(ctx);
			default: throw new RuntimeException("Simbolo desconocido.");
		}
	}
	
	private Value eq(ParserTCParser.EqExprContext ctx) {
		Value left = this.visit(ctx.left);
		Value right = this.visit(ctx.right);
		
		if ((left.isBoolean() && right.isBoolean()) ||
			(left.isInteger() && right.isInteger()) ||
			(left.isString() && right.isString()) ||
			(left.isList() && right.isList()))
			return new Value(left.equals(right));
		throw new RuntimeException("No se pueden comparar distintos tipos.");
	}
	
	private Value notEq(ParserTCParser.EqExprContext ctx) {
		Value left = this.visit(ctx.left);
		Value right = this.visit(ctx.right);
		
		if ((left.isBoolean() && right.isBoolean()) ||
			(left.isInteger() && right.isInteger()) ||
			(left.isString() && right.isString()) ||
			(left.isList() && right.isList()))
			return new Value(!left.equals(right));
		throw new RuntimeException("No se pueden comparar distintos tipos.");
	}
	
	@Override public Value visitAndOrExpr(ParserTCParser.AndOrExprContext ctx) {
		Value left = this.visit(ctx.left);
		Value right = this.visit(ctx.right);
		
		if (!left.isBoolean() || !right.isBoolean())
			throw new RuntimeException("Ambos deben ser booleanos");
		
		switch(ctx.op.getType()){
			case ParserTCParser.AND : return new Value(left.asBoolean() && right.asBoolean());
			case ParserTCParser.OR : return new Value(left.asBoolean() || right.asBoolean());
			default : throw new RuntimeException("Simbolo desconocido.");
		}
	}
	
	@Override public Value visitNumExpr(ParserTCParser.NumExprContext ctx) {
		return new Value(Integer.valueOf(ctx.getText()));
	}
	
	@Override public Value visitBoolAtomExpr(ParserTCParser.BoolAtomExprContext ctx) {
		return new Value(Boolean.valueOf(ctx.getText()));
	}
	
	@Override public Value visitTextExpr(ParserTCParser.TextExprContext ctx) {
		String str = ctx.getText();
		
		str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
        return new Value(str);
	}
	
	@Override public Value visitParExpr(ParserTCParser.ParExprContext ctx) {
		return this.visit(ctx.inparen);
	}
	
	@Override public Value visitIdExpr(ParserTCParser.IdExprContext ctx) {
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
			if (list.get(index).isBoolean()) return new Value(list.get(index).asBoolean());
			if (list.get(index).isList()) return new Value(list.get(index).asList());
			throw new RuntimeException("Problema de tipos.");
			
		}
	}
	
	@Override public Value visitSetExpr(ParserTCParser.SetExprContext ctx) {
		return visitChildren(ctx); //TODO
	}
	
	@Override public Value visitSetOpExpr(ParserTCParser.SetOpExprContext ctx) {
		return visitChildren(ctx); //TODO
	}
	
	@Override public Value visitListExpr(ParserTCParser.ListExprContext ctx) {
		TPLList list = new TPLList();
		
		if (ctx.exprList() != null)
		{
			for (ParserTCParser.ExpressionContext expr : ctx.exprList().expression()) {
				list.add(this.visit(expr));
			}
		}
		
		return new Value(list);
	}
	
	@Override public Value visitJoinListExpr(ParserTCParser.JoinListExprContext ctx) {
		Value left = this.visit(ctx.left);
		Value right = this.visit(ctx.right);
		
		if (right.isList())
			left.asList().addAll(right.asList());
		else
			left.asList().add(right);
		
		return new Value(left.asList());
	}
	
	@Override public Value visitIndex(ParserTCParser.IndexContext ctx) {
		Value result = this.visit(ctx.val);
		return new Value(result.asInteger());
	}
	
	
	
}

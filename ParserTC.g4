/**
 * Define a grammar called Hello
 */
grammar ParserTC;


listStmt : stmt SEMICOLON (stmt SEMICOLON)*;

stmt : assign | expression | print ;

assign : IDENT ASSIGN_OP expression;

print : PRINT expression;

expression : intExpr | setExpr | listExpr | textExpr | boolExpr;

intExpr : left=intTerm (op=(PLUS | MINUS) right=intExpr)*;

textExpr : left=textTerm (DOT right=textExpr)*;

intTerm : left=intFactor (op=(MULTI | DIVI | MOD) right=intTerm )*;

intFactor : id=IDENT idpos=index?				#idExpr
		  | num=NUM 	 	 					#numExpr
		  | OP_PAREN inparen=intExpr CL_PAREN   #parExpr
		  | MINUS inminus=intFactor				#unaryExpr
		  ;
		  
setExpr : left=setTerm ( (UNION | INTER | DIFF) right=setExpr)*;

listExpr : left=listTerm (COLON right=listExpr)*; 

listTerm : id=IDENT idpos=index?		#listIdExpr 
		 | list=listExt		#listExtExpr
		 ;

index : OP_BRACK val=intExpr CL_BRACK;

listExt : OP_BRACK (exprList)? CL_BRACK;
		 
setTerm :  IDENT 				     		
		 | setExt 
		 | OP_PAREN setExpr CL_PAREN;

setExt : OP_BRACE (exprList)? CL_BRACE;

exprList : expression (COMMA expression)*;

boolExpr: left=boolTerm ((op=(EQUALS|NOTEQ|LT|LTEQ|GT|GTEQ)) right=boolTerm)*;

boolTerm: id=IDENT				#idBoolExpr
		| BOOLEAN				#boolAtom
		| intExpr				#intBoolExpr
	;

textTerm : TEXT;

PLUS : '+';
MINUS : '-';
MULTI : '*';
DIVI : '/';
MOD : '%';
QUOTE : '\'';
UNION : 'union';
INTER : 'intersection';
DIFF : 'difference';
PRINT : 'print';
SEMICOLON : ';';
DOT : '.';
COMMA : ',';
COLON : ':';
ASSIGN_OP : '=';
EQUALS : '==';
NOTEQ : '!=';
LT : '<';
LTEQ : '<=';
GT : '>';
GTEQ : '>=';
OP_PAREN : '(';
CL_PAREN : ')';
OP_BRACE : '{';
CL_BRACE : '}';
OP_BRACK : '[';
CL_BRACK : ']';

BOOLEAN : 'true'|'false';
IDENT : [a-z]+ ;             // match lower-case identifiers
NUM : [0-9]+;
TEXT : '"' (~["\r\n] | '""')* '"';

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

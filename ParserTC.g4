grammar ParserTC;

listStmt : (stmt SEMICOLON)+;

stmt : assign | expression | print ;

assign : id=IDENT idpos=index? ASSIGN_OP expression;

print : PRINT expression;

expression :  MINUS expr=expression										#unaryExpr
			 | <assoc=right> left=expression POW right=expression		#powExpr
			 | left=expression op=(LT|LTEQ|GT|GTEQ) right=expression	#compExpr
			 | left=expression op=(MULTI|DIVI|MOD) right=expression		#multExpr
			 | left=expression op=(PLUS|MINUS) right=expression			#sumExpr
			 | left=expression op=(EQUALS|NOTEQ) right=expression		#eqExpr
			 | left=expression op=(AND|OR) right=expression				#andOrExpr
			 | left=expression op=DOT right=expression					#strExpr
			 | NUM														#numExpr
			 | BOOLEAN													#boolAtomExpr
			 | TEXT 													#textExpr
			 | OP_PAREN inparen=expression CL_PAREN						#parExpr
			 | id=IDENT idpos=index?									#idExpr
			 | OP_BRACE (exprList)? CL_BRACE							#setExpr
			 | left=expression op=(UNION|INTER|DIFF) right=expression	#setOpExpr
			 | OP_BRACK (exprList)? CL_BRACK							#listExpr
			 | left=expression COLON right=expression					#joinListExpr
			 ; 
			 
index : (OP_BRACK val=expression CL_BRACK)+;

exprList : expression (COMMA expression)*;


PLUS : '+';
MINUS : '-';
MULTI : '*';
DIVI : '/';
MOD : '%';
POW : '^';
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
AND : '&&';
OR : '||';
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
IDENT : [a-zA-Z]+ ;             // match lower-case identifiers
NUM : [0-9]+;
TEXT : '"' (~["\r\n] | '""')* '"';
WS : [ \t\r\n]+ -> skip ;

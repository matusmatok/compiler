grammar Grammar;

init
	: stat EOF
	;
	
stat
	: (procDef | body)*
	;
	
procDef
	: functionDef varType ID LParen defParams RParen LCurBracket body* RCurBracket SC
	;
	
body
	:statbody
	;
	
statbody
	: IF LParen logicalExpr RParen THEN LCurBracket internalbody RCurBracket (elsebody)? 		#If
	| WHILE LParen logicalExpr RParen LCurBracket internalbody RCurBracket					#While
	| varType ID LBracket expr RBracket SC									#ArrayDef
	| varType ID SC						            						#VarDef
	| ID LBracket expr RBracket ASSIGN expr	SC								#ArrayAssign
	| ID ASSIGN expr SC														#VarAssign
	| RETURN expr SC														#return
	| expr SC																#directExpr
	;

internalbody	
	: body*
	;

elsebody
	: ELSE LCurBracket internalbody RCurBracket
	;

logicalExpr
	: expr										#ExprToLogic
	| expr op=(EQ|NEQ|LEQ|GEQ|LT|GT) expr		#LogicalOp
	| LParen logicalExpr RParen					#Parens
	| NEG logicalExpr							#Negation
	| logicalExpr op=(AND|OR) logicalExpr		#AndOr
	| TRUE										#True
	| FALSE										#False
	;

expr											
	: expr op=(ADD|SUB) term					#AdditiveOp
	| term										#GetTerm
	;
	
term 
	: term op=(MUL|DIV) factor	#MultiplicativeOp
	| factor					#GetFactor
	;

factor 
	: factor SQR power			#PowerOp
	| power						#getPower
	;
	
power
	: ID LParen params RParen		#FunctionCall
	| ID 							#Var
	| ID LBracket expr RBracket		#Array
	| NUM				   			#Number
	| SUB expr						#UnaryMinus
	| LParen expr RParen			#Brackets
	| STRING						#String
	| CHARACTER						#Character
	;

params
	:(ID (COMMA ID)*)?
	;
	
defParams
	:(varType ID (COMMA varType ID)*)?
	;

functionDef: 'funkcia';
RETURN: 'vrat';
IF: 'ak';
THEN: 'tak';
ELSE: 'inak';
WHILE: 'kym';
SC: ';';
COMMA: ',';
LParen: '(';
RParen: ')';
LCurBracket: '{';
RCurBracket: '}';
LBracket: '[';
RBracket: ']';
DCIS: 'dcis';
KCIS: 'kcis';
BOOL: 'ph';
CHAR: 'znak';
STR: 'retaz';
TRUE: 'prauda';
FALSE: 'loz';
ASSIGN: '=';
AND: '&';
OR: '|';
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
SQR: '^';
NEG: '!';
EQ: '==';
NEQ: '!=';
LEQ: '<=';
GEQ: '>=';
LT: '>';
GT: '<';

fragment DIGIT
    :    [0-9]
    ;
    
fragment LETTER
    :    [a-zA-Z]
    ;
	
ID
    :    LETTER (LETTER|DIGIT)*
    ; 
	
NUM
    :    DIGIT+
    ;
	
varType
	: DCIS(LBracket RBracket)?|KCIS(LBracket RBracket)?|BOOL(LBracket RBracket)?|CHAR(LBracket RBracket)?|STR(LBracket RBracket)?
	;
	
CHARACTER
    :   '\'' '\\'? [a-zA-Z_0-9 ] '\''
    ;
	
STRING
    :   '"' SCharSequence? '"'
    ;

fragment
SCharSequence
    :   SChar+
    ;

fragment
SChar
    :   ~["\\\r\n]
    |   EscapeSequence
    |   '\\\n'   // Added line
    |   '\\\r\n' // Added line
    ;

fragment
EscapeSequence
    :   '\\' ['"nrt\\]
    ;
	
WS
    :   [ \t]+
        -> skip
    ;
	
NL
    :   (   '\r' '\n'?
        |   '\n'
        )
		-> skip
    ;
	
BlockComment 
    : '/*' .*? '*/' -> skip
    ;
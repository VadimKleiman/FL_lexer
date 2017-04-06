grammar L;
PASS	        :	'skip';
IF	            :	'if';
THEN	        :	'then';
ELSE	        :	'else';
WHILE	        :	'while';
DO	            :	'do';
READ	        :	'read';
WRITE	        :	'write';
BEGIN	        :	'begin';
END	            :	'end';
BOOL	        :	TRUE | FALSE;
fragment TRUE	: 'true';
fragment FALSE	: 'false';
ID	            :	[a-zA-Z_][a-zA-Z0-9_]*;
VALUE           :   '-'? UNSIGNED_INT | '-'? UNSIGNED_FLOAT;
fragment UNSIGNED_INT	:	('0' | '1'..'9' '0'..'9'*);
fragment UNSIGNED_FLOAT	:	('0'..'9')+ '.' ('0'..'9')* Exponent?
			                | '.' ('0'..'9')+ Exponent?
			                | ('0'..'9')+ Exponent;
fragment Exponent	:	('e'|'E') ('+' | '-')? ('0'..'9')+;
ML_COMMENT      : '(*' ('('*? ML_COMMENT | ('('* | '*'*) ~[/*])*? '*'*? '*)' -> skip;
COMMENT         : '//'[^\n\r] ->skip;
ASSIGN	        :	':=';
ADD	            :	'+';
SUB	            :	'-';
MUL	            :	'*';
DIV	            :	'/';
MOD	            :	'%';
POW	            :	'**';
EQ	            :	'==';
L	            :	'<';
G	            :	'>';
LE	            :	'<=';
GE	            :	'>=';
NE	            :	'!=';
OR	            :	'||';
AND	            :	'&&';
LEFT	        :	'(';
RIGHT	        :	')';
SEMICOLON	    :	';';
NL	            :	[ \t\r\n] -> skip;
OTHER	        :	.;

programm : statement EOF;
statement : PASS
            | assignStatement
            | statement SEMICOLON statement
            | writeStatement
            | readStatement
            | selectionStatement;
assignStatement : ID ASSIGN exprStatement;
selectionStatement : WHILE LEFT exprStatement RIGHT DO BEGIN statement END
                    | IF LEFT exprStatement RIGHT THEN statement ELSE BEGIN statement END;
exprStatement : LEFT exprStatement RIGHT
        | <assoc=right> exprStatement POW exprStatement
        | exprStatement op=(MUL | DIV | MOD) exprStatement
        | exprStatement op=(ADD | SUB) exprStatement
        | exprStatement op=(G | GE | L | LE) exprStatement
        | exprStatement op=(EQ | NE) exprStatement
        | exprStatement AND exprStatement
        | exprStatement OR exprStatement
        | BOOL
        | VALUE
        | ID;
writeStatement  : WRITE LEFT exprStatement RIGHT;
readStatement : READ LEFT ID RIGHT;
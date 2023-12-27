lexer grammar SysYLexer;

CONST : 'const';

INT : 'int';

VOID : 'void';

IF : 'if';

ELSE : 'else';

WHILE : 'while';

BREAK : 'break';

CONTINUE : 'continue';

RETURN : 'return';

PLUS : '+';

MINUS : '-';

MUL : '*';

DIV : '/';

MOD : '%';

ASSIGN : '=';

EQ : '==';

NEQ : '!=';

LT : '<';

GT : '>';

LE : '<=';

GE : '>=';

NOT : '!';

AND : '&&';

OR : '||';

L_PAREN : '(';

R_PAREN : ')';

L_BRACE : '{';

R_BRACE : '}';

L_BRACKT : '[';

R_BRACKT : ']';

COMMA : ',';

SEMICOLON : ';';

IDENT : (LETTER | '_') WORD*;

INTEGER_CONST : ('0' | ([1-9] DIGIT*)) | ('0' OCT+) | (('0x' | '0X') HEX+);


WS : [ \r\n\t]+ -> skip;

LINE_COMMENT : '//' .*? '\n' -> skip;

MULTILINE_COMMENT : '/*' .*? '*/'  -> skip;

fragment LETTER : [a-zA-Z] ;
fragment DIGIT : [0-9] ;
fragment WORD : LETTER | DIGIT | '_' ;
fragment OCT : [0-7] ;
fragment HEX : [0-9a-fA-F] ;

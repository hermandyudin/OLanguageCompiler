grammar OLanguage;

// Lexer rules
WS: [ \n\t\r]+ -> skip;
IdentifierToken : [A-Za-z]+;
identifierToken : IdentifierToken;
integerClassToken : 'Integer';
IntegerToken : [0-9]+;
integerToken : IntegerToken;
realClassToken : 'Real';
RealToken : [0-9]+ '.' [0-9]+;
realToken: RealToken;
booleanClassToken : 'Boolean';

// Parser rules
program : classDeclaration* EOF;

classDeclaration : 'class' className ('extends' className)? 'is' memberDeclaration* 'end';

className : (identifierToken | booleanClassToken | realClassToken | integerClassToken) ('[' className ']')?;

memberDeclaration : variableDeclaration
                | methodDeclaration
                | constructorDeclaration;

variableDeclaration : 'var' identifierToken ':' expression;

methodDeclaration : 'method' identifierToken '(' parameters? ')' (':' className)? 'is' body 'end';

parameters : parameterDeclaration (',' parameterDeclaration)*;

parameterDeclaration : identifierToken ':' className;

constructorDeclaration : 'this' '(' parameters? ')' 'is' body 'end';

body : (variableDeclaration | statement)*;

statement : assignment
          | expression
          | whileLoop
          | ifStatement
          | returnStatement;

assignment : identifierToken ':=' expression;

whileLoop : 'while' expression 'loop' body 'end';

ifStatement : 'if' expression 'then' body ('else' body)? 'end';

returnStatement : 'return' expression?;

expression : primary ('.' (identifierToken | 'this') arguments?)*;

arguments : '(' (expression (',' expression)*)? ')';

primary : integerToken
        | realToken
        | booleanLiteral
        | 'this'
        | className;

booleanLiteral : 'true' | 'false';
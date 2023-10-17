grammar OLanguage;

// Lexer rules
WS: [ \n\t\r]+ -> skip;
IdentifierToken : [A-Za-z]+;
identifierToken : IdentifierToken;
isToken : 'is';
endToken : 'end';
extendsToken : 'extends';
openSquareBracketToken : '[';
closeSquareBracketToken : ']';
varToken : 'var';
colonToken : ':';
openParenthesisToken : '(';
closeParenthesisToken : ')';
integerClassToken : 'Integer';
IntegerToken : [0-9]+;
integerToken : IntegerToken;
commaToken : ',';
dotToken : '.';
thisToken : 'this';
assignToken : ':=';
methodToken : 'method';
returnToken : 'return';
realClassToken : 'Real';
RealToken : [0-9]+ '.' [0-9]+;
realToken: RealToken;
whileToken : 'while';
loopToken : 'loop';
booleanClassToken : 'Boolean';
ifToken : 'if';
thenToken : 'then';
elseToken : 'else';
trueToken : 'true';
falseToken : 'false';
classToken : 'class';
// Parser rules
program : classDeclaration* EOF;

classDeclaration : classToken className (extendsToken className)? isToken memberDeclaration* endToken;

className : (identifierToken | booleanClassToken | realClassToken | integerClassToken) (openSquareBracketToken className closeSquareBracketToken)?;

memberDeclaration : variableDeclaration
                | methodDeclaration
                | constructorDeclaration;

variableDeclaration : varToken identifierToken colonToken expression;

methodDeclaration : methodToken identifierToken openParenthesisToken parameters? closeParenthesisToken (colonToken className)? isToken body endToken;

parameters : parameterDeclaration (commaToken parameterDeclaration)*;

parameterDeclaration : identifierToken colonToken className;

constructorDeclaration : thisToken openParenthesisToken parameters? closeParenthesisToken isToken body endToken;

body : (variableDeclaration | statement)*;

statement : assignment
          | expression
          | whileLoop
          | ifStatement
          | returnStatement;

assignment : identifierToken assignToken expression;

whileLoop : whileToken expression loopToken body endToken;

ifStatement : ifToken expression thenToken body (elseToken body)? endToken;

returnStatement : returnToken expression?;

expression : primary (dotToken (identifierToken | thisToken) arguments)*;

arguments : openParenthesisToken (expression (commaToken expression)*)? closeParenthesisToken;

primary : integerToken
        | realToken
        | booleanLiteral
        | thisToken
        | className;

booleanLiteral : trueToken | falseToken;
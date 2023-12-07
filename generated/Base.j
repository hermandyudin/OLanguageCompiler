.class public Base
.super java/lang/Object

.method public <init>()V
aload 0
invokenonvirtual java/lang/Object/<init>()V
return
.end method

.method public result(LInteger;LInteger;)LInteger;

.limit locals 30
.limit stack 30
new Integer
dup
sipush 2
invokespecial Integer/<init>(I)V
astore 3
aload 1
aload 3
invokevirtual Integer/Plus(LInteger;)LInteger;
areturn
.end method

.method public res(LInteger;LInteger;)LInteger;

.limit locals 30
.limit stack 30
aload 1
aload 2
invokevirtual Integer/Minus(LInteger;)LInteger;
areturn
.end method


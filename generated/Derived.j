.class public Derived
.super Base

.field private c LInteger;
.method public <init>()V
.limit locals 30
.limit stack 30
aload 0
invokenonvirtual Base/<init>()V
new Integer
dup
sipush 8
invokespecial Integer/<init>(I)V
astore 1
aload 0
aload 1
putfield Derived/c LInteger;
return
.end method

.method public <init>(LInteger;)V
.limit locals 30
.limit stack 30
aload 0
invokenonvirtual Base/<init>()V
aload 0
aload 1
putfield Derived/c LInteger;
return
.end method

.method public res(LInteger;LInteger;)LInteger;

.limit locals 30
.limit stack 30
aload 1
aload 2
invokevirtual Integer/Minus(LInteger;)LInteger;
areturn
.end method


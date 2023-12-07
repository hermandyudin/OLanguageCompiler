.class public Test
.super java/lang/Object

.method public <init>()V
aload 0
invokenonvirtual java/lang/Object/<init>()V
return
.end method

.method public static main([Ljava/lang/String;)V

.limit locals 30
.limit stack 30
new Base
dup
invokespecial Base/<init>()V
astore 1

new Derived
dup
invokespecial Derived/<init>()V
astore 2

aload 2
astore 1
new Integer
dup
sipush 5
invokespecial Integer/<init>(I)V
astore 3

new Integer
dup
sipush 0
invokespecial Integer/<init>(I)V
astore 4

new Integer
dup
sipush 5
invokespecial Integer/<init>(I)V
astore 5
new Integer
dup
sipush 7
invokespecial Integer/<init>(I)V
astore 6
aload 1
aload 5
aload 6
invokevirtual Base/result(LInteger;LInteger;)LInteger;
astore 3
aload 4
aload 3
invokevirtual Integer/PrintResult(LInteger;)LInteger;
astore 4
new Integer
dup
sipush 6
invokespecial Integer/<init>(I)V
astore 7
aload 2
aload 7
aload 5
invokevirtual Derived/res(LInteger;LInteger;)LInteger;
astore 3
aload 4
aload 3
invokevirtual Integer/PrintResult(LInteger;)LInteger;
astore 4
aload 2
aload 7
aload 5
invokevirtual Derived/result(LInteger;LInteger;)LInteger;
astore 3
aload 4
aload 3
invokevirtual Integer/PrintResult(LInteger;)LInteger;
astore 4
new Integer
dup
sipush 0
invokespecial Integer/<init>(I)V
astore 8
aload 3
aload 8
invokevirtual Integer/Less(LInteger;)LBoolean;
invokevirtual Boolean/GetValue()I
ifeq ElseLabel0
new Integer
dup
sipush 0
invokespecial Integer/<init>(I)V
astore 9
aload 8
astore 3
goto EndLabel1
ElseLabel0:
new Integer
dup
sipush 1
invokespecial Integer/<init>(I)V
astore 10
aload 10
astore 3
EndLabel1:
aload 4
aload 3
invokevirtual Integer/PrintResult(LInteger;)LInteger;
astore 4
return
.end method



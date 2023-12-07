.class public Integer
.super java/lang/Object

.field private value I
.field private Max I
.field private Min I

.method public <init>(I)V
   .limit locals 30
   .limit stack 30

   aload 0
   invokespecial java/lang/Object/<init>()V
   aload 0
   iload 1
   putfield Integer/value I
   return

.end method

.method public Plus(LInteger;)LInteger;
   .limit locals 30
   .limit stack 30
   new Integer
   dup
   aload 0
   getfield Integer/value I
   aload 1
   getfield Integer/value I

   iadd
   invokespecial Integer/<init>(I)V
   areturn

.end method

.method public Minus(LInteger;)LInteger;
   .limit locals 30
   .limit stack 30

   new Integer
   dup
   aload 0
   getfield Integer/value I
   aload 1
   getfield Integer/value I
   isub
   invokespecial Integer/<init>(I)V
   areturn

.end method

.method public Mult(LInteger;)LInteger;
   .limit locals 30
   .limit stack 30
   new Integer
   dup
   aload 0
   getfield Integer/value I
   aload 1
   getfield Integer/value I

   imul
   invokespecial Integer/<init>(I)V
   areturn

.end method

.method public Div(LInteger;)LInteger;
   .limit locals 30
   .limit stack 30
   new Integer
   dup
   aload 0
   getfield Integer/value I
   aload 1
   getfield Integer/value I

   idiv
   invokespecial Integer/<init>(I)V
   areturn

.end method

.method public Rem(LInteger;)LInteger;
   .limit locals 30
   .limit stack 30
   new Integer
   dup
   aload 0
   getfield Integer/value I
   aload 1
   getfield Integer/value I

   irem
   invokespecial Integer/<init>(I)V
   areturn

.end method

.method public PrintResult(LInteger;)LInteger;
   .limit locals 30
   .limit stack 30

   getstatic java/lang/System/out Ljava/io/PrintStream;
   aload 1
   getfield Integer/value I
   invokevirtual java/io/PrintStream/println(I)V
   aload 1
   areturn

.end method

.method public Less(LInteger;)LBoolean;
   .limit locals 30
   .limit stack 30
   new Boolean
   dup
   aload 0
   getfield Integer/value I
   aload 1
   getfield Integer/value I
   if_icmplt LabelTrue
       ldc 0
       goto LabelEnd
   LabelTrue:
       ldc 1
   LabelEnd:
   invokespecial Boolean/<init>(I)V
   areturn

.end method

.method public LessEqual(LInteger;)LBoolean;
   .limit locals 30
   .limit stack 30
   new Boolean
   dup
   aload 0
   getfield Integer/value I
   aload 1
   getfield Integer/value I
   if_icmple LabelTrue
       ldc 0
       goto LabelEnd
   LabelTrue:
       ldc 1
   LabelEnd:
   invokespecial Boolean/<init>(I)V
   areturn

.end method

.method public Greater(LInteger;)LBoolean;
   .limit locals 30
   .limit stack 30
   new Boolean
   dup
   aload 0
   getfield Integer/value I
   aload 1
   getfield Integer/value I
   if_icmpgt LabelTrue
       ldc 0
       goto LabelEnd
   LabelTrue:
       ldc 1
   LabelEnd:
   invokespecial Boolean/<init>(I)V
   areturn

.end method

.method public GreaterEqual(LInteger;)LBoolean;
   .limit locals 30
   .limit stack 30
   new Boolean
   dup
   aload 0
   getfield Integer/value I
   aload 1
   getfield Integer/value I
   if_icmpge LabelTrue
       ldc 0
       goto LabelEnd
   LabelTrue:
       ldc 1
   LabelEnd:
   invokespecial Boolean/<init>(I)V
   areturn

.end method

.method public Equal(LInteger;)LBoolean;
   .limit locals 30
   .limit stack 30
   new Boolean
   dup
   aload 0
   getfield Integer/value I
   aload 1
   getfield Integer/value I
   if_icmpeq LabelTrue
       ldc 0
       goto LabelEnd
   LabelTrue:
       ldc 1
   LabelEnd:
   invokespecial Boolean/<init>(I)V
   areturn

.end method

.class public Boolean
.super java/lang/Object

.field private value I

.method public <init>(I)V
   .limit locals 30
   .limit stack 30

   aload 0
   invokespecial java/lang/Object/<init>()V
   aload 0
   iload 1
   putfield Boolean/value I
   return

.end method

.method public GetValue()I
   .limit locals 30
   .limit stack 30

   aload 0
   getfield Boolean/value I
   ireturn

.end method

.method public Or(LBoolean;)LBoolean;
   .limit locals 30
   .limit stack 30
   new Boolean
   dup
   aload 0
   getfield Boolean/value I
   aload 1
   getfield Boolean/value I

   iadd
   ifeq LabelTrue
   ldc 1
   goto LabelEnd
   LabelTrue:
   ldc 0
   LabelEnd:
   invokespecial Boolean/<init>(I)V
   areturn

.end method

.method public And(LBoolean;)LBoolean;
   .limit locals 30
   .limit stack 30
   new Boolean
   dup
   aload 0
   getfield Boolean/value I
   aload 1
   getfield Boolean/value I

   imul
   invokespecial Boolean/<init>(I)V
   areturn

.end method
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

.class public Test
.super java/lang/Object

.method public <init>()V
aload 0
invokenonvirtual java/lang/Object/<init>()V
return
.end method

.method public main()V

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



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


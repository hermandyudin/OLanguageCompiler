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

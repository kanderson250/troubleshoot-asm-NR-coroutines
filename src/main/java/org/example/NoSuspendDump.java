package org.example;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.RecordComponentVisitor;

/***
 * Output of ASMifier on New Relic weaver + a coroutine not using a suspend function
 */
public class NoSuspendDump implements Opcodes {

    public static byte[] dump () throws Exception {

        ClassWriter classWriter = new ClassWriter(0);
        FieldVisitor fieldVisitor;
        RecordComponentVisitor recordComponentVisitor;
        MethodVisitor methodVisitor;
        AnnotationVisitor annotationVisitor0;

        classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "io/ktor/samples/clientmultipart/MultipartAppKt$main$1$1", "Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;Ljava/lang/Object;>;", "kotlin/coroutines/jvm/internal/SuspendLambda", new String[] { "kotlin/jvm/functions/Function2" });

        classWriter.visitSource("MultipartApp.kt", null);

        classWriter.visitOuterClass("io/ktor/samples/clientmultipart/MultipartAppKt$main$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;");

        {
            annotationVisitor0 = classWriter.visitAnnotation("Lcom/newrelic/api/agent/weaver/Weave;", true);
            annotationVisitor0.visitEnum("type", "Lcom/newrelic/api/agent/weaver/MatchType;", "BaseClass");
            annotationVisitor0.visitEnd();
        }
        {
            annotationVisitor0 = classWriter.visitAnnotation("Lkotlin/coroutines/jvm/internal/DebugMetadata;", true);
            annotationVisitor0.visit("f", "MultipartApp.kt");
            {
                AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("l");
                annotationVisitor1.visitEnd();
            }
            {
                AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("i");
                annotationVisitor1.visitEnd();
            }
            {
                AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("s");
                annotationVisitor1.visitEnd();
            }
            {
                AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("n");
                annotationVisitor1.visitEnd();
            }
            annotationVisitor0.visit("m", "invokeSuspend");
            annotationVisitor0.visit("c", "io.ktor.samples.clientmultipart.MultipartAppKt$main$1$1");
            annotationVisitor0.visitEnd();
        }
        {
            annotationVisitor0 = classWriter.visitAnnotation("Lkotlin/Metadata;", true);
            {
                AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("mv");
                annotationVisitor1.visit(null, new Integer(1));
                annotationVisitor1.visit(null, new Integer(9));
                annotationVisitor1.visit(null, new Integer(0));
                annotationVisitor1.visitEnd();
            }
            annotationVisitor0.visit("k", new Integer(3));
            annotationVisitor0.visit("xi", new Integer(48));
            {
                AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("d1");
                annotationVisitor1.visit(null, "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@");
                annotationVisitor1.visitEnd();
            }
            {
                AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("d2");
                annotationVisitor1.visit(null, "<anonymous>");
                annotationVisitor1.visit(null, "");
                annotationVisitor1.visit(null, "Lkotlinx/coroutines/CoroutineScope;");
                annotationVisitor1.visitEnd();
            }
            annotationVisitor0.visitEnd();
        }
        classWriter.visitInnerClass("io/ktor/samples/clientmultipart/MultipartAppKt$main$1", null, null, ACC_FINAL | ACC_STATIC);

        classWriter.visitInnerClass("io/ktor/samples/clientmultipart/MultipartAppKt$main$1$1", null, null, ACC_FINAL | ACC_STATIC);

        {
            fieldVisitor = classWriter.visitField(0, "label", "I", null, null);
            fieldVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(0, "<init>", "(Lkotlin/coroutines/Continuation;)V", "(Lkotlin/coroutines/Continuation<-Lio/ktor/samples/clientmultipart/MultipartAppKt$main$1$1;>;)V", null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitInsn(ICONST_2);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitMethodInsn(INVOKESPECIAL, "kotlin/coroutines/jvm/internal/SuspendLambda", "<init>", "(ILkotlin/coroutines/Continuation;)V", false);
            methodVisitor.visitInsn(RETURN);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLocalVariable("this", "Lio/ktor/samples/clientmultipart/MultipartAppKt$main$1$1;", null, label0, label1, 0);
            methodVisitor.visitLocalVariable("$completion", "Lkotlin/coroutines/Continuation;", null, label0, label1, 1);
            methodVisitor.visitMaxs(5, 2);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
            {
                annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/jetbrains/annotations/Nullable;", false);
                annotationVisitor0.visitEnd();
            }
            methodVisitor.visitAnnotableParameterCount(1, false);
            {
                annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/jetbrains/annotations/NotNull;", false);
                annotationVisitor0.visitEnd();
            }
            methodVisitor.visitCode();
            Label label0 = new Label();
            Label label1 = new Label();
            methodVisitor.visitTryCatchBlock(label0, label1, label1, "java/lang/Throwable");
            Label label2 = new Label();
            Label label3 = new Label();
            methodVisitor.visitTryCatchBlock(label2, label3, label3, "java/lang/Throwable");
            Label label4 = new Label();
            methodVisitor.visitLabel(label4);
            methodVisitor.visitInsn(ICONST_0);
            methodVisitor.visitVarInsn(ISTORE, 2);
            methodVisitor.visitInsn(ACONST_NULL);
            methodVisitor.visitVarInsn(ASTORE, 3);
            methodVisitor.visitLabel(label0);
            Label label5 = new Label();
            methodVisitor.visitLabel(label5);
            Label label6 = new Label();
            methodVisitor.visitJumpInsn(GOTO, label6);
            methodVisitor.visitLabel(label1);
            methodVisitor.visitVarInsn(ASTORE, 4);
            Label label7 = new Label();
            methodVisitor.visitLabel(label7);
            methodVisitor.visitFieldInsn(GETSTATIC, "com/newrelic/agent/bridge/AgentBridge", "instrumentation", "Lcom/newrelic/agent/bridge/Instrumentation;");
            methodVisitor.visitVarInsn(ALOAD, 4);
            methodVisitor.visitLdcInsn("com.newrelic.instrumentation.labs.kotlin-suspends");
            methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/newrelic/agent/bridge/Instrumentation", "noticeInstrumentationError", "(Ljava/lang/Throwable;Ljava/lang/String;)V", true);
            Label label8 = new Label();
            methodVisitor.visitLabel(label8);
            Label label9 = new Label();
            methodVisitor.visitJumpInsn(GOTO, label9);
            Label label10 = new Label();
            methodVisitor.visitLabel(label10);
            methodVisitor.visitLabel(label9);
            methodVisitor.visitInsn(ICONST_1);
            methodVisitor.visitVarInsn(ISTORE, 2);
            methodVisitor.visitLabel(label6);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitVarInsn(ASTORE, 5);
            methodVisitor.visitVarInsn(ASTORE, 6);
            methodVisitor.visitMethodInsn(INVOKESTATIC, "kotlin/coroutines/intrinsics/IntrinsicsKt", "getCOROUTINE_SUSPENDED", "()Ljava/lang/Object;", false);
            Label label11 = new Label();
            methodVisitor.visitLabel(label11);
            methodVisitor.visitLineNumber(8, label11);
            methodVisitor.visitInsn(POP);
            methodVisitor.visitVarInsn(ALOAD, 6);
            methodVisitor.visitFieldInsn(GETFIELD, "io/ktor/samples/clientmultipart/MultipartAppKt$main$1$1", "label", "I");
            Label label12 = new Label();
            Label label13 = new Label();
            methodVisitor.visitTableSwitchInsn(0, 0, label13, new Label[] { label12 });
            methodVisitor.visitLabel(label12);
            methodVisitor.visitVarInsn(ALOAD, 5);
            methodVisitor.visitMethodInsn(INVOKESTATIC, "kotlin/ResultKt", "throwOnFailure", "(Ljava/lang/Object;)V", false);
            Label label14 = new Label();
            methodVisitor.visitLabel(label14);
            methodVisitor.visitLineNumber(10, label14);
            methodVisitor.visitMethodInsn(INVOKESTATIC, "io/ktor/samples/clientmultipart/MultipartAppKt", "otherWorld", "()V", false);
            Label label15 = new Label();
            methodVisitor.visitLabel(label15);
            methodVisitor.visitLineNumber(11, label15);
            methodVisitor.visitFieldInsn(GETSTATIC, "kotlin/Unit", "INSTANCE", "Lkotlin/Unit;");
            Label label16 = new Label();
            methodVisitor.visitJumpInsn(GOTO, label16);
            methodVisitor.visitLabel(label13);
            methodVisitor.visitLineNumber(8, label13);
            methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
            methodVisitor.visitInsn(DUP);
            methodVisitor.visitLdcInsn("call to 'resume' before 'invoke' with coroutine");
            methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
            methodVisitor.visitInsn(ATHROW);
            methodVisitor.visitLabel(label16);
            Label label17 = new Label();
            methodVisitor.visitLabel(label17);
            methodVisitor.visitVarInsn(ASTORE, 3);
            methodVisitor.visitInsn(ICONST_0);
            methodVisitor.visitVarInsn(ILOAD, 2);
            Label label18 = new Label();
            methodVisitor.visitJumpInsn(IF_ICMPEQ, label18);
            methodVisitor.visitVarInsn(ALOAD, 3);
            methodVisitor.visitInsn(ARETURN);
            methodVisitor.visitLabel(label18);
            methodVisitor.visitLabel(label2);
            methodVisitor.visitVarInsn(ALOAD, 3);
            methodVisitor.visitInsn(ARETURN);
            Label label19 = new Label();
            methodVisitor.visitLabel(label19);
            methodVisitor.visitLabel(label3);
            methodVisitor.visitVarInsn(ASTORE, 4);
            Label label20 = new Label();
            methodVisitor.visitLabel(label20);
            methodVisitor.visitFieldInsn(GETSTATIC, "com/newrelic/agent/bridge/AgentBridge", "instrumentation", "Lcom/newrelic/agent/bridge/Instrumentation;");
            methodVisitor.visitVarInsn(ALOAD, 4);
            methodVisitor.visitLdcInsn("com.newrelic.instrumentation.labs.kotlin-suspends");
            methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/newrelic/agent/bridge/Instrumentation", "noticeInstrumentationError", "(Ljava/lang/Throwable;Ljava/lang/String;)V", true);
            Label label21 = new Label();
            methodVisitor.visitLabel(label21);
            Label label22 = new Label();
            methodVisitor.visitJumpInsn(GOTO, label22);
            Label label23 = new Label();
            methodVisitor.visitLabel(label23);
            methodVisitor.visitLabel(label22);
            methodVisitor.visitVarInsn(ALOAD, 3);
            methodVisitor.visitInsn(ARETURN);
            Label label24 = new Label();
            methodVisitor.visitLabel(label24);
            methodVisitor.visitLocalVariable("this", "Lio/ktor/samples/clientmultipart/MultipartAppKt$main$1$1;", null, label14, label13, 6);
            methodVisitor.visitLocalVariable("$result", "Ljava/lang/Object;", null, label14, label13, 5);
            methodVisitor.visitLocalVariable("weaverError", "Ljava/lang/Throwable;", null, label7, label10, 4);
            methodVisitor.visitLocalVariable("weaverError", "Ljava/lang/Throwable;", null, label20, label23, 4);
            methodVisitor.visitLocalVariable("this", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", null, label5, label19, 0);
            methodVisitor.visitLocalVariable("obj", "Ljava/lang/Object;", null, label5, label19, 1);
            methodVisitor.visitLocalVariable("weaveOriginalReturnValue", "Ljava/lang/Object;", null, label0, label24, 3);
            methodVisitor.visitLocalVariable("weaveThrowableWasThrown", "Z", null, label0, label24, 2);
            methodVisitor.visitMaxs(3, 7);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "create", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;", null);
            {
                annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/jetbrains/annotations/NotNull;", false);
                annotationVisitor0.visitEnd();
            }
            methodVisitor.visitAnnotableParameterCount(2, false);
            {
                annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/jetbrains/annotations/Nullable;", false);
                annotationVisitor0.visitEnd();
            }
            {
                annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Lorg/jetbrains/annotations/NotNull;", false);
                annotationVisitor0.visitEnd();
            }
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitTypeInsn(NEW, "io/ktor/samples/clientmultipart/MultipartAppKt$main$1$1");
            methodVisitor.visitInsn(DUP);
            methodVisitor.visitVarInsn(ALOAD, 2);
            methodVisitor.visitMethodInsn(INVOKESPECIAL, "io/ktor/samples/clientmultipart/MultipartAppKt$main$1$1", "<init>", "(Lkotlin/coroutines/Continuation;)V", false);
            methodVisitor.visitTypeInsn(CHECKCAST, "kotlin/coroutines/Continuation");
            methodVisitor.visitInsn(ARETURN);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLocalVariable("this", "Lio/ktor/samples/clientmultipart/MultipartAppKt$main$1$1;", null, label0, label1, 0);
            methodVisitor.visitLocalVariable("value", "Ljava/lang/Object;", null, label0, label1, 1);
            methodVisitor.visitLocalVariable("$completion", "Lkotlin/coroutines/Continuation;", null, label0, label1, 2);
            methodVisitor.visitMaxs(5, 3);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "invoke", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;)Ljava/lang/Object;", null);
            {
                annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/jetbrains/annotations/Nullable;", false);
                annotationVisitor0.visitEnd();
            }
            methodVisitor.visitAnnotableParameterCount(2, false);
            {
                annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/jetbrains/annotations/NotNull;", false);
                annotationVisitor0.visitEnd();
            }
            {
                annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Lorg/jetbrains/annotations/Nullable;", false);
                annotationVisitor0.visitEnd();
            }
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitVarInsn(ALOAD, 2);
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "io/ktor/samples/clientmultipart/MultipartAppKt$main$1$1", "create", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", false);
            methodVisitor.visitTypeInsn(CHECKCAST, "io/ktor/samples/clientmultipart/MultipartAppKt$main$1$1");
            methodVisitor.visitFieldInsn(GETSTATIC, "kotlin/Unit", "INSTANCE", "Lkotlin/Unit;");
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "io/ktor/samples/clientmultipart/MultipartAppKt$main$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
            methodVisitor.visitInsn(ARETURN);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLocalVariable("this", "Lio/ktor/samples/clientmultipart/MultipartAppKt$main$1$1;", null, label0, label1, 0);
            methodVisitor.visitLocalVariable("p1", "Lkotlinx/coroutines/CoroutineScope;", null, label0, label1, 1);
            methodVisitor.visitLocalVariable("p2", "Lkotlin/coroutines/Continuation;", null, label0, label1, 2);
            methodVisitor.visitMaxs(5, 3);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitTypeInsn(CHECKCAST, "kotlinx/coroutines/CoroutineScope");
            methodVisitor.visitVarInsn(ALOAD, 2);
            methodVisitor.visitTypeInsn(CHECKCAST, "kotlin/coroutines/Continuation");
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "io/ktor/samples/clientmultipart/MultipartAppKt$main$1$1", "invoke", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", false);
            methodVisitor.visitInsn(ARETURN);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLocalVariable("this", "Lio/ktor/samples/clientmultipart/MultipartAppKt$main$1$1;", null, label0, label1, 0);
            methodVisitor.visitLocalVariable("p1", "Ljava/lang/Object;", null, label0, label1, 1);
            methodVisitor.visitLocalVariable("p2", "Ljava/lang/Object;", null, label0, label1, 2);
            methodVisitor.visitMaxs(5, 3);
            methodVisitor.visitEnd();
        }
        classWriter.visitEnd();

        return classWriter.toByteArray();
    }
}


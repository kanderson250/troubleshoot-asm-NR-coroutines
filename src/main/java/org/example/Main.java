package org.example;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

public class Main {
    public static void main(String[] args) {
        byte[] dump = new byte[0];
        try {
            dump = GenerateInvokeSuspends.dump();
        } catch (Exception e) {
            e.printStackTrace();
        }
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
        ClassReader cr = new ClassReader(dump);
        cr.accept(cw, 0);
        cw.toByteArray();
    }
}
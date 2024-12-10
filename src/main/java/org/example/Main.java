package org.example;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

public class Main {
    public static void main(String[] args) {
        byte[] dump;
        try {
            dump = UseSuspendDump.dump();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error generating class file dump");
        }
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
        ClassReader cr = new ClassReader(dump);
        cr.accept(cw, 0);
        cw.toByteArray();
    }
}
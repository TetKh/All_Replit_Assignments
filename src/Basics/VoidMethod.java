package Basics;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

public class VoidMethod {

    public static void main(String[] args) {

        myMethod();
        myMethod();
        myMethod2();
        myMethod3();


    }

    public static void myMethod() {
        System.out.println("*\n" +
                "*   *****\n" +
                "*   *****\n" +
                "*    * *\n" +
                "*     *\n" +
                "*    * *");

    }

    public static void myMethod2() {

        System.out.println("*   *****\n" +
                "*   *****\n" +
                "*\n" +
                "*     *\n" +
                "*     *\n" +
                "*     *");

    }

    public static void myMethod3() {

        System.out.println("*   *****\n" +
                "*   *****\n" +
                "*    * *\n" +
                "*     *\n" +
                "*    * *\n" +
                "*");
    }
}

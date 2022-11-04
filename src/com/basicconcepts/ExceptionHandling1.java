package com.basicconcepts;

public class ExceptionHandling1 {
    public static void method1() {
        try {
            System.out.println("This is Try Block");
        } catch (ArithmeticException e) {
            System.out.println("This is Catch Block");
        } finally {
            System.out.println("This is Finally Block");
        }
    }

    public static void method2() {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("This is Catch Method");
        } finally {
            System.out.println("This is Finally Block");
        }
    }

    public static void method3() {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println(10 / 0);
        } finally {
            System.out.println("This is Finally Block");
        }
    }


    public static void main(String[] args) {
        method1();
        System.out.println();
        method2();
        System.out.println();
        method3();
    }
}

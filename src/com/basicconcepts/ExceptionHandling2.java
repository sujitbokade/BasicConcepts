package com.basicconcepts;

public class ExceptionHandling2 {
    public void a() throws InterruptedException {
        System.out.println("Sleeping Mode");
        Thread.sleep(3000);
        System.out.println("Sleeping Mode");
    }

    public void b() throws InterruptedException {
        a();
    }

    public void c() throws InterruptedException {
        b();
    }

    public static void main(String[] args) {
        ExceptionHandling2 ex = new ExceptionHandling2();
        try {
            ex.c();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

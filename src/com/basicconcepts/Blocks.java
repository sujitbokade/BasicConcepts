package com.basicconcepts;

public class Blocks {
    //Instance Executed During Object Creation
    //Instance Block Common to all Objects
    {
        System.out.println("This is Instance Block");
    }

    //During .class file Loading Static Block Executed Automatically
    static {
        System.out.println("This is static Block");
    }

    public static void main(String[] args) {
        new Blocks();
    }
}

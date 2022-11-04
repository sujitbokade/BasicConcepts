package com.basicconcepts;

public class Variables {
    int a = 10; // Instance Variable
    public static int b = 20; //Static Variable

    void display() {
        int c = 15;  //Local Variable
        System.out.println(c);
    }

    public static void main(String[] args) {
        Variables variables = new Variables();
        System.out.println(variables.a);
        System.out.println(b);
        variables.display();
    }
}

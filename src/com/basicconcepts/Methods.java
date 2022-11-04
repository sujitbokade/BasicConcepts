package com.basicconcepts;

public class Methods {
    //Non-static Method
    public void display(){
        System.out.println("This is Non Static Method");
    }

    //Static Method
    public static void print(){
        System.out.println("This is Static Method");
    }

    public static void main(String[] args) {
        Methods methods = new Methods();
        methods.display();        //Access non-static method using object

        print();  //Static Method Access Directly Same class & Outside the class by using Class Name
    }
}

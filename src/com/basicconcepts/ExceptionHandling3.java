package com.basicconcepts;
class InvalidAgeException extends RuntimeException
{
    InvalidAgeException(String str){
        super(str);
    }
}

public class ExceptionHandling3 {
    public static void status(int age) {
        if (age > 21) {
            System.out.println("Eligible For Marriage");
        } else {
            throw new InvalidAgeException("Not Eligible");
        }
    }

    public static void main(String[] args) {
        ExceptionHandling3 ex = new ExceptionHandling3();
        ex.status(15);
    }
}

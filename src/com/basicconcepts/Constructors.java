package com.basicconcepts;

public class Constructors {
    Constructors(int a) {
        System.out.println("One Argument Constructor");
    }

    Constructors() {
        System.out.println("0 Arg Constructor");
    }

    void display() {
        System.out.println("This is Method");
    }

    public static void main(String[] args) {
        Constructors constructors = new Constructors();
        Constructors constructors1 = new Constructors(5);
        constructors.display();
        constructors1.display();

    }
}
 /*Constructors ---> Class Name
 constructors---->reference Variable(Object Name)
  new --------> keyword (used to create Object)
  Constructors --->Constructor */

/*Rules to declare Constructor
1)Constructor Name & Class Name must be Same
2)Constructor Able to take Parameters
3)Constructor Not Allowed Returns Types
*/

/*Types of Costructors
1)Default Constructor
2)User Defined Constructor
 */
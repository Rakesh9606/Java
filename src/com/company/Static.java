package com.company;


import java.lang.reflect.Method;

public class Static
{


    // Constructor of the class StaticBlock
    Static()
    {
        System.out.println("Inside the constructor of the class.");
    }

    // print method of the StaticBlock class
    public static void print()
    {
        System.out.println("Inside the print method.");
    }

    static
    {
        System.out.println("Inside the static block.");
    }

    // main method
    public static void main(String[] args)
    {

// instantiating the class StaticBlock
        Static sbObj = new Static();
        sbObj.print(); // invoking the print() method

// invoking the constructor inside the main() method
        new Static();


    }
}
/* doubts private
import java.lang.reflect.Method;

class A {
    private void display()
    {
        System.out.println("private method is invoked");
    }
}

public class PrivateExample4{
    public static void main(String[] args)throws Exception{

        Class c = Class.forName("A");
        Object o= c.newInstance();
        Method m =c.getDeclaredMethod("display", null);
        m.setAccessible(true);
        m.invoke(o, null);
    }
}

 */
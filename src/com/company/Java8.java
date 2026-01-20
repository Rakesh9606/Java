package com.company;

import java.util.Arrays;
import java.util.List;
/* 
concise and minimal code 
functional programing benifits 
to enable parrallle programing . more compatible codde for multi core processors

Lambda Expressions: It is used to implement functional programming.Anonomous function , fun without name 

Benefits of Lambda Expressions
1. To enable functional programming in Java
2. To make code more readable, maintainable and cocise code 
3. To enable parallel processing
4. JAR file size reduction
5. Elimination of shadow variables

Functional Interfaces: Interfaces with a single abstract method (SAM).
Example

@FunctionalInterface  
interface MyFunctionalInterface {  
    void display();  // Only one abstract method  
} 


Some built-in functional interfaces are:

Runnable
Callable
Predicate
Function
Consumer
Supplier



Stream API: For processing collections in a functional style.
Optional Class: It helps to avoid NullPointerException.
Default and Static Methods in Interfaces: It allows interfaces to have method implementations.
New Date-Time API: It provides better handling of dates and times.
Collectors API: It helps in performing reduction operations on collections.
method and constructor refernce :: operator
foreach method 
*/

/*1st feature of java 8 we can define the method in the interface but it should be def and satic
interface A12{
    default void phone(){
        System.out.println("phone1");
    }

}
class B implements A12{
  public void phone(){
      System.out.println("phone2");//class has more priority than interface bz out will come class oly
  }

}
public class Java8 {
    public static void main(String[] args) {
        B obj = new B();
        obj.phone();
    }
}

 */
/*
interface A100{
    static void phone(){
        System.out.println("phone1");
    }
}
interface B100{
    default void phone(){
        System.out.println("phone2");
    }
}
class C100 implements A100{
    public void phone(){
        System.out.println("phone3");
    }
}
public class Java8 implements B100 {
    public static void main(String[] args) {
        Java8 obj = new Java8();
        obj.phone();
        C100 obj2 = new C100();
        obj2.phone();
        A100.phone();
    }
}
 */
public class Java8 {
    public static void main(String[] args) {
    List<Integer> values = Arrays.asList(1,2,3,4,5);
    values.forEach(i -> System.out.println(i));

    }
}

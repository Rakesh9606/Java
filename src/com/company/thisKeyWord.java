package com.company;
class A{
    int roll;
    String name;
    A(int roll,String name){
        this.roll=roll;
        this.name=name;
    }
    void dis(){
        System.out.println(roll+name);
    }
}
public class thisKeyWord {
    public static void main(String[] args) {
        A obj = new A(1,"rrr");
        obj.dis();
    }
}
/*
this is a reference variable that refers to the current object.
The this keyword can be used to refer current class instance variable or obj.
        If there is ambiguity between the instance variables and parameters,
        this keyword resolves the problem of ambiguity.
        Real usage of this() constructor call
The this() constructor call should be used to reuse the constructor from the constructor.
It maintains the chain between the constructors i.e. it is used for constructor chaining.
 Let's see the example given below that displays the actual use of this keyword.
 The this keyword can also be passed as an argument in the method.
 It is mainly used in the event handling.
 eg=class S2{
  void m(S2 obj){
  System.out.println("method is invoked");
  }
  void p(){
  m(this);
  }
  public static void main(String args[]){
  S2 s1 = new S2();
  s1.p();
  }
}
Application of this that can be passed as an argument:
In event handling (or) in a situation where we have to provide reference of a class to another one.
 It is used to reuse one object in many methods.

 Let's prove that this keyword refers to the current class instance variable. In this program,
 we are printing the reference variable and this, output of both variables are same.
 package com.company;

public class sample {
    void dis(){
        System.out.println(this);
    }
    public static void main(String[] args) {
sample obj = new sample();
        System.out.println(obj);
obj.dis();
    }
}

 */
/*doubt
5) this: to pass as argument in the constructor call
We can pass the this keyword in the constructor also.
It is useful if we have to use one object in multiple classes. Let's see the example:
class B{
  A4 obj;
  B(A4 obj){
    this.obj=obj;
  }
  void display(){
    System.out.println(obj.data);//using data member of A4 class
  }
}

class A4{
  int data=10;
  A4(){
   B b=new B(this);
   b.display();
  }
  public static void main(String args[]){
   A4 a=new A4();
  }
}
==============


 */

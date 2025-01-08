package com.company;
abstract class A1 {
    abstract void customerDetails(int id, String loginHrs);

    void personalDetails(int readingHrs, int sleepingHrs) {
        System.out.println(readingHrs + " \n" + sleepingHrs);
    }
}
class B1 extends A1{
    B1(String name , int age){
        System.out.println(name + " \n" + age);
    }

    void customerDetails(int id , String loginHrs){
        System.out.println(id + " \n"+ loginHrs);
    }
    void personalDetails(int readingHrs, int sleepingHrs){
        System.out.println(readingHrs + " \n" + sleepingHrs);
    }
}
public class abstrct {
    public static void main(String[] args) {
    A1 obj = new B1("suman",22);//abstraction

    obj.customerDetails(1,"3Hrs");
    obj.personalDetails(1,8);

    }
}
/*abstract class and abstract method
package com.company;
abstract class A1{
    abstract void add();
    abstract void sub(int a , int b);
    abstract void mul(int a, int b);
    abstract  void div(int a , int b);
}
 class B1 extends A1{
    void add(){
        int a =1;
         int b=2;
        System.out.println(a+b);
    }
    void sub(int a , int b){
        System.out.println(a-b);
    }
    void mul(int a , int b){
        System.out.println(a*b);
    }
    void div(int a , int b){
        System.out.println(a/b);
    }
}

public class abstrct {
    public static void main(String[] args) {
        B1 obj = new B1();
        obj.add();
        obj.sub(2,1);
        obj.mul(1,2);
        obj.div(2,2);
    }
}

 */








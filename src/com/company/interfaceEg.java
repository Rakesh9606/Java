package com.company;
/*
interface AA{//can have abstract method and normal method and members , it doesnot store any memory in the heap
    int a = 19;//def final static

    void dis();//def pub and abstract

}
class B implements AA{
   public void dis(){
        System.out.println("interface method called");
    }
   public void show(){
        System.out.println("hi");
    }
}

 */

//multiple inheritance using interface
/*
interface abc {
    void swim();
}
interface bc{
    void run();
}
class cc implements abc,bc{
    public void swim(){
        System.out.println();
    }
    public void run(){
        System.out.println();
    }

}

 */


//hieracy
/*
interface d{
    void show();
    void display();
}
class e implements d{

    public void show() {
        System.out.println("show ");
    }
    public void display(){
        System.out.println("display ");
    }
}
class f implements d{

    public void show() {
        System.out.println("show ");
    }
    public void display(){
        System.out.println("display ");
    }
}
public class interfaceEg {
    public static void main(String[] args) {
//        B ob = new B();
//        ob.dis();
//        ob.show();
//        cc obj = new cc();
//        obj.run();
//        obj.swim();


        d obj1 = new e();
        d obj2 = new f();
        obj1.show();
        obj2.display();
        // System.out.println(AA.a);

    }

}

 */

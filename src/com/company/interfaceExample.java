package com.company;
//hieracy
interface rak{
    void dis();
    void display();
}
class sam implements rak{
    public void dis(){
        System.out.println("dis");
    }

    public void display() {
        System.out.println("display");
    }
}
class ram implements rak{
    public void dis(){
        System.out.println("disp");
    }
    public void display() {
        System.out.println("display");
    }
}
public class interfaceExample {
    public static void main(String[] args) {
        sam obj = new sam();

        ram obj1 = new ram();
        obj.dis();
        obj.display();
        obj1.dis();
        obj1.display();

    }
}

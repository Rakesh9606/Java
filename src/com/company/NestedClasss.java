package com.company;

class OuterClass{
    int a ;
    void dispaly(){
        System.out.println("Outer class method ");
    }
    void person(String name , int age){
        System.out.println("name = " + name + " ," +"age = " + age);
    }
    class inerrClass{
        void show(){
            System.out.println("inner class method ");
        }
        void emp(int id , String name , int salary){
            System.out.println("id = " + id + " ," +"name = " + name + " ," + "sal = " + salary);
        }
        void dep(int id , String name){
            System.out.println("id = " + id + " ," + "name = " + name);
        }
        void hr( String name , String location){
            System.out.println("name = " + name + " ," + "location = " + location);
        }
    }
}

public class NestedClasss {
    public static void main(String[] args) {
        OuterClass obj = new OuterClass();
        OuterClass.inerrClass obj1 = obj.new inerrClass();
        obj.dispaly();
        obj.person("Rakesh " , 22);
        obj1.show();
        obj1.emp(1, "sam",45000);
        obj1.dep(333,"admin");
        obj1.hr("manjula","bglr");
    }
}

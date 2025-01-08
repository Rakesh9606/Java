package com.company;
class AAB{
    void add(){
        System.out.println("add");
    }
}
public class AnonomusClass {
    public static void main(String[] args) {
        AAB obj = new AAB(){
            void add(){
                System.out.println("sub");
            }
        };

        obj.add();
    }
}

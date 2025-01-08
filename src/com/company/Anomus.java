package com.company;

abstract class AABA{
    abstract void add(int a , int b);
    abstract void sub(int a , int b);
}
public class Anomus {
    public static void main(String[] args) {
        AABA obj = new AABA(){
            void sub(int a , int b ){
                System.out.println("sub");
            }
           public void add(int a , int b){
                System.out.println(a+b);
            }
        };
        obj.add(1,2);
        obj.sub(2,1);
    }
}

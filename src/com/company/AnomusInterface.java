package com.company;
@FunctionalInterface
//only single method
interface II{
      void details(String name  , String  location);
}

public class AnomusInterface {
    public static void main(String[] args) {
        II obj = (a,b) -> System.out.println("name = " + a + " \n" +"location = " + b);
        obj.details("Rakesh","bglr");
    }
}
/*
interface II{
    int mul(int n  , int  n2, int n3);
}
    II obj = (a,b,c) -> (a*b*c);
    int r = obj.mul(1,1,1);
        System.out.println(r);

 */

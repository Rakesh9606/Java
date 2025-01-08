package com.company;

import java.util.Arrays;
import java.util.List;

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
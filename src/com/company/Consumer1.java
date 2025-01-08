package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//class demo1 implements Consumer<Integer> {
//    public void accept(Integer i){
//        System.out.println(i);
//    }
//}
public class Consumer1 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4);
//        Consumer<Integer> obj = new Consumer<Integer>(){
//            public void accept(Integer i){
//                System.out.println(i);
//            }
//        };Anonomus class

//        Consumer<Integer> obj = i -> System.out.println(i);//3.lamda expersion
//        values.forEach(obj);

        //values.forEach(i -> System.out.println(i));//reduced program of above
    }
}


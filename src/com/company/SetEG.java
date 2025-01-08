package com.company;

import java.util.*;

//list has more inbuilt methods than set
//collection of unique elements, no order no index -set
//types
// hashset - unorder ,hash table , no dup, fast for add remove and cahecking ,used for add and remove ,eg- no order
//treeset - o , red black tree , no dup , slower ,used for serching eg - well orgaised
//linkedhashset - o , h table and linked llist for storage , no dup , fast like hashset eg - check for dup , output come in same order as we enter
public class SetEG {
    public static void main(String[] args) {
        System.out.println("hi");
        Set<String> fruits = new HashSet<>();//output no order
        fruits.add("Apple");
        fruits.add("apple");
        fruits.add("Mango");
        fruits.add("KIwi");
        System.out.println(fruits);

        Set<Integer> number = new TreeSet<>();//output in sorted order
        number.add(1);
        number.add(10);
        number.add(2);
        number.add(7);
        System.out.println(number);

        Set<Integer> number1 = new LinkedHashSet<>();//output inserction order
        number1.add(1);
        number1.add(10);
        number1.add(2);
        number1.add(7);
        System.out.println(number1);














    }
}

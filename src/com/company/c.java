package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class c {
    public static void main(String[] args) {
//        Collection<Integer>  obj = new ArrayList<Integer>();
//        obj.add(10);
//        obj.add(20);
//        System.out.println(obj);
        /*
        Collection<String>  obj = new ArrayList<String>();
        obj.add("rakesh");
        obj.add("sam");
        System.out.println( "Names =" + obj);

         */
        List<Integer> intList = new ArrayList<>(); // Empty `List`
        intList.add(4); // 4
        intList.add(6); // 4, 6
        intList.add(3); // 4, 6, 3
        intList.set(1, 3); // 4, 3, 3

        int a = intList.get(2); // a = 3
        int b = intList.indexOf(3); // b = 1

        List<Integer> subIntList = intList.subList(1,3); // subIntList -> 3, 3

        for (Integer number: subIntList) {
            System.out.println(number);
        }




    }
}



//list sequentiial
//[] list can repeat =duplicate ,  index  , maintains the insertion order
//{}  set ,unique , no order


































/*
    The Collection in Java is a framework that provides an architecture
        to store and manipulate the group of objects.
        Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.

        Java Collection means a single unit of objects. Java Collection framework provides many interfaces (Set, List, Queue, Deque) and classes
        (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).
        What is Collection in Java?
        A Collection represents a single unit of objects, i.e., a group.
h manange
t map can sort items based on the price
 */








































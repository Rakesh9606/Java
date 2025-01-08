package com.company;

import java.util.*;


public class ListEG {
    public static void main(String[] args) {
        /*
        List obj = new ArrayList();
        obj.add("Rakesh");
        obj.add("Bglr");
        obj.add("Briyani");
        obj.add("Ladakh");
        obj.add("9606127370");
        obj.add("22");
        obj.add("Desert");
        obj.add("Upma");
        obj.add(1,"ooty");
        obj.contains("22");
        obj.get(1);
        obj.indexOf("Ladakh");
        obj.getFirst();
        obj.getLast();

        obj.addFirst("rak");
        System.out.println(obj);

         */
       // obj.addLast("sam");
/*
        List obj1 = new LinkedList();
        obj1.add("Rakesh");
        obj1.add("Sharma");
        obj1.add("Adarsha Vidyalaya");
        obj1.add("Cambridge PU College");
        obj1.add("Dayanad Sagar College of Engg");
        obj1.add("1DS17CS086");
        System.out.println(obj1);
        obj1.add(2,"cs");
        System.out.println(obj1);
        obj1.add(4,"Bglr");
        System.out.println(obj1);
        obj1.remove("Adarsha Vidyalaya");
        System.out.println(obj1);
        obj1.remove(3);
        System.out.println(obj1);

 */










/*
        List obj2 = new Vector();
        obj2.add(90);
        obj2.add(20);
        obj2.add(30);
        obj2.add(40);
        obj2.add(50);
        System.out.println(obj2);
        obj2.remove(2);
        obj2.add(3,60);
        System.out.println("Update 1 "+obj2);
        obj2.add(70);
        obj2.remove(1);
        System.out.println("Update 2 "+obj2);
        obj2.remove(3);
        System.out.println("Update 3 "+obj2);
        Collections.sort(obj2);
        System.out.println("Update 4 "+obj2);

 */
//        obj2.sort((Comparator) obj2);
//        System.out.println(obj2);

        Stack<Integer> stack = new Stack<>();//LIFO
        stack.add(1);
        stack.add(15);
        stack.add(2);
        stack.add(3);
        System.out.println(stack);
        stack.push(11);
        stack.push(4);
        stack.pop();

        System.out.println("after" + stack);






    }
}

package com.company;
//insertion from rare end del from front end = stacks

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
// p q -implements using p heap,
//a q - resizable a q ,
//linked list - uses doubley linked list
public class QueueEG {//FIFO
    public static void main(String[] args) {
        System.out.println("hi");
        Queue<String> queue = new LinkedList<>();
        queue.offer("Apple");
        queue.offer("mango");
        System.out.println(queue);
        queue.poll();//removing elemet from the que
        System.out.println(queue);
        queue.peek();// remove front element
        System.out.println(queue);


        
    }
}

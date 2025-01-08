package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ReverseArray {
    public static void main(String[] args) {
        Integer num[] = {1,2,3,4,5};
       int num1[] = {1,2,3,4,5};
        System.out.println("Original Array");
        for(int i=0;i<num.length;i++){
            System.out.println(num[i] + " ");
        }
        System.out.println("Reverse Array");
        for(int i=num.length-1;i>=0;i--){
            System.out.println(num[i] + " ");
        }
        reverse(num);
        int n= num.length;
        rev(num1, n);

    }
   static void reverse(Integer a[]){
       System.out.println("reverse using Collection");
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }
    static void rev(int a[],int n){
        int b[] = new int[n];
        int j = n;
        for(int i=0;i<a.length;i++){
            b[j-1] = a[i];
            j=j-1;
        }
        System.out.println("reverse using swaping");
        for(int k=0;k<n;k++){
            System.out.println(b[k]);
        }
    }
}

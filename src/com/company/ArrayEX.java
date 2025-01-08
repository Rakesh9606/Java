package com.company;

public class ArrayEX {
    public static void main(String[] args) {

        int num[] = new int[]{1,2,3,4,5};
        for(int i = 0 ; i< num.length;i++){
            System.out.println(num[i]);
        }

        System.out.println();
        double num1[] = new double[]{1.9,2.9,3.9};
        for ( int j=0 ; j< num1.length;j++){
            System.out.println(num1[j]);
        }
        System.out.println();
        double sum = 0;
        for ( int j=0 ; j< num1.length;j++){
            sum += num1[j];
        }
        System.out.println(sum);
        double avg = sum / num1.length;
        System.out.println(avg);


















        //max element in the array
        int a[]= {9,7,1,2,10};
        int max = a[0];
        for ( int i=0 ;i< a.length;i++){
            if (a[i]>max){
                max=a[i];
            }
        }
        System.out.println("max element in the array=" + max);
        //min element in the array
        int a1[]= {9,7,1,2,10};
        int min = a[0];
        for ( int i=0 ;i< a.length;i++){
            if (a[i]<min){
                min=a[i];
            }
        }
        System.out.println("min element in the array=" +min);


    }
}

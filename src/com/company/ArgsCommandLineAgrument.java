package com.company;

public class ArgsCommandLineAgrument {
    public static void main(String[] args) {
//        int a =Integer.parseInt(args[0]);//convert String into integer
//        int b =Integer.parseInt(args[1]);

        String fname = args[0];
        String lname = args[1];

//        System.out.println(args[0]);
//        System.out.println(args[1]);
//        System.out.println(args[2]);
//        System.out.println(args[3]);
        System.out.println(fname + " " + lname);


    }
}

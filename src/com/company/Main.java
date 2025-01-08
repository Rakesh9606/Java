package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* write your code here
        System.out.println("hi");
        int a = 24;//def val = 0 , 4byte
        boolean bol=false;//def val = false ,1bit
        char c = 'R';//def val = 'u0000'  2 byte
        byte b = 2;//def val = 0 , 1 byte
        short s = 4;//def val = 0 , 2 byte
        long l = 35000L;//def val = 0L ,8 byte
        double d = 2222;//def val = 0.0d , 8 byte
        float f = 1.2f;//def val = 0.0f ,  4 byte

        System.out.println(a + " \n" +  a);
        System.out.println(bol);
        System.out.println(c);
        System.out.println(b);
        System.out.println(s);
        System.out.println(l);
        System.out.println(d);
        System.out.println(f);
        */

        //type conversion
        // 2 types - implicit short to long  and explicit long to short value
/*
        int aa = 10;
        long ll = aa;//implicit
        System.out.println(ll);

        float ff = 1.2f;
        int aaa = (int) ff;
        System.out.println(ff);

        int in = 22;
        float fo = in;
        System.out.println(ll);

        double dd = 2222;
        int bb = (int) dd; //explicit
        System.out.println(bb);
        */

        /*operator
        int m = 100;
        int nn = 20;
        System.out.println("addtion= " + (m+nn));
        System.out.println("sub= " + (m-nn));
        System.out.println("multiplicaton = " + (m*nn));
        System.out.println("div = "+ (m/nn));
        System.out.println("mod =" + (m%nn) );
        System.out.println(nn++);
        System.out.println(nn--);
        System.out.println(++nn);
        System.out.println(--nn);*/

        /* relational op is bol either true or false
        int a= 10;
        int b = 20;
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>=b);
        System.out.println(a<=b);*/

         /*logical op
        int a= 10;
        int b = 20;
        System.out.println(a>b && a<b);
        System.out.println(a<b && a>b);
        System.out.println(a>b || a<b);
        System.out.println(a<b || a>b);
        System.out.println(a>b &&  a<b);
        System.out.println(a<b && a>b);*/
         /*
        int aa = 4;
        System.out.println(~a);
        System.out.println(a<<2);
       System.out.println(a>>2);
       bitwise op
      int a =21;
    int b = 96;
       System.out.println(a&b);
       System.out.println(a<<b);
        System.out.println(a>>b);
        System.out.println(a^b);
        System.out.println(a|b);

         */
//        int c =4;
//        int d = 5;
//        System.out.println(c&d);
//
        /*4-12
        //Scanner
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the a val");
//        int a = sc. nextInt();
//        System.out.println("Enter the b val");
//        int b = sc.nextInt();
//        int c = a+b;
        //System.out.println(c);
//        System.out.println("enter the fname");
//        String fname = sc.nextLine();
//        System.out.println("enter the lname");
//        String lname = sc.nextLine();
//        System.out.println("Enter the college name");
//        String col = sc.nextLine();
//        System.out.println("enter the branch");
//        String branch = sc.nextLine();
//     System.out.println("enter the usn");
//     String usn = sc.nextLine();
//        System.out.println("enter the moblie no ");
//        long number = sc.nextLong();
//
//        System.out.println(fname+"\n "+lname+" "+col+" "+branch+" "+number+" "+usn);

        //control statement - flow of excution
        /*decision
        looping
        /*jumpping
         if else loop
         even odd
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number");
//        int a = sc.nextInt();
//        if(a%2==0){
//            System.out.println("number is even");
//        }else {
//            System.out.println("number is odd");
//        }
        */
//if - else -if ladder
       /*
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        System.out.println("enter the number");
        int b = sc.nextInt();
        System.out.println("enter the number");
        int c = sc.nextInt();

        if(a>=b && a>=c){
            System.out.println(a + " is largest");
        }else if(b>=a && b>=c){
            System.out.println(b + " is largest");
        }else {
            System.out.println(c + " is largest");
        }*/

        //nested if else
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        if(a>=b){
//            if(a>=b){
//                System.out.println("A grade");
//            }else{
//                System.out.println("c grade");
//            }
//        }
//        else{
//            if(b>=c){
//                System.out.println("B grade");
//            }else{
//                System.out.println("C grade");
//            }
//        }
/*
        Scanner sc = new Scanner(System.in);
        String grade = sc.nextLine();

        switch(grade) {
            case "A":
                System.out.println("A garde");
                break;
            case "B":
                System.out.println("B grade");
                break;
            case "C":
                System.out.println("C grade");
                break; default:
                System.out.println("fail");
                break;
        }*/

        Scanner sc = new Scanner(System.in);
        int row= sc.nextInt();


        for(int i =row ; i>=1;i--){

            for(int j=row; j>=i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
        }


        /*
        Scanner sc = new Scanner(System.in);
        int row= sc.nextInt();
        int col= sc.nextInt();

        for(int i =1 ; i<=row;i++){

            for(int j=2*(row-i);j>=0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" *");

            }

            System.out.println();
        }

         */
        /* palindrome using iteration
        int n= 454;
        int rev=0,rem,temp;
        temp = n;
        while (n>0) {
            rem = n % 10;//getting rem
            rev = (rev * 10) + rem;
            n = n / 10;
        }
        if(temp==rev){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        */
        /* plai using recursion
        int n = 121;
        int rev = 0, rem, temp;
        if(getReverse(n,rev)==n){
            System.out.println("yyyy");
        }else{
            System.out.println("nn");
        }
    }

    private static int getReverse(int n, int rev) {
        if(n==0)
            return rev;
        int rem= n%10;
        rev = rev*10+rem;
        return getReverse(n/10,rev);
    }

         */
/*plai using stringbulider
String string = "madam";
        System.out.println(getPlai(string.toLowerCase()));

    }
    static boolean getPlai(String string){
        String rev = new StringBuilder(string).reverse().toString();
        return string.equals(rev);
    }

 */

        
    }
}





















































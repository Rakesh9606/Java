package com.company;

public class JavaProgram {
    private static int count;

    JavaProgram(){
        count++;
    }

    public static void main(String[] args) {
        System.out.println("hi");
        JavaProgram obj = new JavaProgram();
        JavaProgram obj1 = new JavaProgram();
        System.out.println(JavaProgram.count);
    }
}
/*copy of 1 array to another
int a[]= new int[]{1,2,3};
        int b[]= new int[a.length];
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        System.out.println("original array =");
        for(int i = 0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
        System.out.println("dup array =");
        for(int i = 0;i<a.length;i++){
            System.out.println(b[i]+" ");
        }

 */
/*
int n=5;
        for(int i=1;i<=n;i++){
            for(int j= 1 ;j<=n;j++){
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print("*");}
                else System.out.print(" ");
            }
            System.out.println();
        }
*****
*   *
*   *
*   *
*****
 */
/*
    int n=5;
        for(int i=1;i<=n;i++){
                for(int j= 1 ;j<=n;j++){
                if(i==j || i+j==n+1){
                System.out.print(" *");}
                else System.out.print(" ");
                }
                System.out.println();
                }
 *    *
  *  *
   *
  *  *
 *    *
 */
/*
    int n=5;
        for(int i=1;i<=n;i++){
                for(int j= 1 ;j<=n;j++){
                if(j==1 || j==n){
                System.out.print("* ");}
                else System.out.print(" ");
                }
                System.out.println();
                }
*    *
*    *
*    *
*    *
*    *
 */

/*fib
    int n1=0 ;
    int n2 =1;
        System.out.println(n1 +" "+ n2);
                for(int i=2;i<10;i++) {
        int n3 = n1 + n2;
        System.out.print(" "+n3);
        n1 = n2;
        n2 = n3;
        }
 */
   /*
int n=3,m=3;
        for(int i=0;i<n;i++){
                for(int j =0 ; j<=i;j++){
                System.out.print("*");
                }
                System.out.println();
                }
*
**
***
int n=3,m=3;
        for(int i=0;i<n;i++){
            for(int j =2*(n-i) ; j>0;j--){
                System.out.print(" ");
            }
            for(int j =0 ; j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
       *
     * *
   * * *
   int n=3,m=3;
        for(int i=0;i<n;i++){
            for(int j =2*(n-i) ; j>0;j--){
                System.out.print(" ");
            }
            for(int j =0 ; j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
       *
     *  *
   *  *  *
       int n=3,m=3;
        for(int i=n-1;i>=0;i--){
            for(int j =0 ; j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
         *  *  *
         *  *
         *
  int n=3,m=3;
        for(int i=n-1;i>=0;i--){
            for(int j =2*(n-i) ; j>0;j--){
                System.out.print(" ");
            }
            for(int j =0 ; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
         * * *
           * *
             *

    */
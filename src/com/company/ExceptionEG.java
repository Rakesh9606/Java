package com.company;

public class ExceptionEG {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 2;

        int num[]=new int[4];
        try {
            //java.lang.Exception top class

            System.out.println(a/b);
            for(int i = 0 ;i<=4; i++){
                System.out.println(num[i+1]);
            }
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
        catch (ArithmeticException e){
            System.out.println("div by zero error" + e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array size execdes" + e);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("finally");
        }
    }
}


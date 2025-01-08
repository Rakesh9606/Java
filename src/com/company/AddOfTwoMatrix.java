package com.company;

import java.util.Scanner;

public class AddOfTwoMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row and col");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int matrix1[][] = new int[row][col];
        int matrix2[][] = new int[row][col];
        int sumMatrix[][] = new int[row][col];

        System.out.println("Enter the elements for 1st matrix");
        for(int i = 0 ;i<row ;i++){
            for(int j = 0 ; j<col;j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements for 2nd matrix");
        for(int i = 0 ;i<row ;i++){
            for(int j = 0 ; j<col;j++){
                matrix2[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ;i<row ;i++){
            for(int j = 0 ; j<col;j++){
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Print the sum for matrix");
        for(int i = 0 ;i<row ;i++){
            for(int j = 0 ; j<col;j++){
                System.out.print(sumMatrix[i][j] + "  ");
            }
            System.out.println();
        }

    }
}

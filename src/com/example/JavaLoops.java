package com.example;

public class JavaLoops {
    public static void loops(){
        System.out.print("Print even numbers using for loop\n");

        for (int i = 0; i <= 30; i++){
         //if i%2 is equal to zero, the number is even
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }

        System.out.print("\nPrint even numbers using while loop\n");

        int x = 0;
        while(x <= 30){
            System.out.print(x +" ");
            x += 2;
        }
        System.out.print("\nPrint every element inside this multidimensional array using a simple for loop\n");
        int[][] matrix = { {1, 2, 3, 4, 11, 12}, {5, 6, 7, 8, 9, 10} };
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]+ " ");
            }
        }

        System.out.print("\nPrint every element inside this multidimensional array using a for-each loop\n");
        for(int[] arr : matrix) {
            for (int element : arr) {
                System.out.print(element+ " ");
            }
        }


    }
}



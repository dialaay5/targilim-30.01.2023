package com.example;

import java.util.Arrays;

public class JavaArray {
    public static void arrays(){
        int[] numbers = {1, 2, 3, 4, 5};
        String[] cars = {"volvo", "bmv", "mazda", "audi", "ford"};
        //Math.random() * (max - min + 1) + min , the min value is inclusive while the max value is exclusive.

        int rand = (int)(Math.random() * 6) + 0;
        System.out.println(rand);

        cars[rand] = "Opel";
        numbers[rand] = 10;
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(cars));

        int[][] matrix = { {1, 2, 3, 4, 11, 12}, {5, 6, 7, 8, 9, 10} };
        System.out.println(matrix[0][0]);
        System.out.println(matrix[1][0]);

    }
}

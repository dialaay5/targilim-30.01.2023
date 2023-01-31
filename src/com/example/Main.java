package com.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static String strings() {
        Scanner s = new Scanner(System.in);
        System.out.println("Pleas enter two strings:");
        String str1 = s.next()  ;
        String str2 = s.next()  ;
        return ("The length of the first string is :" + str1.length()) + "\nThe length of the second string is :" + str2.length();
    }

    public static int[] arrays() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
        }
        System.out.println(sum1);
        for (int j = 0; j < arr2.length; j++) {
            sum2 += arr2[j];
        }
        System.out.println(sum2);
        if(sum1 > sum2){
            return arr1;
        }
        else {
            return arr2;
        }
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Pleas Enter Your Name:");
        String name = s.next()  ;
        if(name.equals(name.toUpperCase())){
            System.out.printf("Capital\n");
        }
        else if (name.equals(name.toLowerCase())) {
            System.out.printf("lower\n");
        }
        System.out.printf(strings());

        System.out.println("\nPleas Enter A Number:");
        int number = s.nextInt();
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10) + 1;
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if(i == number){
                System.out.println("true\n");
            }
            else {
                System.out.println("false\n");
            }
        }

        System.out.println(Arrays.toString(arrays()));

    }
}
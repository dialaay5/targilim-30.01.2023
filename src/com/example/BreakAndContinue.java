package com.example;

import java.util.Arrays;
import java.util.Random;

public class BreakAndContinue {
    // מצגת 28 עמוד 7 + 8
    public static void project(){
        String[] arr1 = {"tv", "computer", "ipad", "iphone", "tablet"};
        String[] arr2 = {"pizza", "chips", "sandwich", "taco", "hamburger"};

        System.out.println("Break Keyword To arr1:");
        for(int i = 0; i < arr1.length; i++){
            if (arr1[i] == "iphone"){
                System.out.println("The iteration was stop because i chose the element iphone, and it was iterated");
                break;
            }
            System.out.println(arr1[i] + " ");
        }
        System.out.println("\nBreak Keyword To arr2:");
        for(int i = 0; i < arr2.length; i++){
            if (arr2[i] == "sandwich"){
                System.out.println("The iteration was stop because i chose the element sandwich, and it was iterated");
                break;
            }
            System.out.println(arr2[i] + " ");
        }

        System.out.println("\nContinue Keyword To arr1:");
        for(int i = 0; i < arr1.length; i++){
            if (arr1[i] == "iphone"){
                continue;
            }
            System.out.println(arr1[i] + " ");
        }
        System.out.println("\nContinue Keyword To arr2:");
        for(int i = 0; i < arr2.length; i++){
            if (arr2[i] == "sandwich"){
                continue;
            }
            System.out.println(arr2[i] + " ");
        }




    }
}

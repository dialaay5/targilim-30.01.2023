package com.example;

public class JavaOperators {
    public static void fruits(){
        String fruit = "banana";
        switch (fruit) {
            case "apple":
                System.out.println("apple");
                break;
            case "orange":
                System.out.println("orange");
                break;
            case "kiwi":
                System.out.println("kiwi");
                break;
            case "mango":
                System.out.println("mango");
                break;
            default:
                System.out.println("Sorry, can’t find a fruit with that name");
        }
    }
}


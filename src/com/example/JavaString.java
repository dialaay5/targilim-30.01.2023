package com.example;

import java.util.Arrays;

public class JavaString {
    public static void strings(){
        String fullName = "diala,ayoub";
        String[] name = fullName.split(",");
        System.out.println(Arrays.toString(name));
        String firstName = name[0];
        String lastName = name[1];
        System.out.printf("Welcome to the course your first name is %s and your last name is %s\n", firstName,lastName);

        //מצגת 26 עמוד 12
        String text = "Welcome to the course your first name is diala and your last name is ayoub";
        System.out.println("the index where the last name started at is:" + text.indexOf("ayoub"));
        System.out.println(text.replace("diala", ""));
        System.out.println(text.contains("ayoub"));   // true

    }
}


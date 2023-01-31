package com.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaMath {
    public static void maths(){
        int num1 = (int)(Math.random() * 4) + 1;  // 1 to 5
        int num2 = (int)(Math.random() * 4) + 1;  // 1 to 5
        System.out.println(num1);
        System.out.println(num2);
        if(num1 == num2){
            System.out.printf("The numbers are equals with value: %s \n" , num1);
        }
        else{
            System.out.printf("The numbers are not equals, first number value is %s and second number value is %s \n" ,num1, num2);
        }

        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String myFormatedDate = date.format(formatDate);
        System.out.println(myFormatedDate);





    }
}

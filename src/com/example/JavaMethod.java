package com.example;

public class JavaMethod {
    public static int calculator(int Computer,int Screen, int Mouse, int Printer, int Keyboard){
        return (Computer + Screen + Mouse + Printer + Keyboard);
    }

    public static void payment(){
        String payMethod = "cash";
        switch (payMethod) {
            case "cash":
                System.out.println("Please give \"" + calculator(2500,1500,250,500,350) + "\" shekels to the cachier");
                break;
            case "check":
                System.out.println("Please write a check for this amount \"" + calculator(2500,1500,250,500,350) + "\" and give it to the cachier");
                break;
            case "credit card":
                switch (" ") {
                    case "is valid":
                        System.out.println("Your credit card was charged with \"" + calculator(2500,1500,250,500,350) + "\" shekels,thanks for buying");
                        break;

                    case "is not valid":
                        System.out.println("Your credit card is not valid, please try to pay again with a different method");
                        break;
                }
                break;
            default:
                System.out.println("pleas choose one of the payment method");
                break;
        }

    }


}

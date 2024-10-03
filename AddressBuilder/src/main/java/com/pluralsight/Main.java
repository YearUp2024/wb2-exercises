package com.pluralsight;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please provide the following information: ");
        String fullName = userInputs("Full name: ");

        String bStreet = userInputs("Billing Street: ");
        String bCity = userInputs("Bulling City: ");
        String bState = userInputs("Bulling State: ");
        String bZip = userInputs("Bulling Zip: ");

        System.out.println("");

        String sStreet = userInputs("Shipping Street: ");
        String sCity = userInputs("Shipping City: ");
        String sState = userInputs("Shipping State: ");
        String sZip = userInputs("Shipping Zip: ");

        System.out.println("");


        String billingResult = billingFormatting(bStreet, bCity, bState, bZip);
        String shippingResult = shippingFormatting(sStreet, sCity, sState, sZip);

        System.out.println(fullName + "\n");
        System.out.println("Billing Address: " + "\n" + billingResult);
        System.out.println("");
        System.out.println("Shipping Address: " + "\n" + shippingResult);
    }

    public static String userInputs(String input){
        System.out.print(input);
        String userInfo = scanner.nextLine();
        return userInfo;
    }

    public static String billingFormatting(String bStreet, String bCity, String bState, String bZip) {
        String billing = bStreet;
        String otherInfo = bCity + ", " + bState + " " + bZip;
        return billing + "\n" + otherInfo;
    }

    public static String shippingFormatting(String sStreet, String sCity, String sState, String sZip){
        String shipping = sStreet;
        String otherInfo = sCity + ", " + sState + " " + sZip;
        return shipping + "\n" +  otherInfo;
    }
}
package com.pluralsight;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please provide the following information: ");
        String fullName = userInputs("Full name: ");

        StringBuilder billingAddress = appendingToStringBuilder("Billing");
        System.out.println("");
        StringBuilder shippingAddress = appendingToStringBuilder("Shipping");
        System.out.println("");

        System.out.println(fullName);
        System.out.println("");
        System.out.println("Billing Address:\n" + billingAddress.toString());
        System.out.println("");
        System.out.println("Shipping Address:\n" + shippingAddress.toString());
    }

    public static String userInputs(String input){
        System.out.print(input);
        String userInfo = scanner.nextLine();
        return userInfo;
    }

    public static StringBuilder appendingToStringBuilder(String addressType){
        StringBuilder address = new StringBuilder();
        String street = userInputs(addressType + " Street: ");
        String city = userInputs(addressType + " City: " );
        String state = userInputs(addressType + " State: ");
        String zip = userInputs(addressType + " Zip: ");

        address.append(street).append("\n");
        address.append(city).append(", ");
        address.append(state).append(" ");
        address.append(zip);

        return address;
    }
}
package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    static Scanner scanner = new Scanner(System.in);
    public int userSerialNumber(){
        System.out.println("What is the serial number? ");
        int serialNumber = scanner.nextInt();
        return serialNumber;
    }

    public String userModel(){
        System.out.println("What model is the phone? ");
        String model = scanner.nextLine();
        return model;
    }

    public String carrier(){
        System.out.println("Who is the carrier? ");
        String serialNumber = scanner.nextLine();
        return serialNumber;
    }

    public int userPhoneNumber(){
        System.out.println("What is the phone number? ");
        int serialNumber = scanner.nextInt();
        return serialNumber;
    }

    public String userOwner(){
        System.out.println("What is the phone number? ");
        String serialNumber = scanner.nextLine();
        return serialNumber;
    }
}

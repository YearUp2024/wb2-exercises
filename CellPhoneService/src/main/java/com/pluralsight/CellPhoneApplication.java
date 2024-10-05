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
        System.out.println("What is your phone modle? ");
        String model = scanner.nextLine();
        return model;
    }

    public String carrier(){
        System.out.println("Who is the carrier? ");
        String carrier = scanner.nextLine();
        return carrier;
    }

    public String userPhoneNumber(){
        System.out.println("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        return phoneNumber;
    }

    public String userOwner(){
        System.out.println("Who is the owner? ");
        String owner = scanner.nextLine();
        return owner;
    }
}

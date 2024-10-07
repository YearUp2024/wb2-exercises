package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    static Scanner scanner = new Scanner(System.in);
    public static void main(){
        CellPhone cellPhone = userInput();
        printResult(cellPhone);
    }

    public static CellPhone userInput(){
        System.out.println("What is the serial number? ");
        int userSerialNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("What is your phone number? ");
        String userPhoneNumber = scanner.nextLine();

        System.out.printf("What model in the phone? ");
        String userPhoneModel = scanner.nextLine();

        System.out.printf("Who is the carrier? ");
        String userPhoneCarrier = scanner.nextLine();

        System.out.printf(" Who is the owner of the phone? ");
        String owner = scanner.nextLine();

        CellPhone cellPhone = new CellPhone();
        cellPhone.setSerialNumber(userSerialNumber);
        cellPhone.setPhoneNumber(userPhoneNumber);
        cellPhone.setModel(userPhoneModel);
        cellPhone.setCarrier(userPhoneCarrier);
        cellPhone.setOwner(owner);
        return cellPhone;
    }

    public static void printResult(CellPhone cellPhone){
        int serialNum = cellPhone.getSerialNumber();
        String phoneNumber = cellPhone.getPhoneNumber();
        String model = cellPhone.getModel();
        String carrier = cellPhone.getCarrier();
        String owner = cellPhone.getOwner();

        System.out.println("Serial Number: " + serialNum);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Phone Model: " + model);
        System.out.println("Phone Carrier: " + carrier);
        System.out.println("Phone owner: " + owner);
    }
}

package com.pluralsight;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine();

        int indexOfFirstSpace = fullName.indexOf(" ");
        String firstName = fullName.substring(0, indexOfFirstSpace);
        String endingPoint = fullName.substring(indexOfFirstSpace + 1);
        int indexOfSpaceInEndingPart = endingPoint.indexOf(" ");

        String middleName;
        String lastName;

        if(indexOfSpaceInEndingPart < 0){
            middleName = "";
            lastName = endingPoint;
        }else{
            middleName = endingPoint.substring(0, indexOfSpaceInEndingPart);
            lastName = endingPoint.substring(indexOfSpaceInEndingPart + 1);
        }
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);

    }
}
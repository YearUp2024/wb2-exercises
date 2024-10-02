package com.pluralsight;

import java.util.Scanner;

public class FullNameGenerator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        String firstName = userName("First name: ");
        String middleName = userName("Middle name: ");
        String lastName = userName("Last name: ");
        String suffix = userName("Suffix name: ");

        String fullName = userFullName(firstName, middleName, lastName, suffix);
        System.out.println(fullName);
    }

    public static String userName(String input){
        System.out.print(input);
        String name = scanner.nextLine();
        return name;
    }

    public static String userFullName(String firstName, String middleName, String lastName, String suffix){
        String fullName;
        if(middleName.isBlank() && suffix.isBlank()){
            fullName = firstName + " " + lastName;
        }else if(middleName.isBlank()){
            fullName = firstName + " " + lastName + " " + suffix;
        }else if(suffix.isBlank()){
            fullName = firstName + " " + middleName + " " + lastName;
        }else{
            fullName = firstName + " " + middleName + " " + lastName + " " + suffix;
        }
        return fullName;
    }
}
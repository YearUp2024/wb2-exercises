package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

//This function gets users inputs and formats it in a understander and prints it back out. 
public class Reservation {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String userPromptForName = userInput("Please enter your name: ");
        String userPromptForDate = userInput("What date will you be coming (MM/dd/yyyy): ");
        String userPromptForNumberOfTickets = userInput("How many tickets would you like? ");

        LocalDate date = dateFormatting(userPromptForDate);
        String formattedName = nameFormatting(userPromptForName);

        String result = formatting(formattedName, date, userPromptForNumberOfTickets);
        System.out.println(result);
    }

    //This method is getting user inputs
    public static String userInput(String input){
        System.out.print(input);
        String userInput = scanner.nextLine();
        return userInput;
    }

    //This method is formatting the username
    public static String nameFormatting(String name){
        String[] newName = name.split(Pattern.quote(" "));
        String lastName = newName[1];
        String firstName = newName[0];
        return lastName + ", " + firstName;
    }

    //This method is formatting Date
    public static LocalDate dateFormatting(String userPromptForDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate birthDay = LocalDate.parse(userPromptForDate, formatter);
        return birthDay;
    }

    //This method is formatting and returning the code the way it should be printed to the users
    public static String formatting(String userPromptForName, LocalDate date, String userPromptForNumberOfTickets){
        String userName = userPromptForName;
        LocalDate userDate = date;
        int userNumTicket = Integer.parseInt(userPromptForNumberOfTickets);

        if(userNumTicket > 1){
            return userNumTicket + " tickets reserved for " + userDate + " under " + userName;
        }else{
            return userNumTicket + " ticket reserved for " + userDate + " under " + userName;
        }
    }
}
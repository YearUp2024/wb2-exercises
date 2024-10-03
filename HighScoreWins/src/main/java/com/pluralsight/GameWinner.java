package com.pluralsight;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String usersInput = userInput("Please enter game score: ");
        String[] lookingForColon = usersInput.split("[:|]");
        String winner = userWinner(lookingForColon);

        System.out.println(winner);
    }

    public static String userInput(String prompt) {
        System.out.print(prompt);
        String input = scanner.nextLine();
        return input;
    }

    public static String userWinner(String[] input) {
        if(input.length < 4 || input.length > 4){
            return "Invalid input. Try again.";
        }

        String firstStr = input[0];
        String secondStr = input[1];
        int scoreOne = Integer.parseInt(input[2]);
        int scoreTwo = Integer.parseInt(input[3]);

        if (scoreOne > scoreTwo) {
            return "Winner: " + firstStr;
        } else if (scoreOne < scoreTwo) {
            return "Winner: " + secondStr;
        } else {
            return "It's a tie";
        }
    }
}
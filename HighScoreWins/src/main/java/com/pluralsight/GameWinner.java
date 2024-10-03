package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class GameWinner {
    static Scanner scanner = new Scanner(System.in);

//    public static void main(String[] args){
//        String userScores = userInput("Please enter a game score: ");
//        //Home:Visitor|21:9
//
//        int indexOfBar = userScores.indexOf("|");
//
//        String afterBar = userScores.substring(indexOfBar + 1);
//        String[] scores = afterBar.split(Pattern.quote(":"));
//
//        int leftScore = Integer.parseInt(scores[0]);
//        int rightScore = Integer.parseInt(scores[1]);
//
//        boolean isLeftWinner = (leftScore > rightScore);
//
//        String teamString = userScores.substring(0, indexOfBar);
//        String[] teamName = teamString.split(Pattern.quote(":"));
//
//        if(isLeftWinner){
//            System.out.println(teamName[0] + " wins!");
//        }else{
//            boolean isRightWinner = leftScore < rightScore;
//            if(isRightWinner){
//                System.out.println(teamName[1] + " wins!");
//            }else{
//                System.out.println("It's a tie!");
//            }
//        }
//
//        System.out.println(userScores);
//        System.out.println(indexOfBar);
//        System.out.println(afterBar);
//        System.out.println(leftScore);
//        System.out.println(rightScore);
//    }
//    public static String userInput(String prompt) {
//        System.out.print(prompt);
//        String input = scanner.nextLine();
//        return input;
//    }

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
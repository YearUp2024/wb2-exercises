package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();

        int find2 = 0;
        int find4 = 0;
        int find6 = 0;
        int find7 = 0;

        for(int i = 0; i < 100; i++){
            int roll1 = dice1.roll();
            int roll2 = dice2.roll();
            int sum = roll1 + roll2;

            System.out.println("Sum: " + sum);

            if(sum == 2){
                find2++;
            }
            if(sum == 4){
                find4++;
            }
            if(sum == 6){
                find6++;
            }
            if(sum == 7){
                find7++;
            }
        }
        System.out.println("2: " + find2);
        System.out.println("4: " + find4);
        System.out.println("6: " + find6);
        System.out.println("7: " + find7);
    }
}
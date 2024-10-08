package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static Vehicle[] inventory;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static Vehicle[] GetInitialInventory(){
        Vehicle[] inventory = new Vehicle[20];
        inventory[0] = new Vehicle(101121,"Ford Explorer","Red",45000,13500);
        inventory[0] = new Vehicle(101122,"Toyota Camry","Blue",60000,11000);
        inventory[0] = new Vehicle(101123,"Chevrolet Malibu","Black",50000,9700);
        inventory[0] = new Vehicle(101124,"Honda Civic","White",70000,7500);
        inventory[0] = new Vehicle(101125,"Subaru Outback","Green",55000,14500);
        inventory[0] = new Vehicle(101126,"Jeep Wrangler","Yellow",30000,16000);
        return inventory;
    }
}
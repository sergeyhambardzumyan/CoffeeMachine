package com.CoffeeMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter what would you like to drink: ");
        String str = scanner.nextLine();
        String[] arr = str.split(":");

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        CoffeeMachine myDrink = coffeeMachine.makeDrink(new Command(arr));

        System.out.println("Enjoy your Drink");
        System.out.println("You got " + myDrink);

        System.out.println();

    }


}

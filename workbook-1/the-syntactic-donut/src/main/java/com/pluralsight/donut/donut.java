package com.pluralsight.donut;
//We LOVE our delimiters!!!
//we like our indentation
/*
* {} Curly braces
*           Surround:
*               method body
*               class declaration
*               Array intitializer
* [] Square brackets
*           Array declarations
*           Array access
* <> Pointy brackets
*              template parameter lists
* () Parentheses
*           Parameter list for a method
*  ; Semi-colon
*           Ends a statement
 */
import java.util.Scanner;
public class donut {
    static double price = .25;
    public static double getTotalPrice(int numberOfDonuts) {
        return price * numberOfDonuts;
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);


        System.out.print("Welcome! How many donuts do you want? :");
        int numberOfDonuts = inputScanner.nextInt();
        inputScanner.nextLine();
        System.out.println("Your donuts cost:");


        double totalPrice = getTotalPrice(numberOfDonuts);
        System.out.println(totalPrice + " dollars");
        System.out.printf("This is my \nformat string");
        System.out.printf("In dollars, that would be $%.2f", totalPrice);


        System.out.printf("The square root of 5 is %8.15f\n", Math.sqrt(5.0));
    }
}

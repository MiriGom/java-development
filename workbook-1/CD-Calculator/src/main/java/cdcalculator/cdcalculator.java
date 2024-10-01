package cdcalculator;

import java.util.Scanner;

public class cdcalculator {
    public static void main(String[] args){

        double principle;
        double interestRate = 1.75/100;
        int numberOfYears;

        Scanner calculatorScanner = new Scanner(System.in);

        System.out.println("Enter your principle here:");
        principle = calculatorScanner.nextDouble();
        calculatorScanner.nextLine();
    }
}

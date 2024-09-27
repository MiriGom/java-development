package com.pluralsight.financialCalculators;

import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args) {
        //declare variables to hold the input
        double totalInterest = 0.0;
        double principle = 0.0;
        double interestRate = 0.0;
        int termOfLoanInYears = 0;



        // Scanner to read the input
        Scanner calculatorScanner = new Scanner(System.in);

        //read the input
        System.out.println("Enter your principle here:");
        principle = calculatorScanner.nextDouble();
        calculatorScanner.nextLine();

        System.out.println("Enter your interest rate here: ");
        interestRate = calculatorScanner.nextDouble();
        calculatorScanner.nextLine();

        interestRate = interestRate/100;

        System.out.println("Enter your termOfLoanYears here");
        termOfLoanInYears = calculatorScanner.nextInt();
        calculatorScanner.nextLine();

        //Do the math
        double numerator = principle*interestRate/12;


        double a = 1 + interestRate/12;
        double b = - termOfLoanInYears*12;

        double p = Math.pow(a, b);

        double denominator = 1 - p;
        double payment = numerator/denominator;
        //give response
        System.out.println("Your payment is: " + payment );
    }
}

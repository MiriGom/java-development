package financialCalculatorAttempt2;

import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args){

        double totalInterest;
        double principle;
        double interestRate = 0;
        int termOfLoanInYears;

        Scanner calculatorScanner = new Scanner(System.in);

        System.out.println("Enter your principle here: ");
        principle = calculatorScanner.nextDouble();
        calculatorScanner.nextLine();

        System.out.println("Enter your interest rate here: ");
        interestRate =calculatorScanner.nextDouble();
        calculatorScanner.nextLine();

        interestRate = interestRate/100;

        System.out.println("Enter your termOfLoanInYears here: ");
        termOfLoanInYears = calculatorScanner.nextInt();
        calculatorScanner.nextLine();

        double numerator = principle * interestRate/12;

        double a = 1 + interestRate/12;
        double b = - termOfLoanInYears * 12;

        double p = Math.pow(a, b);
        double denominator = 1 - p;
        double payment = numerator/denominator;

        System.out.println("Your payment is: " + payment);

    }
}

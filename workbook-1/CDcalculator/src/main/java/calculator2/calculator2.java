package calculator2;

import java.util.Scanner;

public class calculator2 {
    public static void main(String[] args){
        double deposit;
        double interestRate;
        double numberOfYears;


        Scanner calculatorScanner = new Scanner(System.in);

        System.out.println("Enter your deposit here: ");
        deposit = calculatorScanner.nextDouble();
        calculatorScanner.nextLine();

        System.out.println("Enter your interest rate here: ");
        interestRate =calculatorScanner.nextDouble();
        calculatorScanner.nextLine();
        interestRate = interestRate/100;
        System.out.println("Enter the number of years you plan to pay : ");
        numberOfYears =calculatorScanner.nextDouble();
        calculatorScanner.nextLine();
        double a = 1 + interestRate/12;
        double b = 12 * numberOfYears;
        double p = Math.pow(a, b);

        double answer = p * deposit;


        System.out.println("Your payment is: " + answer);
        System.out.println("Your payment is: " + p);
    }
}

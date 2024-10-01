package calculator3;
import java.util.Scanner;

public class calculator3 {
    public static void main(String[] args){
        double monthlyPayout;
        double interestRate = 0;
        double yearsToPay = 0;

        Scanner calculatorScanner = new Scanner(System.in);
        System.out.println("Enter your deposit here:");
        monthlyPayout = calculatorScanner.nextDouble();
        calculatorScanner.nextLine();

        System.out.println("Enter your interest rate here:");
        interestRate = calculatorScanner.nextDouble();
        calculatorScanner.nextLine();
        interestRate = interestRate/100;
        System.out.println("Enter the number of years to pay here:");
         yearsToPay= calculatorScanner.nextDouble();
        calculatorScanner.nextLine();

        double a = 1 + interestRate;
        double b = - ;
        double p = Math.pow(a, b);
        double numerator = 1 - p;
        double c = numerator / interestRate;
        double answer = monthlyPayout * c * 12;

        System.out.println("Your payment is: " + answer );


    }
}

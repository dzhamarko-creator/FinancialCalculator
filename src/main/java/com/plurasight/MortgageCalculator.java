import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter loan amount: ");
        double P = sc.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double r = sc.nextDouble() / 100;

        System.out.print("Enter loan term (years): ");
        int years = sc.nextInt();

        int n = years * 12;
        double i = r / 12;

        double M = P * (i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1);
        double totalInterest = (M * n) - P;

        System.out.printf("Monthly Payment: $%.2f%n", M);
        System.out.printf("Total Interest: $%.2f%n", totalInterest);
    }
}

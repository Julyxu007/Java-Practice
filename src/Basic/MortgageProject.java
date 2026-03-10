package Basic;

import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principle: ");
        int principle = Integer.parseInt(scanner.nextLine());

        System.out.print("Annual Interest Rate: ");
        double interestRate = scanner.nextDouble();
        double r = interestRate / 100 /12;

        System.out.print("Period (Years): ");
        int years = scanner.nextInt();

        double mathPow = Math.pow(1+r, years *12);
        double mortgage = principle * ((r * mathPow) / (mathPow -1));
        String mortgageCurrency = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageCurrency);
    }
}

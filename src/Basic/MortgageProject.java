package Basic;

import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int principle;
        double interestRate;
        int years;
        while (true) {
            System.out.print("Principle ($1K - $1M): ");
            principle = Integer.parseInt(scanner.nextLine());
            if ( 1000 <= principle && principle <= 1000000) {
                break;
            }
            System.out.println("Enter a number between 1000 and 1000000.");
        }
         while (true) {
             System.out.print("Annual Interest Rate: ");
             interestRate = scanner.nextDouble();
             if (0 < interestRate && interestRate < 30 ) {
                 break;
             }
             System.out.println("Enter a value greater than 0 and less than or equal to 30.");
         }

            double r = interestRate / 100 /12;


         while (true) {
             System.out.print("Period (Years): ");
             years = scanner.nextInt();
             if ( 1 <= years && years <=  30){
                 break;
             }
             System.out.println("Enter a value between 1 and 30");
         }

            double mathPow = Math.pow(1+r, years *12);
            double mortgage = principle * ((r * mathPow) / (mathPow -1));
            String mortgageCurrency = NumberFormat.getCurrencyInstance().format(mortgage);
            System.out.println("Mortgage: " + mortgageCurrency);
        }

    }

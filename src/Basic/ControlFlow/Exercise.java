package Basic.ControlFlow;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();
        boolean fizz = number % 3 == 0;
        boolean buzz = number % 5 == 0;
        boolean fizzbuzz = fizz && buzz;
        if (fizzbuzz) {
            System.out.println("FizzBuzz");
        } else if (fizz) {
            System.out.println("Fizz");
        } else if (buzz){
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }
    }

}

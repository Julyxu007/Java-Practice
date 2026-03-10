package Basic;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.print("Please key in your name: ");
        // byte age = scanner.nextByte();
        String name = scanner.nextLine().trim();
        System.out.println("You are "+ name);




    }

}

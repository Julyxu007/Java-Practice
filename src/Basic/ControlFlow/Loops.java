package Basic.ControlFlow;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //for loop
        for (int i = 0; i < 5; i++){
            System.out.println("----");
        }
        for (int i = 5; i >0; i--){
            System.out.println("/// " + i);
        }


// while loop
        int i = 5;
        while (i > 0){
            System.out.println("=== " + i);
            i--;
        }




        // not sure how many times
        String input = "";
        // better to put scanner outside of the loop
        Scanner scanner = new Scanner(System.in);
        // while true；make sure have a break statement;
        while (true){
            System.out.print("Input: ");
           input = scanner.next().toLowerCase();
           if (input.equals("pass")){
               continue;
           }
           if (input.equals("quit")){
               break;
           }
            System.out.println(input);

        }

    // do while (even if the condition is false, do while loop will at least get executed once)
        do {System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);} while(!input.equals("quit"));

        // break and continue
      // break terminate the loop; continue moves to the beginning of the loop

     //for each loop

        String[] fruits = {"apple", "pear", "kiwi"};
        for (int j = 0; j < fruits.length; j++) {
            System.out.println(fruits[j]);
        }
        for (String item: fruits){
            System.out.println(item);
        }

    }
}

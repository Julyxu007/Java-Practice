import java.awt.*;
import java.util.Date;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int count = 2;
    public static  void fib(int pre1, int pre2){
      if (count <= 19){
          int newFib = pre1 + pre2;
          System.out.println(newFib);
         pre2 = pre1;
         pre1 = newFib;
          count ++;
          fib(pre1, pre2);
      }else {
          return;
      }


    }

    public static void main(String[] args) {
        System.out.println(0);
        System.out.println(1);
        fib(1, 0);
        
    }
    }

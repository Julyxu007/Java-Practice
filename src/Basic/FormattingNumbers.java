package Basic;

import java.text.NumberFormat;

public class FormattingNumbers {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
       String result=  currency.format(1234.455);
        System.out.println(result);
        // method chaining
      String percent =  NumberFormat.getPercentInstance().format(0.56);
        System.out.println(percent);

    }
}

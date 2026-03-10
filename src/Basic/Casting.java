package Basic;

public class Casting {
    public static void main(String[] args) {
        // implicit casting (automatically， small to big)
        // byte > short > int > long
        short x = 1; // 2 bytes
        int y = x + 1 ; // int 4 bytes
     double a = 1.1;
     double b = x + 2;
     int c =  (int) x + 2;


     String m = "1";
     int n = Integer.parseInt(m);
  // Float.ParseFloat; Double.parseDouble
        System.out.println(n);

     String weight = "7.2";
     double weight1 = Double.parseDouble(weight);
    }
}

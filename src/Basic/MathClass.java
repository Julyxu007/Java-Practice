package Basic;

public class MathClass {
    public static void main(String[] args) {
       int a = Math.round(2.3F);
       int result = (int)Math.ceil(2.2);
        System.out.println(result); // 3
        int result1 = (int) Math.floor (2.2);
        System.out.println(result1); // 2


        Math.max (3,5);
        Math.min(3,5);
        double result2 = Math.random(); // (0,1]
        double reulst3 = Math.random() * 100; // (0,100];
       int result4 =  (int) Math.floor(Math.random() * 100);
    }
}

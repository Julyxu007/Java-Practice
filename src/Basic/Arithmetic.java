package Basic;

public class Arithmetic {
    public static void main(String[] args) {
        int result = 10+3;
        System.out.println(result);
        double result1 = (double)10 / (double) 3;
        System.out.println(result1);

        int x = 1;
        // first x is assigned to y which is 1; then x itself will be incremented by 1;
        int y = x++;
        System.out.println(x); // 2
        System.out.println(y); // 1


        int a = 1;
        //first increment, then assign;
        int b = ++a;
        System.out.println(a); // 2
        System.out.println(b); // 2
    }
}

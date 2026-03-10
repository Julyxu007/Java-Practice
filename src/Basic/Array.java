package Basic;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers [0] = 5;
        numbers [1] = 9;
        numbers [2] = 3;
        numbers [3] = 6;
        numbers [4] = 5;
        System.out.println(numbers);
        System.out.println(numbers.toString());
        Arrays.sort(numbers);
        System.out.println( Arrays.toString(numbers));
        String[] names = {"July", "Winter"};
        System.out.println(Arrays.toString(names));
        // multi dimensions array
        int[][] numbers1 =  new int[2][3];
        numbers1[0][0] = 1;
        numbers1[0][1] = 2;
        System.out.println(Arrays.deepToString(numbers1));
        //{} each role is an array itself
      int [][]numbers2 = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(numbers2));
      // constant,which means the value cannot be changed
        final float PI = 3.14F;


    }
}

package Chapter7;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int [][] numbers = new int[2][3];
        numbers[0][0] = 3;
        numbers[0][1] = 5;
        numbers[0][2] = 7;
        numbers[1][0] = 8;
        numbers[1][1] = 6;
        numbers[1][2] = 5;

        System.out.println(Arrays.deepToString(numbers));
    }
}

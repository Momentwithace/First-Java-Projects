package Chapter7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PrintingTheElementInAnArray {
    public static void main(String[] args) {
        int [] numbers = new int[5];
        numbers[0] = 4;
        numbers[1] = 2;
        numbers[2] = 7;
        numbers[3] = 8;
        numbers[4] = 4;
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));
    }
}

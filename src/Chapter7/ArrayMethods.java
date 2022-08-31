package Chapter7;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        char[] letters = {'A', 'A', 'A', 'B', 'B', 'C', 'C', 'D', 'E'};
        int count = countOccurrences(letters, 'A');
        System.out.println("Count of A in " + Arrays.toString(letters) + " is " + count);
    }

    private static int countOccurrences(char [] letters, char searchLetter) {
        int count = 0;
        for (char letter : letters){
            if (letter == searchLetter){
                count++;
            }
        }
        return count;
    }
}

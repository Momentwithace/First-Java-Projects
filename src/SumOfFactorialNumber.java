import java.util.Scanner;

public class SumOfFactorialNumber {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int factorial = value.nextInt();
        int i, fact = 1;
        //int number = 0;
        for (i = 1; i <= factorial; i++) {

            fact = fact * i;
        }
        System.out.println("The factorial value is " + fact);

    }
}
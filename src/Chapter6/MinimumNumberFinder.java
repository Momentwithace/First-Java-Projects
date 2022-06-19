package Chapter6;

import java.util.Scanner;

public class MinimumNumberFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three decimal point number seperated by space: ");

        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double result = minimum (number1, number2, number3);

        System.out.println("Minimum Number is: " + result);

    }

    private static double minimum(double number1, double number2, double number3) {
        double minimunNumber = number1;

        if(number2 < minimunNumber){
            minimunNumber = number2;
        }
        if(number3 < minimunNumber){
            minimunNumber = number3;
        }
        return minimunNumber;
    }
}

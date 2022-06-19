package Chapter5;

import java.util.Scanner;

public class HypotenousValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter FirstNumber: ");
        double firstNumber = input.nextDouble();

        System.out.println("Enter SecondNumber: ");
        double secondNumber = input.nextDouble();

        double hypotenousFormula = Math.sqrt(Math.pow(firstNumber, 2) + Math.pow(secondNumber, 2));
        System.out.println("hypotenousValue is \n"+hypotenousFormula);
    }

}

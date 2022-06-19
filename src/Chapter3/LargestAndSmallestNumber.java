package Chapter3;

import java.util.Scanner;

public class LargestAndSmallestNumber {
    int maximum = 0;
    int minimum = 0;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A Number: ");
        int number1 = input.nextInt();
        System.out.println("Enter A Number: ");
        int number2 = input.nextInt();
        System.out.println("Enter A Number: ");
        int number3 = input.nextInt();

        int maximum = number1;
        if(maximum > number2){
            maximum = number2;
        }if (maximum > number3){
            maximum = number3;
        }
        System.out.println("Maximum is: " + maximum);

        int minimum = number1;
        if(minimum < number2){
            maximum = number2;
        }if(minimum < number3){
            minimum = number3;
        }
        System.out.println("Minimum is: " + minimum);


    }
}

package Assignment;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number to play fizzbuzz: ");
        int userInput = input.nextInt();

        if(userInput % 5 == 0 && userInput % 3 == 0) {
            System.out.println("fizzbuzz");
        }
        else if (userInput % 5 == 0){
            System.out.println("buzz");
        }
        else if (userInput % 3 == 0){
            System.out.println("fizz");
        }
        else System.out.println(userInput);

    }
}

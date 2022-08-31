package Assignment;

import java.util.Scanner;

public class SevenSegmentDisplay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number To Be Displayed: ");
        int userInput = input.nextInt();

            switch (userInput) {
                case 0 -> System.out.println("__\n| | \n|__|");
                case 1 -> System.out.println("\n |\n |");
                case 2 -> System.out.println("__\n__|\n|__");
                case 3 -> System.out.println("__\n__|\n__|");
                case 4 -> System.out.println("  \n|__|\n |");
                case 5 -> System.out.println("__\n| \n __|");
                case 6 -> System.out.println("__\n|__ \n|__|");
                case 7 -> System.out.println("__\n |\n  |");
                case 8 -> System.out.println("__\n|__|\n|__|");
                case 9 -> System.out.println("__\n|__|\n __|");


            }




    }



}

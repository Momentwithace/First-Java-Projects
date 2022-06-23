package Assignment;

import java.util.Scanner;

public class GeneratingRandomInteger {
    public static void sleep(){
        for(int i = 0; i < 7; i++) {
            System.out.print(".");
            try {

                Thread.sleep(1000);
            } catch (Exception ignored) {

            }

        }
        System.out.println();
    }
    public static void main(String[] args) {

        int count = 3;
        do{
            int guessNumber = (int) (Math.random() * 20 + 1);
            Scanner input = new Scanner(System.in);
            System.out.println("Guess A Number Between 1 - 5");
            int userInput = input.nextInt();
            System.out.print("Checking your guess number match");
            sleep();

            if(userInput == guessNumber){

                System.out.println("You're Correct");
            }
            else
                System.out.println("You're Wrong!");
                count --;
                System.out.println("You have "+ count+ " attempt left");
        }
        while (count != 0);


    }
}

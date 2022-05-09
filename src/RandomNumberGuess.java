import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuess {
    public static void main(String[] args){
        int answer, guess;
        final int MAX = 10;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        boolean correct = false;
        answer =rand.nextInt(MAX) + 1;
        while (!correct){
        System.out.print("Enter your guess between 1 and 10: ");
       // int in = 7;
        guess = in.nextInt();
        if(guess > answer ){
                System.out.println("Too high, try again");
            }
        else if
            (guess < answer){
                System.out.println("Too low, try again");
            }
        else {
            System.out.println("Yes, your guess number is correct.");
            correct = true;
        }
        }

    }
}

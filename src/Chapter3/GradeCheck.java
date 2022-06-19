package Chapter3;

import java.util.Scanner;

public class GradeCheck {
    public static void main(String[] args) {

        Scanner result = new Scanner(System.in);
        System.out.print("Please enter your score: ");
        int score = result.nextInt();
        if (score > 60) {
            System.out.println("YOU PASSED: ");
        } else {
            System.out.println("YOU FAILED: ");


        }


    }


}




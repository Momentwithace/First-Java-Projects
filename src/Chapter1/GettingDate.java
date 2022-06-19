package Chapter1;

import java.util.Date;
import java.util.Scanner;

public class GettingDate {
    public static void main(String[] args) {
        Scanner userName = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String userInput = userName.next();
        if(userInput.length() != 10)
            System.out.println("Your username shouldn't be less than 10 characters");
        else{
                System.out.println("UserName successfully created");
        }

        Date now = new Date();
        System.out.println(now);
    }
}

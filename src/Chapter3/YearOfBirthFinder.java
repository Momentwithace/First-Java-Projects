package Chapter3;

import java.time.LocalDate;
import java.util.Scanner;

public class YearOfBirthFinder {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("This is a simple program that displays year of birth!!!");
        System.out.println("What's Your Name? ");
        String name = userInput.nextLine();
        while (name.isBlank()){
            System.out.println("Name can not be empty");
            System.out.println("What's Your Name? ");
            name = userInput.nextLine();
        }
        System.out.println("How old are you? ");
        int age = userInput.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("Hello " + name.toUpperCase());
        System.out.println("You were born in " + year);
        if(age < 21){
            System.out.println("You're not an adult!");
        }
        else System.out.println("You're an adult");
        System.out.println("GoodBye");
    }
}

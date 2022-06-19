package Chapter1;

import java.util.Scanner;

public class TakingInputFromUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Gender: ");
        String gender = input.nextLine().trim();
        System.out.print("Age: ");
        int age = input.nextInt();
        System.out.println("Your Name is: " + name);
        System.out.println("You age is: " + age);
        System.out.println("You gender is: " + gender);
    }
}

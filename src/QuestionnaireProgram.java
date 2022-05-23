import java.util.Scanner;

public class QuestionnaireProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Press 1 to create an account\nPress 2 for about us");
        int userInput = input.nextInt();
        if (userInput == 1) {
            System.out.println("What is your First-Name: ");
            String Firstname= input.next();

            System.out.println("What is your Second-Name: ");
            String Secondname = input.next();

            System.out.println("Age:");
            int Age = input.nextInt();

            System.out.println("Gender");
            String Gender = input.next();

            System.out.println("Nationality");
            String Nationality = input.next();

            System.out.println("Marital-Status");
            String Status = input.next();

            System.out.println("Occupation");
            String Occupation = input.next();

            System.out.println("PROFILE CREATED SUCCESSFULLY");
            System.out.printf("FirstName:%s%nSecondName:%s%nAge:%d%nGender:%s%nNationality:%s%nStatus:%s%nOccupation:%s%n",Firstname,Secondname,Age,Gender,Nationality,Status,Occupation);
            System.out.println("This is your program profile");
        }
        else {
            System.out.println("This is just a simple profile creation");
        }
    }
}
package Chapter3;

import Chapter3.Human;

import java.util.Scanner;

public class HumanMain {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

           Human human = new Human(25, "female", "ace", 5, "fair");
         //  Scanner input = new Scanner(System.in);
           System.out.println("Enter your age");
           int userAge = input.nextInt();
           human.setAge(userAge);
           System.out.println("Enter your gender");
           String gender = input.next();
           human.setGender(gender);
           System.out.println("Enter your name:");
           String name = input.next();
           human.setName(name);
           System.out.println("Enter height");
           int height = input.nextInt();
           human.setHeight(height);
           System.out.println("Enter complexion");
           String complexion = input.next();
           human.setComplexion(complexion);
           System.out.printf(" Your age is %d%n Your gender is %s%n Your name is %s%n Your height %d%n Your complexion is %s%n",
                   human.getAge(userAge), human.getGender(gender), human.getName(name), human.getHeight(height), human.getComplexion(complexion));
    }


}

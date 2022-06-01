package Chapter3;

import java.util.Scanner;

public class HealthRecordMain {
    public static void main(String[] args) {
        HealthRecord healthRecord = new HealthRecord("Black", "Ace", "Male",
                1990, 9, 2, 5.0, 6.0);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter FirstName: ");
        String firstName = input.next();
        healthRecord.setFirstName(firstName);
        String Firstname = healthRecord.getFirstName();
        System.out.println("Enter LastName: ");
        String lastName = input.next();
        healthRecord.setLastName(lastName);
        String Lastname = healthRecord.getLastName();
        System.out.println("Enter Gender: ");
        String gender = input.next();
        healthRecord.setGender(gender);
        String Gender = healthRecord.getGender();
        System.out.println("Enter Year: ");
        int year = input.nextInt();
        healthRecord.setYear(year);
        int Year = healthRecord.getYear();
        System.out.println("Enter Month: ");
        int month = input.nextInt();
        healthRecord.setMonth(month);
        int Month = healthRecord.getMonth();
        System.out.println("Enter Day: ");
        int day = input.nextInt();
        healthRecord.setDay(day);
        int Day = healthRecord.getDay();
        System.out.println("Enter Height in Inches: ");
        double height = input.nextDouble();
        healthRecord.setHeightInches(height);
        double Height = healthRecord.getHeightInches();
        System.out.println("Enter Weight in Pounds");
        double weight = input.nextDouble();
        healthRecord.setWeight(weight);
        double Weight = healthRecord.getHeightInches();
        System.out.println("FirstName: "+Firstname);
        System.out.println("LastName: "+ Lastname);
        System.out.println("Gender: "+ Gender);
        System.out.println("Year: "+Year);
        System.out.println("Month: "+Month);
        System.out.println("Enter Day: "+ Day);
        System.out.println("Enter Height:"+ Height);
        System.out.println("Enter: Weight"+Weight);
    }
}

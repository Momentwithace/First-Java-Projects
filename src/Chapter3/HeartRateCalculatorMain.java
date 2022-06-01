package Chapter3;

import java.util.Scanner;

public class HeartRateCalculatorMain {
    public static void main(String[] args) {
        HeartRateCalculator heartCalculator= new HeartRateCalculator("ace", "black", 2020, 9, 2);

        Scanner userInput  = new Scanner(System.in);

        System.out.println("Enter Firstname: ");
        String firstname = userInput.next();
        heartCalculator.setFirstName(firstname);
        String firstName = heartCalculator.getFirstName();

        System.out.println("Enter Lastname: ");
        String lastname = userInput.next();
        heartCalculator.setLastname(lastname);
        String lastName = heartCalculator.getLastname();

        System.out.println("Enter Year: ");
        int year = userInput.nextInt();
        heartCalculator.setYear(year);
        int getYear = heartCalculator.getYear();

        System.out.println("Enter Month: ");
        int month = userInput.nextInt();
        heartCalculator.setMonth(month);
        int getMonth = heartCalculator.getMonth();

        System.out.println("Enter Day: ");
        int day = userInput.nextInt();
        heartCalculator.setDay(day);
        int getDay = heartCalculator.getDay();

        System.out.printf("FirstName: "+firstName);
        System.out.println("LastName: "+lastName);
        System.out.println("Year: "+getYear);
        System.out.println("Month: "+getMonth);
        System.out.println("Day: "+getDay);
        System.out.println(heartCalculator.getMaximumHeartRate());
        System.out.println(heartCalculator.targetHeartRate());
        System.out.println(heartCalculator.targetHeartRate2());

    }
}

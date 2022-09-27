package Chapter7;

import java.util.Scanner;

public class AirLineManagementSystem {
    private static Boolean[] seat = new Boolean[10];
    private static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        String main_menu = ("""
                   Welcome To Semicolon AirWay
                    The Time Is Never A Limit
                    
                    1 -> Book a First-Class
                    2 -> Book a Economy-Class
                    0 -> Exit
                    
                    
                choice>>> """);
        System.out.println(main_menu);
        int sentinel = -1;

        int choice = userInput.nextInt();
        while (sentinel != 0) {
            if (choice == 0) {
                sentinel = choice;
            } else {
                switch (choice) {
                    case 1 -> bookFirstClass(choice);
                    case 2 -> bookEconomy(choice);
                    case 3 -> exitApp();
                }
                validateSeat(choice);
            }
        }


    }

    private static void exitApp() {
        System.exit(0);
    }

    private static void bookEconomy(int choice) {
        validateSeat(choice);

    }

    private static void bookFirstClass(int choice) {
        validateSeat(choice);

    }

    private static void validateSeat(int choice) {
        if (choice == 1) {
            for (int i = 0; i <= 4; i++) {
                if (seat[i] == null) {
                    seat[i] = true;

                    System.out.println("""
                            Welcome To Semicolon AirWay,
                            thanks for counting on us.
                                                        
                            We're glad to have you fly,
                            with us.
                            """);
                    int passengerSeatNumber = i + 1;
                    System.out.println("This is you seat number "
                            + passengerSeatNumber + " You will be flying on a First-Class");
                    System.out.println("Enjoy your flight");
                    System.out.println("Do you want to book again? Yes/No");
                    String response  = userInput.next();
                    if(response == "YES"){

                    }

                } else System.out.println("""
                        Welcome To Semicolon AirWay,
                        thanks for counting on us.
                                                    
                        We're glad to have you fly,
                        with us.
                                                    
                        We're sorry to inform you that,
                        our FirstClass seats are all
                        booked.
                                                    
                        Would you like to join our EconomyClass?
                         1 -> Yes, Will take the economy
                         2 -> No I'm not .
                        Response>>>""");

                int response = userInput.nextInt();
                bookEconomy(response);



            }
        } else if (choice == 2) {
            for (int i = 6; i <= 10; i++) {
                if (seat[i] == null) {
                    seat[i] = true;
                    System.out.println("""
                            Welcome To Semicolon AirWay,
                            thanks for counting on us.
                                                        
                            We're glad to have you fly,
                            with us.
                            """);
                    System.out.println("This is you seat number "
                            + seat[i]);
                    System.out.println("You will be flying with us on a Economy-Class.");
                    System.out.println("Enjoy your flight");

                } else System.out.println("""
                        Welcome To Semicolon AirWay,
                        thanks for counting on us.
                                                    
                        We're glad to have you fly,
                        with us.
                                                    
                        We're sorry to inform you that,
                        our FirstClass seats are all
                        booked.
                                                    
                        Would you like to join our First-Class?
                         1 -> Yes, Will take the economy
                         2 -> No I'm not .
                        Response>>>""");
                int response = userInput.nextInt();
                bookFirstClass(response);
//
            }
        }
    }
}
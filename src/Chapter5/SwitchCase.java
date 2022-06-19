package Chapter5;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){
        System.out.println("Enter 1 for English");
        System.out.println("Enter 2 for Igbo");
        System.out.println("Enter 3 for French");
        System.out.println("Enter 4 for Yoruba");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        switch (number) {
            case 1 -> {
                System.out.println("Enter 1 for data");
                System.out.println("Enter 2 for transfer");
                number = input.nextInt();
                switch (number) {
                    case 1 -> System.out.println("Data");
                    case 2 -> System.out.println("Transfer");
                }
            }
            case 2 -> {
                System.out.println("Enter 1 for sharing");
                System.out.println("Enter 2 for caring");
                number = input.nextInt();
                switch (number) {
                    case 1 -> System.out.println("sharing");
                    case 2 -> System.out.println("caring");
                }
            }
            case 3 -> {
                System.out.println("Enter 1 for Egg");
                System.out.println("Enter 2 for Champagne");
                number = input.nextInt();
                switch (number) {
                    case 1 -> System.out.println("Egg");
                    case 2 -> System.out.println("Champagne");
                }
            }
            case 4 -> {
                System.out.println("Enter 1 for Ewa");
                System.out.println("Enter 2 for Agoyin");
                number = input.nextInt();
                switch (number) {
                    case 1 -> System.out.println("Ewa");
                    case 2 -> System.out.println("Agoyin");
                }
            }
        }


    }

}

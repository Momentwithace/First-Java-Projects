import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){
        System.out.println("Enter 1 for English");
        System.out.println("Enter 2 for Igbo");
        System.out.println("Enter 3 for French");
        System.out.println("Enter 4 for Yoruba");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
                switch (number){
                    case 1:
                        System.out.println("Enter 1 for data");
                        System.out.println("Enter 2 for transfer");
                        number = input.nextInt();
                    switch (number){
                        case 1:
                            System.out.println("Data");
                            break;
                        case 2:
                            System.out.println("Transfer");
                            break;

                    }
                    break;
                    case 2:
                        System.out.println("Enter 1 for sharing");
                        System.out.println("Enter 2 for caring");
                        number = input.nextInt();
                        switch (number){
                            case 1:
                                System.out.println("sharing");
                                break;
                            case 2:
                                System.out.println("caring");
                                break;

                        }
                        break;
                    case 3:
                        System.out.println("Enter 1 for Egg");
                        System.out.println("Enter 2 for Champagne");
                        number = input.nextInt();
                        switch (number){
                            case 1:
                                System.out.println("Egg");
                                break;
                            case 2:
                                System.out.println("Champagne");
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("Enter 1 for Ewa");
                        System.out.println("Enter 2 for Agoyin");
                        number = input.nextInt();
                        switch (number){
                            case 1:
                                System.out.println("Ewa");
                                break;
                            case 2:
                                System.out.println("Agoyin");
                                break;
                        }
                }


    }

}

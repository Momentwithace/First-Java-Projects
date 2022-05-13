import java.util.Scanner;

public class NewUberApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("    Press 1 for English:\n\tPress 2 for Igbo:\n\tPress 3 for French:\n\tPress 4 for Yoruba: ");
        int number = input.nextInt();
        if (number == 1) {
            System.out.println("    Enter 1 for data:\n\tEnter 2 for Transfer: ");
            number = input.nextInt();
            if (number== 1) {
                System.out.println("Data");
            } else {
                System.out.println("Transfer");
            }



        }
        if(number == 2){
            System.out.println("    Enter 1 for sharing:\n\tEnter 2 for caring: ");
            number = input.nextInt();
            if(number == 1){
                System.out.println("sharing");

            }else {
                System.out.println("caring");
            }
        }
        if(number == 3){
            System.out.println("    Enter 1 for Egg:\n\tEnter 2 for Champanye: ");
            number = input.nextInt();
            if(number ==1){
                System.out.println("Egg");
            }else {
                System.out.println("champayne");
            }
        }
        if(number == 4){
            System.out.println("    Enter 1 for Ewa:\n\tEnter 2 for Agoyin: ");
            number = input.nextInt();
            if(number==1){
                System.out.println("Ewa");
            }else{
                System.out.println("Agoyin");
            }
        }
    }
}



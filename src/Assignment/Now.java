package Assignment;

import java.util.Scanner;

public class Now {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                    1 -> exit
                    2 -> main menu
                """);
        int userInput = input.nextInt();
        if(userInput == 1){
            System.exit(1);
        }
        else{
            System.out.println("come");
        }
    }
}

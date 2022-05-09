import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args){

        int result;
       do{
           Scanner loop = new Scanner(System.in);

           System.out.print("Enter First integer number: ");
           int firstNumber = loop.nextInt();

           System.out.print("Enter Second integer number: ");
           int secondNumber = loop.nextInt();

           int sum = firstNumber + secondNumber;
           System.out.println("sum is: " + sum);

           System.out.print("Enter 0 to perform the calculation again or 1 to end calculation: ");
           result = loop.nextInt();

       } while (result == 0);
    }
}



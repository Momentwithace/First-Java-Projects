package Chapter3;

import java.util.Scanner;

    public class PrimeNumberProgram {
        public static void main(String[] args) {
            Scanner number = new Scanner(System.in);
            System.out.println("Enter Number: ");
            int result = number.nextInt();
            int count = 0;

            for (int i = 2; i < result; i++) {

                if (result % i == 0) {
                    count++;
                }
            }

            if(count == 0){
                    System.out.println("The Number Entered Is A Prime Number. ");

                } else {
                    System.out.println("The number is not a prime number. ");
                }

            }
        }



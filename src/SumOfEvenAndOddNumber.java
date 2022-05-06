import java.util.Scanner;

public class SumOfEvenAndOddNumber {
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        int odd = 0;
        int even = 0;

        for(int i = 1; i <= 20; i++){
        if(i%2==0){
            even=even+i;

        }
        else{
            odd = odd+i;
        }

        }
        System.out.println("The sum of the even number between 1 and 20 is "+even);
        System.out.println("The sum of the odd number between 1 and 20 is "+odd);
    }

}

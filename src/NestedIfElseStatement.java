import java.util.Scanner;

public class NestedIfElseStatement {
    public static void main(String[] args) {
        Scanner grade = new Scanner(System.in);
        System.out.println("Please enter result score: ");
        int score = grade.nextInt();
        if(score >= 90){
            System.out.println("A");
            System.out.println("The school is proud of you");
        }
        else{
            if(score >= 80){
            System.out.println("B");
            System.out.println("Impressive");
            }
            else{
                if(score >= 70){
                    System.out.println("C");
                    System.out.println("you can do better");
                }
                else{
                    if(score >= 60){
                        System.out.println("D");
                        System.out.println("Its not to late to adjust");
                    }
                    else{
                        System.out.println("F");
                        System.out.println("Please if theres a way we can assist you in doing better");
                        System.out.println("Kindly send a mail to the school board");
                    }
                }
            }

        }





    }
}

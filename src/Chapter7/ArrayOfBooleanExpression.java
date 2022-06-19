package Chapter7;

import java.util.Objects;
import java.util.Scanner;

public class ArrayOfBooleanExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] firstStatement = new String[2];
        System.out.println("Enter your first word for statement 1");
        firstStatement[0] = input.next();
        System.out.println("Enter your second word for statement 1");
        firstStatement[1] = input.next();
        String[] secondStatement = new String[2];
        System.out.println("Enter your first word for statement 2");
        secondStatement[0] = input.next();
        System.out.println("Enter your second word for statement 2");
        secondStatement[1] = input.next();
        for (int i = 0; i < secondStatement.length; i++) {
            System.out.println(Objects.equals(firstStatement[i], secondStatement[i])) ;

        }
//        if(!Objects.equals(firstStatement[0], secondStatement[0])){
//            System.out.println("False");
//        }else{
//            System.out.println("True");
//        }
//        if(!Objects.equals(firstStatement[1], secondStatement[1])){
//            System.out.println("False");
//        }else{
//            System.out.println("True");
//        }

    }
}

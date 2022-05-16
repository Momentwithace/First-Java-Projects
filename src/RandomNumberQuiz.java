import java.util.Random;
import java.util.Scanner;

public class RandomNumberQuiz {
    static Scanner number = new Scanner(System.in);
    private static int correct = 0;
    private static int wrong = 0;
    private static int correctAnswer = 0;
    static Random getRandom = new Random();

    int userInput;

    public static void main(String[] args) {
        createTest();
    }



    public static void createTest() {
        System.out.println("Enter Number of Question you wish to Answer: ");
        int userInput = number.nextInt();
        String operators = "*+-/%";


        int i =1;
        while (i <= userInput) {
            int firstNumber = (int) (Math.random() * 20 + 1);
            int secondNumber = (int) (Math.random() * 20 + 1);
            char operator = operators.charAt(getRandom.nextInt(operators.length()));
            System.out.printf("%2d %c %2d = ", firstNumber, operator, secondNumber);
            int userAnswer = number.nextInt();
            switch (operator) {
                case '+' -> correctAnswer = firstNumber + secondNumber;
                case '-' -> correctAnswer = firstNumber - secondNumber;
                case '*' -> correctAnswer = firstNumber * secondNumber;
                case '/' -> correctAnswer = firstNumber / secondNumber;
                case '%' -> correctAnswer = firstNumber % secondNumber;
            }
            if (userAnswer == correctAnswer) correct++;
            else wrong++;
            i++;
        }
        System.out.println("you got "+correct+" right and "+wrong+" wrong");
        System.out.println("your score is "+ (correct-wrong));
//        System.out.println("0: To Restart");
////        int userInput = number.nextInt();
////        switch (userInput){
////            if(userInput = 0)createTest();
////        }

    }
}

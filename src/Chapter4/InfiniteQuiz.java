package Chapter4;

import java.util.Random;
import java.util.Scanner;

public class InfiniteQuiz {

        static Scanner number = new Scanner(System.in);
        private static int correct = 0;
        private static int wrong = 0;
        private static int correctAnswer = 0;
        static Random getRandom = new Random();

        public static void main(String[] args) {
            createTest();
        }



        public static void createTest() {
            System.out.println("Enter Number of Question you wish to answer between : ");
            int userInput = number.nextInt();
            String operators = "*+-/%";

            while (correct != userInput) {
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

            }
            System.out.println(correct);
            System.out.println("your score is "+ (correct));

        }
    }



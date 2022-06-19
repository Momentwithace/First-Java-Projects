package tdd;

import javax.swing.text.DefaultStyledDocument;

public class Kata {


    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int subtractTest(int firstNumber, int secondNumber) {
        int difference = firstNumber - secondNumber;
        if (secondNumber > firstNumber) difference = secondNumber - firstNumber;

        return difference;
    }

    public int productTest(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int qoutientTest(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }


    public int qoutientTest2(int firstNumber, int secondNumber) {
        int division = 0;
        if (secondNumber == 0) {
            return division;
        } else {

            return firstNumber / secondNumber;
        }
    }

    public String grade(int result) {
        if (result >= 90 && result <= 100) {
            System.out.println("Your Grade Is: A ");
            return "A";
        }
//
        if (result >= 80 && result < 90) {
            System.out.println("Your Grade Is: B");
            return "B";
        }
//
        if (result >= 70 && result < 80) {
            System.out.println("Your Grade Is: C");
            return "C";
        }

        if (result >= 60 && result < 70) {
            System.out.println("Your Grade Is: D");
            return "D";
        }

        System.out.println("Your Grade Is: F");
        return "F";
    }


    public int noOfFactors(int num) {
        int i = 1;
        int factor = 0;
        for(i = 1; i<= num; i++){
            if(num % i == 0){
                factor++;
            }
        }
        return  factor;
    }
}











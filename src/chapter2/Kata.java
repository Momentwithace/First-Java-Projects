package chapter2;

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
        if(secondNumber == 0){
            return division;
        }
        else {

            return firstNumber / secondNumber;
        }
    }
}
        //int qoutient = 0;
       //if(firstNumber < secondNumber) qoutient = firstNumber/secondNumber;
      //  if(firstNumber > secondNumber) qoutient = firstNumber/secondNumber;
         //   return secondNumber;
       //}




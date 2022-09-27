package Chapter7;

import java.util.Random;

public class DiceGame {

    Random random;
    int number = 0;

     DiceGame(){
        random = new Random();
        roll();
    }

    private void roll() {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }

//    DiceGame(){
//        Random random = new Random();
//        int number = 0;
//        roll(random, number);
//    }
//
//    private void roll(Random random, int number) {
//        number = random.nextInt(6) + 1;
//        System.out.println(number);
//    }

}

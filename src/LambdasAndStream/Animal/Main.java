package LambdasAndStream.Animal;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Animal dog = System.out::println;
        dog.speak("barking");

        //example of stream expression
        System.out.println(IntStream.rangeClosed(1, 10).sum());

        System.out.println(IntStream.rangeClosed(1,10)
                .map((int x) -> x * 2).sum());

    }
}

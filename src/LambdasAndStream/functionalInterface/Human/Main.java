package LambdasAndStream.functionalInterface.Human;

import LambdasAndStream.functionalInterface.Human.Human;

public class Main {
    public static void main(String[] args) {
        Human human = () -> System.out.println("I'm a man");
        human.speak();
        human.eat();

    }
}

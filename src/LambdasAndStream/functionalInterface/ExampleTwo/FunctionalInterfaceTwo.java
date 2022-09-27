package LambdasAndStream.functionalInterface.ExampleTwo;

import java.util.Random;
import java.util.function.*;

//Examples of Functional Interface
//Consumer
//BiConsumer
//Supplier
//Predicate
//BiPredicate
//Function
//BiFunction
//UnaryOperator
//BinaryOperator

public class FunctionalInterfaceTwo {
    public static void main(String[] args) {
        Consumer<Integer> consumer
                = (number)-> System.out.println(number);

        // the consumer interface as just one abstract method called accept
        consumer.accept(5);

        BiConsumer<Integer, String > biConsumer
                = (age, name) -> System.out.println("my name is "+ name + " I am "+age+ " years old");
        biConsumer.accept(10, "Boyo");

        Random random = new Random();
        Supplier<Integer> supplier
                = ()->  random.nextInt();
        System.out.println(  supplier.get());


        Predicate<String> predicate = (name) -> name.equals("Ace");
        System.out.println( predicate.test("Boyo"));

        BiPredicate<Integer, String> biPredicate
                = (num, character) -> String.valueOf(num).equals(character);
        System.out.println(biPredicate.test(5, "5"));


        Function<String, Integer> func = (word)->word.length();
        System.out.println(func.apply("Hello"));

        BiFunction<Integer, Integer, String> biFunction
                = (num1, num2)->String.valueOf(num1+num2);
        System.out.println(biFunction.apply(2, 4));

        UnaryOperator<Integer> unaryOperator
                = (number) -> number * number * number;
        System.out.println(unaryOperator.apply(5));

        BinaryOperator<Integer> binaryOperator
                = (number, number2)->number*number2;
        System.out.println(binaryOperator.apply(3, 3));


    }
}

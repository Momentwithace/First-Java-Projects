package LambdasAndStream.StreamApi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ExampleOne {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);

        numbers.forEach((number) -> System.out.println(number));

        Consumer<Integer> consumer = (number)-> System.out.println(number);


        numbers.stream()
                .filter((number)->number%20!=0)
                .forEach(consumer);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        map.forEach((age, name)->System.out.println("My Name is "+ name + " I'm "+age+ " years old"));


    }
}

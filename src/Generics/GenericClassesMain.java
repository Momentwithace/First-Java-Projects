package Generics;

public class GenericClassesMain {
    public static void main(String[] args) {
        GenericClasses<Integer, Integer> myInt = new GenericClasses<>(1, 3);
        GenericClasses<Double, Double> myDouble = new GenericClasses<>(2.3, 4.6);
        GenericClasses<Character, Character> myChar = new GenericClasses<>('e', 'd');
        GenericClasses<String, Character> myString = new GenericClasses<>("e", 'd');

        System.out.println(myChar.getValue());
        System.out.println(myInt.getValue());
        System.out.println(myString.getValue());
        System.out.println(myDouble.getValue());
    }
}

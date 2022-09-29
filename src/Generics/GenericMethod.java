package Generics;

import SchoolManagementSystem.Course;

public class GenericMethod {
    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {5.5, 3.2, 4.5};
        Character[] charArray = {'a', 'e', 's'};
        String[] stringArray = {"w", "r", "a"};

        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(charArray);
        displayArray(stringArray);

        System.out.println(getFirstItem(intArray));
        System.out.println(getFirstItem(doubleArray));
        System.out.println(getFirstItem(charArray));
        System.out.println(getFirstItem(stringArray));
    }

    public static <Thing>void displayArray(Thing[] array){
        for(Thing x : array){
            System.out.println(x+ "");
        }
        System.out.println();
    }

    public static <Thing> Thing getFirstItem(Thing[] array){
        return array[0];
    }
}

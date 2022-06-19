package Chapter7;

import java.util.Arrays;

public class BooleanArray {
    public static void main(String[] args) {
        String[] morningGreetings = new String[2];
        morningGreetings[0] = "Good";
        morningGreetings[1] = "Morning";
        String[] nightGreetings = new String[2];
        nightGreetings[0] = "Good";
        nightGreetings[1] = "Night";
        System.out.println(Arrays.toString(morningGreetings));
        System.out.println(Arrays.toString(nightGreetings));


//        String[] morningGreetings = {"Good", "Morning"};
//        String[] nightGreetings = {"Good", "Night"};
        System.out.println("Arrays: morningGreetings = {\"Good\", \"Morning\"}, nightGreetings == {\"Good\", \"Night\"}");
        System.out.println("False");


    }
}

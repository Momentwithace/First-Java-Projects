package Chapter3;

import java.util.Scanner;

public class HouseMain {
    public static void main(String[] args) {
        House house = new House(5,7);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of doors");
        int userInput = input.nextInt();
        house.getNumbersOfDoors(userInput);
        System.out.println("Enter number of windows");
        int userInput2 = input.nextInt();
        house.getNumbersOfWindows(userInput2);
        System.out.printf(" Number of Doors is %d%n Number of Windows is %d%n" ,
                house.getNumbersOfDoors(userInput), house.getNumbersOfWindows(userInput2));
    }
}

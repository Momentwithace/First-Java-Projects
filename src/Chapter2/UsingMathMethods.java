package Chapter2;

import java.util.Scanner;

public class UsingMathMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         double sideX;
         double sideY;
         double sideZ;

        System.out.println("Hypotenuse Of A Triangle");
        System.out.println("Enter First Side: ");
        sideX = scanner.nextDouble();
        System.out.println("Enter Second Side: ");
        sideY = scanner.nextDouble();

        sideZ = Math.sqrt((sideX * sideX) + (sideY * sideY));
        System.out.println("The Hypotenuse of Your Triangle is: "+sideZ);
    }
}

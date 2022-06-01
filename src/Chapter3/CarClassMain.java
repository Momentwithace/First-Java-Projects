package Chapter3;

import java.util.Scanner;

public class CarClassMain {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        CarClass benz = new CarClass("Benz GLB SUV", "2020", 15.0, 30.33);
        System.out.println("Enter Car Model: ");
        String model = input.next();
        benz.setModel(model);
        System.out.println("Enter Edition Year: ");
        String year = input.next();
        benz.setYear(year);
        System.out.println("Enter Price: ");
        int price = input.nextInt();
        benz.setPrice(price);
        System.out.println("Your Car Model is: "+benz.getModel());
        System.out.println("The Edition Year is: "+benz.getYear());
        System.out.println("This Price is: "+benz.getPrice());
    }
}

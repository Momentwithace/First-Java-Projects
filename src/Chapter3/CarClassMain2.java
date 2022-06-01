package Chapter3;

import java.util.Scanner;

public class CarClassMain2 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        CarClass car1 = new CarClass("Toyota", "1991", 40.00, 30.33);
        CarClass car2 = new CarClass("Toyota", "1991", 60.00, 30.22);
        System.out.println("Enter Model for car1: ");
        String model = input.next();
        car1.setModel(model);
        System.out.println("Enter Model for car2: ");
        String model2 = input.next();
        car2.setModel(model2);
        System.out.println("Enter Year for car1: ");
        String year1 = input.next();
        car1.setYear(year1);
        System.out.println("Enter Year for car2: ");
        String year2 = input.next();
        car2.setYear(year2);
        System.out.println("Enter Discount for car1: ");
        double discount1 = input.nextDouble();
        car1.setDiscount(discount1);
        System.out.println("Enter Discount for car2: ");
        double discount2 = input.nextDouble();
        car2.setDiscount(discount2);
        System.out.println("Enter price for car1: ");
        double price1 = input.nextDouble();
        car1.setPrice(price1);
        System.out.println("Enter price for car2: ");
        double price2 = input.nextDouble();
        car2.setPrice(price2);
        System.out.println("Your Car Model is: "+car1.getModel());
        System.out.println("Your Car Model is: "+car2.getModel());
        System.out.println("The Edition Year is: "+car1.getYear());
        System.out.println("The Edition Year is: "+car2.getYear());
        System.out.println("The Discount for car1 is: "+car1.getDiscount());
        System.out.println("The Discount for car1 is: "+car2.getDiscount());
        System.out.println("This Price is: "+car1.getPrice());
        System.out.println("This Price is: "+car2.getPrice());

    }

}

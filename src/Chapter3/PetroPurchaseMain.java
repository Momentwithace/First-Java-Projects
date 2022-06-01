package Chapter3;

import java.util.Scanner;

public class PetroPurchaseMain {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        PetroPurchase petroPurchase = new PetroPurchase("yaba", "fuel", 5, 0.2, 5.1 , 2000);
        System.out.println("Enter Your Location: ");
        String location = input.next();
        petroPurchase.setLocation(location);
        System.out.println("Enter Type: ");
        String type = input.next();
        petroPurchase.setType(type);
        System.out.println("Enter quality");
        int quality = input.nextInt();
        petroPurchase.setQuality(quality);
        System.out.println("Enter Discount: ");
        double discount = input.nextDouble();
        petroPurchase.setDiscount(discount);
        System.out.println("Enter Liter");
        double liter = input.nextDouble();
        petroPurchase.setLiter(liter);
        System.out.println("Your net purchase is: " + petroPurchase.getPurchaseAmount());

    }
}

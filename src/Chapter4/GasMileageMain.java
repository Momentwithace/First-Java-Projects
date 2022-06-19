package Chapter4;

import java.util.Scanner;

public class GasMileageMain {

    public static void main(String[] args) {
    int miles;
    int gallons;

    char cont = 'y';

        Scanner input = new Scanner(System.in);
        GasMileage mileage = new GasMileage();

        while ((cont != 'n')){

            System.out.println("\n******************\n");
            System.out.println("Enter Gas Mileage for the trip: ");
            miles = input.nextInt();
            System.out.println("Enter Gallons used for the trip: ");
            gallons = input.nextInt();

            System.out.print("Add another trip? (y/n): ");
            cont = input.next().charAt(0);
        }

        System.out.println("\n******************\n");
        System.out.println("Total MPG");
        System.out.printf("Total mileage: %.2f\nTotal gallon usage: %.2f\n",
                mileage.getTotalGallons(), mileage.getTotalGallons());
        System.out.printf("Your total MPG for all trips is: %.2f\n",
                mileage.getTotalMPG());

    }
}

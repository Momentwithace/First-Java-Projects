package Chapter3;

import java.util.Scanner;

public class ClockClassMain {
    public static void main(String[] args) {
        ClockClass rolex = new ClockClass(21, 45, 69);
              rolex.setDisplayTime();
        System.out.println("Your Current time is:"+rolex.getDisplayTime());
    }
}

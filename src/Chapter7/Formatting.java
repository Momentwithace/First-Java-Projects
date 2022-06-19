package Chapter7;

import java.text.NumberFormat;

public class Formatting {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);

        System.out.println(result);
    }
}

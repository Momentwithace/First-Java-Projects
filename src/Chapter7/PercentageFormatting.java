package Chapter7;

import java.text.NumberFormat;

public class PercentageFormatting {
    public static void main(String[] args) {
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result = percent.format(0.2);
        System.out.println(result);
    }
}

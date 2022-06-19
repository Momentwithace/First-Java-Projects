package Chapter7;

import java.util.Objects;

public class StringComparison {
    public boolean comparisonResult(String[] firstString, String[] secondString) {
        return firstString.length == secondString.length;

    }

    public boolean StringArrayElementComparison(String[] firstString, String[] secondString) {
        for (int i = 0; i < secondString.length; i++) {
            System.out.println(Objects.equals(firstString[i], secondString[i]));
            return false;
        }
        return true;

    }
}


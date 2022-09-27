package Chapter7;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        String[][] names = {{"Ace" , "Elom", "Zeddy"},
                {"Boyo", "Tman", "Ac"},
                {"Eden", "Tabitha", "John"},
                {"Wale", "Mike", "Paul", "Sandra"},
                {"phillip", "Adunni", "Dotun", "Ayo"}};

        for (int i = 0; i < names.length; i++) {
            System.out.println();
            for (int j = 0; j < names[i].length; j++) {
                System.out.print(names[i][j] + " ");
            }
        }
    }
}

package FilesAndStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Files {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("Poem.txt");
            fileWriter.write("Roses are red \nViolet are blue \nThe sky is incomplete without the sun!");
            fileWriter.append("\nPoem by Ace");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

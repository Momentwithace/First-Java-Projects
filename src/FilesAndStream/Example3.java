package FilesAndStream;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Example3 {
    public static void main(String[] args) {
        try {
            PrintWriter writer = new PrintWriter("sampleText.txt");
            writer.println("Example of writing to a file");
            writer.close();
//            writer.flush(); when you flush the pipeline is still open, but when you close the pipeline needs a need call to open up
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

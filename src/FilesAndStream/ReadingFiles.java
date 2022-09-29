package FilesAndStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingFiles {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("note.txt");
            fileWriter.write("This is just an example a file writer!");
            fileWriter.append("\nNext will be to read the file");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader fileReader = new FileReader("note.txt");
            int data = fileReader.read();
            while (data != -1){
                System.out.print((char)data);
                data = fileReader.read();
            }
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

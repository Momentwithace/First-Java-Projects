package FilesAndStream;

import java.io.File;

public class FileReading {
    public static void main(String[] args) {
        File file = new File("example.txt");
        if(file.exists()){
            System.out.println(file.isFile());
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
        }
        else {
            System.out.println("File doesn't exist");
        }
    }
}

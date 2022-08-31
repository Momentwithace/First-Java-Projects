package FilesAndStream;

import java.io.*;

public class Example1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        PrintStream printStream = new PrintStream("test.txt");
        try {
            String sentence = bufferedReader.readLine();
            printStream.println(sentence.toUpperCase());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}

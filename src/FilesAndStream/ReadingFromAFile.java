package FilesAndStream;

import java.io.*;

public class ReadingFromAFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("/home/ace/IdeaProjects/cohortEleven/sampleText.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String sentence = bufferedReader.readLine();
            System.out.println(sentence);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

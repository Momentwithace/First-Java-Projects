package FilesAndStream;

import java.io.*;

public class Example2 {
    public static void main(String[] args) throws IOException {

        try(InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            PrintWriter printWriter = new PrintWriter(new FileWriter("new-test.tst"));){
            String sentence = bufferedReader.readLine();

            printWriter.println(sentence.toUpperCase());
//            printWriter.flush();
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

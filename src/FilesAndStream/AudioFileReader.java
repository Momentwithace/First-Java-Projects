package FilesAndStream;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class AudioFileReader {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);

        File file = new File("GodDid.wav");
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);

        String response = "";

        while (!response.equals("Q")){
            System.out.println("P - play, S - pause, R - reset, Q - quit");
            System.out.print("Enter your choice: ");

            response = scanner.next();
            response = response.toUpperCase(Locale.ROOT);


            switch (response){
                case ("P"):
                    clip.start();
                    break;
                case ("S"):
                    clip.stop();
                    break;
                case ("R"):
                    clip.setMicrosecondPosition(0);
                    break;
                case ("Q"):
                    clip.close();
                default:
                    System.out.println("Not a valid response");
            }
        }
        clip.start();


    }
}

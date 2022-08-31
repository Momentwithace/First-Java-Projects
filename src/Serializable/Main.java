package Serializable;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Captain", 56);
        try (
                ObjectOutputStream objectInputStream = new ObjectOutputStream(new FileOutputStream("dog"));
        ) {
                objectInputStream.writeObject(dog);

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}

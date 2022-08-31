package Serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Serialization {
    public static void main(String[] args) {
        try
                (
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("dog"))
        ) {
            Dog dog = (Dog) objectInputStream.readObject();
            System.out.println(dog);
        } catch (IOException |ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
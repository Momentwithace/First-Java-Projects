package LambdasAndStream.functionalInterface;

public interface Human {
    void speak();
    default void eat(){
        System.out.println("I'm eating");
    }
}

package LambdasAndStream.functionalInterface.Human;

public interface Human {
    void speak();
    default void eat(){
        System.out.println("I'm eating");
    }
}

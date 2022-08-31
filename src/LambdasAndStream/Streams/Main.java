package LambdasAndStream.Streams;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = (speed , name)->
                System.out.println("I am a " + name + " running at " + speed + " Km/hr>");
        vehicle.move(120, "Benzo");
    }
}

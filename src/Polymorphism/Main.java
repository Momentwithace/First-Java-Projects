package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        Car car = new Car();
        Bike bike = new Bike();

        Vehicle[] racers = {bicycle, car, bike};

        for (Vehicle vehicle: racers
             ) {
             vehicle.move();
        }
    }
}

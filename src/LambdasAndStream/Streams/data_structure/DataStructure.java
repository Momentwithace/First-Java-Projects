package LambdasAndStream.Streams.data_structure;

public class DataStructure {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.print();
        numbers.insert(7);
        numbers.insert(5);
        numbers.insert(9);
        numbers.insert(2);
        numbers.removeAt(8);
        numbers.print();
    }
}

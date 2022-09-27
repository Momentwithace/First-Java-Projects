package LambdasAndStream.functionalInterface.NewExampleOfFunuctionalInterface;

public class FunctionalInterfaceExampleMain {
    public static void main(String[] args) {
        Staff staff = (hours) -> overTime(hours);

        staff.work(2);

    }

    private static void overTime(int hours){
        int doubleWorkingHours = hours * 2;
        System.out.println("The CSO works " + doubleWorkingHours+ " hours a year" );
    }
}


//    static method are called on the class
//        System.out.println("assist static method executes ");
//        Staff.assist();
//
//            while
//
//        default methods are called on the object
//        System.out.println("word default method execute");
//        System.out.println(staff.word());
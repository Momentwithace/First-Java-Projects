package LambdasAndStream.functionalInterface.NewExampleOfFunuctionalInterface;


@FunctionalInterface
public interface Staff {
    void work(int hours);


    static void assist(){
        System.out.println("How can i assist you");
    }

    default String word(){
        return "come";
    }
}

package Chapter8;

public class ThreadSleep {
    public static void main(String[] args) {
        System.out.println("1 love java");
        sleep();
        System.out.println("i love python");
        sleep();
        System.out.println("i hate node");

    }


    private static void sleep() {
        try {
            Thread.sleep(300);
        }catch (Exception ignored){

        }
    }
}

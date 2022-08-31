package Assignment;

public class FibanacciSeriers {
    private static long[] fibonaccicCache;

    public static void main(String[] args) {
        int number = 10;
        fibonaccicCache = new long[number + 1];


        System.out.println(fibonacci(number));
    }

    private static long fibonacci(int number) {
        if(number <= 1){
            return number;
        }
        return  (fibonacci(number - 1 ) + fibonacci(number - 2));
    }


}


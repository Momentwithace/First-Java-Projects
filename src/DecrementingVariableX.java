

public class DecrementingVariableX {
    public static void main(String[] args){
        int total = 5;
        int x = 4;

        total = --x + total;
        System.out.println("sum = "+total);
    }
}

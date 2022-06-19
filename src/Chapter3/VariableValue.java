package Chapter3;

public class VariableValue {
    public static void main(String[] args){
       // If integers x and y are set to 7 and 3, what is the value of x after x
        //   = y++
        // and x
        //     = ++y ?
        int sum1 = 0;
        int sum2 = 0;
        int x = 7;
        int y= 4;
        sum1 = x + y++;
        sum1 = 11;
        sum2 = x + ++y;
        sum2 = 11;
        System.out.println(sum1 + sum2);

    }




}

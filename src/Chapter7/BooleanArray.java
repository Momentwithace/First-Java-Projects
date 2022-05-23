package Chapter7;

public class BooleanArray {
    public static void main(String[] args) {
        String[] morningGreetings = new String[2];
        morningGreetings[0] = "Good";
        morningGreetings[1] = "Morning";
        String[] nightGreetings = new String[2];
        nightGreetings[0] = "Good";
        nightGreetings[1] = "Night";
        if(morningGreetings[1] == nightGreetings[1]){
            System.out.println("is true");
        }else{
            System.out.println("not true");
        }

    }
}

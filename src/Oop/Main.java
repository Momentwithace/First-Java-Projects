package Oop;

public class Main {
    public static void main(String[] args) {
        Native ace= new Native();
        Facilitator tman = new Facilitator();
        ace.eat();
        ace.sleep();
        ace.talk();
        String result = ace.learnJave();
        System.out.println(result);
        String outPut = tman.teachJava();
        System.out.println(outPut);


    }
}

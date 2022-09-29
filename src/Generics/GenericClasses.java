package Generics;

public class GenericClasses<Thing, Thing2> {
    Thing x;
    Thing2 y;

    public GenericClasses(Thing x, Thing2 y) {
        this.x = x;
        this.y = y;
    }

    public Thing2 getValue(){
        return y;
    }
}

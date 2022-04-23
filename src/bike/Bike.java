package bike;

public class Bike {
    private boolean status;
    public void setOn(boolean setOn) {
        status = setOn;


    }

    public boolean checkSetOn() {
        return status;
    }

    private boolean change;
    private boolean currentState;
    public void isSetOn(boolean isSetOn) {
        currentState = isSetOn;
    }

    public void setOff(boolean setOff) {
        change = setOff;

    }

    public boolean checkSetOff() {
        return change;
    }
}

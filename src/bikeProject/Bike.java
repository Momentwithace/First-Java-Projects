package bikeProject;

public class Bike {
    private boolean status;
    private int gearStatus;
    private int speedStatus;
    private boolean acceleratorStatus;
    private boolean deccelerateStatus;


    public void setOn(boolean checkSetOn) {
        status = checkSetOn;
    }

    public boolean checkSetOn() {
        return status;
    }


    public void setGear(int checkGear) {
        gearStatus = checkGear;

    }

    public int checkGear() {
        return gearStatus;
    }


    public void setSpeed(int checkSpeed) {
        speedStatus = checkSpeed;
    }

    public void setAccelerator(boolean checkAcceleration) {
        acceleratorStatus = checkAcceleration;
        if (acceleratorStatus == true) {
            if (speedStatus < 21) {
                speedStatus = speedStatus + 1;
            }
            if (speedStatus > 20 && speedStatus < 31) {
                speedStatus = speedStatus + 2;
            }
            if (speedStatus > 30 && speedStatus < 41) {
                speedStatus = speedStatus + 3;
            }
            if (speedStatus > 40) {
                speedStatus = speedStatus + 4;
            }

        }
    }

    public void setDeccelerator(boolean checkDeccelerate) {
        deccelerateStatus = checkDeccelerate;
        if(deccelerateStatus == true){
            if(speedStatus < 21){
                speedStatus = speedStatus - 1;
            }
            if(speedStatus > 20 && speedStatus < 31){
                speedStatus = speedStatus - 2;
            }
            if(speedStatus > 30 && speedStatus < 41){
                speedStatus = speedStatus - 3;
            }
            if(speedStatus > 40 && speedStatus < 51){
                speedStatus = speedStatus - 4;
            }
        }
    }

    public int getSpeed() {
        return speedStatus;
    }
}

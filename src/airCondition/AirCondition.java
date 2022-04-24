package airCondition;

public class AirCondition {
    private boolean status;
    private int temperatureStatus;
    public void setOn(boolean checkSetOn) {
        status = checkSetOn;
    }

    public boolean checkSetOn() {
        return status;
    }

    public void setTemperature(int checkTemperature) {
        temperatureStatus = checkTemperature;
    }

    public int getTemperature() {
        return temperatureStatus;
    }
}

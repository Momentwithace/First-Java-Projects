package tdd;

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

    public void increaseTemperature(int temperatureLevel) {
        temperatureStatus += temperatureLevel;

    }

    public int getTemperature() {
        return temperatureStatus;
    }

    public void decreaseTemperature(int decreaseTemperature) {
        temperatureStatus -= decreaseTemperature;
    }

    public void increaseTemperatureBeyond(int limitTemperature) {
        temperatureStatus = limitTemperature;
        if(temperatureStatus <= limitTemperature);
    }

    public void decreaseTemperatureBelow16(int decreaseLimit) {
        temperatureStatus = decreaseLimit;
        if(temperatureStatus >= decreaseLimit);
    }
}
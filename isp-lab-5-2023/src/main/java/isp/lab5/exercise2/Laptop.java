package isp.lab5.exercise2;

public class Laptop implements  Chargeable{
    private int batteryLevel;

    @Override
    public void getBatteryLevel(int batteryLevel) {
        this.batteryLevel=batteryLevel;
    }

    public void charge(int durationInMinutes) {
        while (this.batteryLevel < 100 && durationInMinutes > 0) {
            this.batteryLevel += 1;
            durationInMinutes -= 1;
        }
        if (this.batteryLevel > 100)
            this.batteryLevel = 100;
    }

    @Override
    public String toString() {
        return " "+batteryLevel;
    }
}
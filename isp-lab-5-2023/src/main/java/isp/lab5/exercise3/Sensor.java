package isp.lab5.exercise3;

abstract class Sensor {
    protected String installLocation;
    protected String name;
    public Sensor(String installLocation, String name)
    {
        this.installLocation=installLocation;
        this.name=name;
    }
    public abstract double getValue();
}

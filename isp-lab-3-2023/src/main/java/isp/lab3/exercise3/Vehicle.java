package isp.lab3.exercise3;

public class Vehicle {
    private String model;
    private String type;
    private int speed;
    private char fuelType;
    private static int count = 0;

    public Vehicle(String model, String type, int speed, char fuelType) {
        this.model = model;
        this.type = type;
        this.speed = speed;
        this.fuelType = fuelType;
        count++;
    }

    @Override
    public String toString() {
        return "Vehicle " +
                "model='" + model + '\'' +
                ", type=" + type +
                ", speed=" + speed +
                ", fuelType=" + fuelType;
    }

    public static void main(String[] args) {
        Vehicle Vehicle1 = new Vehicle("Bugatti", "La Voiture Noire", 402, 'B');
        Vehicle Vehicle2 = new Vehicle("McLaren", "Speedtail", 403, 'B');
        System.out.println("Currently we have " + count + " vehicles");
        System.out.println("First vehicle is:");
        System.out.println(Vehicle1);
        System.out.println("Second vehicle is:");
        System.out.println(Vehicle2);
    }


}


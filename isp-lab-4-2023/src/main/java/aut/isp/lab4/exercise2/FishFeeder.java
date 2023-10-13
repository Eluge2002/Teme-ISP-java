package aut.isp.lab4.exercise2;

public class FishFeeder {
    private AquariumController manufacturer;
    private AquariumController model;
    private int meals = 14;

    public FishFeeder(String aqTanks, String model712) {
    }

    public void feed(int meals) {
        this.meals -= meals;
        System.out.println("we fed a fish");

    }

    public void fillUp(int meals) {
        this.meals += meals;
    }

    @Override
    public String toString() {
        return "FishFeeder{" +
                "manufacturer=" + manufacturer +
                ", model=" + model +
                ", meals=" + meals +
                '}';
    }

    public void feed() {
        if (meals > 0) {
            meals--;
            System.out.println("A fish has been fed.");
        } else {
            System.out.println("No meals left in the fish feeder.");
        }
    }}
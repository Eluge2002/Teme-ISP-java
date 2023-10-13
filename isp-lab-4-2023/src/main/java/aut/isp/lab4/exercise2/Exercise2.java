package aut.isp.lab4.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        FishFeeder fishFeeder = new FishFeeder("AqTanks","Model_712");


        AquariumController aquariumController = new AquariumController();
        aquariumController.setCurrentTime(10.5F);
        aquariumController.setFeedingTime(12.5F);

        if (aquariumController.getCurrentTime() == aquariumController.getFeedingTime()) {
            System.out.println("It's feeding time!");
            fishFeeder.feed();
        } else {
            System.out.println("It's not feeding time yet.");
        }
    }
}

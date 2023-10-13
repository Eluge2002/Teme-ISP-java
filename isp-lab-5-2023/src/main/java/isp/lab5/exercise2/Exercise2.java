package isp.lab5.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        Chargeable laptop = new Laptop();
        Chargeable smartWatch = new SmartWatch();
        Chargeable smartPhone = new SmartPhone();

        laptop.getBatteryLevel(20);
        smartPhone.getBatteryLevel(8);
        smartWatch.getBatteryLevel(42);

        laptop.charge(180);
        smartWatch.charge(120);
        smartPhone.charge(60);
        System.out.println("Laptop battery is  "+ laptop + "%");
        System.out.println("Smartphone battery is  "+ smartPhone + "%");
        System.out.println("SmartWatch battery is  "+ smartWatch + "%");

    }

}

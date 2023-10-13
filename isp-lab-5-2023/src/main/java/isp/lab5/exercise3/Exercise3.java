package isp.lab5.exercise3;

public class Exercise3 {
    public static void main (String[] args) {
       MonitoringService monitoringService = new MonitoringService();
        Sensor temperatureSensor1 = new TemperatureSensor("Bedroom", "Temperature Sensor1", 25.1);
        Sensor temperatureSensor2 = new TemperatureSensor("Attic", "Temperature Sensor2", 5.1);
        Sensor temperatureSensor3 = new TemperatureSensor("Hallway ", "Temperature Sensor3", 21.2);
        Sensor temperatureSensor4 = new TemperatureSensor("Bathroom ", "Temperature Sensor4", 15.7);
        Sensor temperatureSensor5 = new TemperatureSensor("Living-room ", "Temperature Sensor5", 24.2);
        Sensor pressureSensor1 = new PressureSensor("Bedroom", "Temperature Sensor1", 100);
        Sensor pressureSensor2 = new PressureSensor("Attic", "Temperature Sensor2", 98.6);
        Sensor pressureSensor3 = new PressureSensor("Hallway", "Temperature Sensor3", 102.3);
        Sensor pressureSensor4 = new PressureSensor("Bathroom ", "Temperature Sensor4", 250.1);
        Sensor pressureSensor5 = new PressureSensor("Living-room ", "Temperature Sensor5", 50.8);
monitoringService.Add(temperatureSensor1);
        monitoringService.Add(temperatureSensor2);
        monitoringService.Add(temperatureSensor3);
        monitoringService.Add(temperatureSensor4);
        monitoringService.Add(temperatureSensor5);
        monitoringService.Add(pressureSensor1);
        monitoringService.Add(pressureSensor2);
        monitoringService.Add(pressureSensor3);
        monitoringService.Add(pressureSensor4);
        monitoringService.Add(pressureSensor5);

        double avgTemp= monitoringService.getAverageTemperatureSensors();
        double avgAll= monitoringService.getAverageAllSensors();
        System.out.println("Average temperature is: "+avgTemp);
        System.out.println("Average all is: "+avgAll);
    }
}

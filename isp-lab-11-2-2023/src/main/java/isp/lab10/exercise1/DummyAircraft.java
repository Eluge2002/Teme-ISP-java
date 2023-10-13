package isp.lab10.exercise1;

import java.io.FileWriter;
import java.io.IOException;

public class DummyAircraft implements Runnable {

    String id;
    String lock = "lock";
    int k = 0;

    public DummyAircraft(String id) {
        this.id = id;
        System.out.println("Aircraft " + id + " is created. Ready to take off.");
    }

    public void start() {
        Thread t = new Thread(this);
        t.start();
    }

    public void run() {
        try (FileWriter aircraft = new FileWriter("Console_Aircraft", true)) {
            String message = "Aircraft " + id + " is flying\n";
//            while (k < 20) {
//                String message = "Aircraft " + id + " is flying\n";
//                aircraft.write(message);
//                aircraft.flush(); // Make sure the message is written immediately
//
//                k++;
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//
//                if (k == 15) {
//                    synchronized (lock) {
//                        try {
//                            lock.wait();
//                        } catch (InterruptedException e) {
//                            throw new RuntimeException(e);
//                        }
//                    }
//                }
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String landingMessage = "Aircraft " + id + " is landing.\n";
        try (FileWriter aircraft = new FileWriter("Console_Aircraft", true)) {
            aircraft.write(landingMessage);
            aircraft.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //action listener
    public void land() {
        synchronized (lock) {
            lock.notify();
        }
    }

    public static void main(String[] args) {
        DummyAircraft da = new DummyAircraft("1");
        //da.start();
        Thread t = new Thread(da);
        t.start();
    }
}

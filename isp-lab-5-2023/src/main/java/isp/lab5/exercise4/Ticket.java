package isp.lab5.exercise4;

public class Ticket {
    private String eventName;
    private double price;
    private boolean isCheckedIn;
    public Ticket(String eventName, double price) {
        this.eventName = eventName;
        this.price = price;
        this.isCheckedIn = false;
    }
    public String getEventName() {
        return eventName;
    }
    public double getPrice() {
        return price;
    }
    public boolean isCheckedIn() {
        return isCheckedIn;
    }
    public void setCheckedIn(boolean isCheckedIn) {
        this.isCheckedIn = isCheckedIn;
    }
}

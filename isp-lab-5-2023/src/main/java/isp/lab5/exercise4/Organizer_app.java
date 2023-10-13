package isp.lab5.exercise4;

public class Organizer_app {
    public void checkIn(Ticket ticket) {
        ticket.setCheckedIn(true);
        System.out.println("Check-in successful.");
    }
}
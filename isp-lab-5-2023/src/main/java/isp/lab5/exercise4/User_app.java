package isp.lab5.exercise4;

import java.util.ArrayList;
import java.util.List;

public class User_app {
    private List<Ticket> tickets = new ArrayList<>();

    public void buyTicket(Ticket ticket) {
        tickets.add(ticket);
        System.out.println("Ticket purchased successfully.");
    }

    public void viewTicket(Ticket ticket) {
        System.out.println("Ticket information:");
        System.out.println("Event name: " + ticket.getEventName());
        System.out.println("Price: " + ticket.getPrice());
        System.out.println("Checked in: " + ticket.isCheckedIn());
    }
}
package isp.lab5.exercise4;

import java.util.ArrayList;
import java.util.List;

public class Tickets_manager {
    private List<Ticket> tickets = new ArrayList<>();

    public void generateTicket(Ticket ticket) {
        tickets.add(ticket);
        System.out.println("Ticket generated successfully.");
    }

    public boolean validateTicket(Ticket ticket) {
        if (tickets.contains(ticket)) {
            System.out.println("Ticket validated successfully.");
            return true;
        } else {
            System.out.println("Ticket validation failed.");
            return false;
        }
    }
}
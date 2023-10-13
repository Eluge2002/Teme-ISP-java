package isp.lab5.exercise4;

public class Exercise4 {
    public static void main(String[] args) {
        Tickets_manager tm = new Tickets_manager();
        Payment_gateway pg = new Payment_gateway();
        Organizer_app oa = new Organizer_app();
        User_app ua = new User_app();
        Ticket ticket = new Ticket("SportsRace", 150.0);
        tm.generateTicket(ticket);
        pg.processPayment(ticket, 150.0);
        ua.buyTicket(ticket);
        ua.viewTicket(ticket);
        oa.checkIn(ticket);
        tm.validateTicket(ticket);
    }
}

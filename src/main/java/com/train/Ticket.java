package com.train;

public class Ticket {
    private static final float distCount = 0.9f;
    private static final int TicketAmt = 1000;
    int ticket;
    int trip;

    public Ticket(int ticket, int trip) {
        this.ticket = ticket;
        this.trip = trip;
    }

    public void totalPrint() {
        float roundTripAmt = trip * TicketAmt * 2 * distCount;
        int tripAmt = (ticket-trip) * TicketAmt;
        float total = roundTripAmt + tripAmt ;
        System.out.println("Total tickets:" +ticket);
        System.out.println("Round-trip:" +trip);
        System.out.println("Total:" +(int)total);
    }
}

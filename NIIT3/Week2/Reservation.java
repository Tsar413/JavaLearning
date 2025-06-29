package com.company.javaRelearn.NIIT3.Week2;

public class Reservation {
    private int ticketId;

    public Reservation() {
    }
    public Reservation(int ticketId) {
        this.ticketId = ticketId;
    }

    public int showTicket(){
        return this.ticketId;
    }

    public static void main(String[] args) {
        Reservation reservation = new Reservation(2);
        System.out.println(reservation.showTicket());
    }
}

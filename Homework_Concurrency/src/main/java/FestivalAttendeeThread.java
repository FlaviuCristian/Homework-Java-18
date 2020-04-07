public class FestivalAttendeeThread extends Thread {

    TicketType myTicket;

    public FestivalAttendeeThread(TicketType ticketType, Gate gate) {

        myTicket = ticketType;

        Runnable task = () -> {
            gate.ValidateTicket(myTicket);
        };
        Thread thread = new Thread(task);
        thread.start();
    }
}
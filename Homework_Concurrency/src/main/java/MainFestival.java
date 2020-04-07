public class MainFestival {
    public static FestivalStatisticThread festivalStats;

    public static void main(String[] args) {
        Gate gate = new Gate();
        festivalStats = new FestivalStatisticThread(gate);
        for (int i = 0; i <500; i++)
        {
            TicketType ticketType = TicketType.getRandomTicketType();
            FestivalAttendeeThread festivalAttendee = new FestivalAttendeeThread(ticketType, gate);
            festivalAttendee.start();
        }
    }
}

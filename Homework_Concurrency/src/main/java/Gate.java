public class Gate extends Thread{

    public int validatedTickets = 0;
    int full, fullVip, freePass, oneDay, oneDayVip = 0;

    public void ValidateTicket (TicketType ticketType){
        validatedTickets++;
        switch (ticketType) {
            case full:
                full++;
                break;
            case fullVip:
                fullVip++;
                break;
            case oneDay:
                oneDay++;
                break;
            case freePass:
                freePass++;
                break;
            case oneDayVip:
                oneDayVip++;
                break;
            default:
                System.out.println("no ticket found");
                break;
        }

    }

    public void GateStats() {
        System.out.print(validatedTickets + " people entered\n");
        System.out.print(full + " people have full tickets\n");
        System.out.print(fullVip + " people have fullVip tickets\n");
        System.out.print(oneDay + " people have oneDay tickets\n");
        System.out.print(freePass + " people have freePass tickets\n");
        System.out.print(oneDayVip + " people have oneDayVip tickets\n");
    }
}

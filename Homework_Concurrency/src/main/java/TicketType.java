import java.util.Random;

public enum TicketType {
    full,
    fullVip,
    freePass,
    oneDay,
    oneDayVip;

    public static TicketType getRandomTicketType() {
        Random random = new Random();
        return TicketType.values()[random.nextInt(values().length)];
    }
}

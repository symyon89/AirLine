import java.time.LocalDateTime;

public class Arrivals {
    String flightCode;
    byte loadingInterval;
    LocalDateTime date;

    public Arrivals(String flightCode, byte loadingInterval, LocalDateTime date) {
        this.flightCode = flightCode;
        this.loadingInterval = loadingInterval;
        this.date = date;
    }
}

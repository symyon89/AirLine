import java.time.LocalDateTime;

public class Departures {
        String flightCode;
        byte loadingInterval;
        LocalDateTime date;

        public Departures(String flightCode, byte loadingInterval, LocalDateTime date) {
                this.flightCode = flightCode;
                this.loadingInterval = loadingInterval;
                this.date = date;
        }

}

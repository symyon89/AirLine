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

        @Override
        public String toString() {
                return "Departure{" +
                        "flightCode='" + flightCode + '\'' +
                        ", loadingInterval=" + loadingInterval +
                        ", date=" + date +
                        '}';
        }
}

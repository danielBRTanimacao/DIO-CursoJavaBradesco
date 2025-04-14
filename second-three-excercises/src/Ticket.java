public class Ticket {
    double value;
    String movie;
    boolean dub;

    public Ticket(double ticketValue, String movieName, boolean isDub) {
        this.value = ticketValue;
        this.movie = movieName;
        this.dub = isDub;
    }
}

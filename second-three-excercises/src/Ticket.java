public class Ticket {
    double value;
    String movie;
    boolean dub;

    double halfPrice;
    double familyPrice;

    public Ticket(double ticketValue, String movieName, boolean isDub) {
        this.value = ticketValue;
        this.movie = movieName;
        this.dub = isDub;

        this.halfPrice = value / 2;
    }

    public void getInfos() {
        calcValue(5);

        System.out.println(
            "Nome: " + this.movie + 
            "\nValor: R$" + String.format("%.2f", this.value) + 
            "\nDublado: " + (this.dub ? "Sim" : "Não") + 
            "\nMeia entrada: R$" + String.format("%.2f", this.halfPrice) + 
            "\nIngresso familia: R$" + String.format("%.2f", this.familyPrice)
        );
    }

    public void calcValue(int nPeople) {
        double total = this.value * nPeople;

        if (nPeople >= 3) {
            total *= 0.95;
        }

        this.familyPrice = total;
    }
}

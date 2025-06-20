public class Ticket {
    protected String filmName;
    protected double priceValue;
    protected String isDubbed;

    public Ticket(String filmName, double priceValue, String isDubbed) {
        this.filmName = filmName;
        this.priceValue = priceValue;
        this.isDubbed = isDubbed;
    }

    // método para retornar o valor do ingresso
    public double getPriceValue() {
        return priceValue;
    }
    // método para retornar o nome do filme
    public String getFilmName() {
        return filmName;
    }
    // método para retornar se o filme é dublado
    public String isDubbed() {
        return isDubbed;
    }


}

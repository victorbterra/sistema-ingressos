public class HalfTicket extends Ticket {
    public HalfTicket(String filmName, double priceValue, String isDubbed) {
        super(filmName, priceValue, isDubbed);
    }
    public double calcHalfTicket() {
        // Retorna metade do valor do ingresso
        return super.getPriceValue() / 2;
    }
}

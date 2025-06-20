public class TicketFamily extends Ticket {
    private int familyMembers;

    public TicketFamily (String filmName, double priceValue, String isDubbed, int familyMembers) {
        super(filmName, priceValue, isDubbed);
        this.familyMembers = familyMembers;
    };

    public double calcFamilyTicket() {
        double totalValue = this.priceValue * this.familyMembers;

        if (this.familyMembers >= 3) {
            // Se a família tiver 3 ou mais membros, aplica um desconto de 20%
            totalValue *= 0.95;
        }
        return totalValue;
    }
}

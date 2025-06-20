import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao sistema de venda de ingressos!");
        System.out.print("Digite o nome do filme: ");
        String filmName = scanner.nextLine();
        System.out.print("Digite o valor do ingresso: ");
        double priceValue = scanner.nextDouble();
        System.out.print("O filme é dublado ou legendado? ");
        String isDubbed = scanner.next().toLowerCase();
        scanner.nextLine();// Consumir a quebra de linha pendente
        System.out.print("Digite o tipo de ingresso (normal, meia, familia): ");
        String ticketType = scanner.nextLine().toLowerCase();
        do {
            switch (ticketType) {
                case "normal":
                    Ticket normalTicket = new Ticket(filmName, priceValue, isDubbed);
                    System.out.println("========== Ingresso Normal =========");
                    System.out.println("Nome do filme: " + normalTicket.getFilmName());
                    if(isDubbed.equalsIgnoreCase("dublado")) {
                        System.out.println("O filme é dublado.");
                    } else {
                        System.out.println("O filme é legendado.");
                    }
                    System.out.println("Valor do ingresso normal: " + normalTicket.getPriceValue() + " reais");
                    System.out.println("=====================================");
                    System.out.println("Obrigado por comprar o ingresso!");
                    break;
                case "meia":
                    HalfTicket halfTicket = new HalfTicket(filmName, priceValue, isDubbed);
                    System.out.println("========== Ingresso Meia =========");
                    System.out.println("Nome do filme: " + halfTicket.getFilmName());
                    if(isDubbed.equalsIgnoreCase("dublado")) {
                        System.out.println("O filme é dublado.");
                    } else {
                        System.out.println("O filme é legendado.");
                    }
                    System.out.println("Valor do ingresso meia: " + halfTicket.calcHalfTicket() + " reais");
                    System.out.println("=====================================");
                    System.out.println("Obrigado por comprar o ingresso!");
                    break;
                case "familia":
                    System.out.print("Digite o número de membros da família: ");
                    int familyMembers = scanner.nextInt();
                    if (familyMembers < 1) {
                        System.out.println("Número de membros da família deve ser pelo menos 1.");
                        continue; // Volta para o início do loop se o número for inválido
                    }
                    scanner.nextLine(); // Consumir a quebra de linha pendente
                    TicketFamily familyTicket = new TicketFamily(filmName, priceValue, isDubbed, familyMembers);
                    System.out.println("========== Ingresso Família =========");
                    System.out.println("Nome do filme: " + filmName);
                    if(isDubbed.equalsIgnoreCase("dublado")) {
                        System.out.println("O filme é dublado.");
                    } else {
                        System.out.println("O filme é legendado.");
                    }
                    System.out.println("Número de membros da família: " + familyMembers);
                    System.out.println("Valor do ingresso família: " + familyTicket.calcFamilyTicket() + " reais");
                    System.out.println("=====================================");
                    System.out.println("Obrigado por comprar o ingresso!");
                    break;
                default:
                    System.out.println("Tipo de ingresso inválido. Tente novamente.");
            }
            System.out.print("Deseja calcular outro ingresso? (s/n): ");
            String response = scanner.next().toLowerCase();
            if (!response.equals("s")) {
                break;
            }
            scanner.nextLine(); // Consumir a quebra de linha pendente
            System.out.print("Digite o tipo de ingresso (normal, meia, familia): ");
            ticketType = scanner.nextLine().toLowerCase();
        }while(true);


    }
}
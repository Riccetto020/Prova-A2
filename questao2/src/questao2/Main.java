package questao2;

public class Main {
    public static void main(String[] args) {
        int minutos = 130;

        EstrategiaCobranca rotativo = new CobrancaRotativo();
        EstrategiaCobranca mensalista = new CobrancaMensalista();
        EstrategiaCobranca conveniado = new CobrancaConveniado();

        System.out.println("Permanencia de " + minutos + " minutos:");
        System.out.println("  Rotativo   : " + moeda(new Ticket("ABC-1234", minutos, rotativo).calcularValor()));
        System.out.println("  Mensalista : " + moeda(new Ticket("ABC-1234", minutos, mensalista).calcularValor()));
        System.out.println("  Conveniado : " + moeda(new Ticket("ABC-1234", minutos, conveniado).calcularValor()));

        System.out.println();
        System.out.println("Troca de perfil em um mesmo tiquete (placa XYZ-9876, " + minutos + " min):");
        Ticket ticket = new Ticket("XYZ-9876", minutos, rotativo);
        System.out.println("  Como Rotativo   : " + moeda(ticket.calcularValor()));

        ticket.setEstrategia(conveniado);
        System.out.println("  Como Conveniado : " + moeda(ticket.calcularValor()));

        ticket.setEstrategia(mensalista);
        System.out.println("  Como Mensalista : " + moeda(ticket.calcularValor()));
    }

    private static String moeda(double valor) {
        return String.format("R$ %.2f", valor);
    }
}

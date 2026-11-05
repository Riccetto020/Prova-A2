package questao3;

public class Leite extends Complemento {
    private static final double VALOR = 2.00;

    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    protected String getNome() {
        return "Leite";
    }

    @Override
    protected double getValor() {
        return VALOR;
    }
}

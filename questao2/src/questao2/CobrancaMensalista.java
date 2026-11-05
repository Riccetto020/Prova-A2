package questao2;

public class CobrancaMensalista implements EstrategiaCobranca {
    public static final double VALOR_FIXO = 150.00;

    @Override
    public double calcular(int minutosPermanencia) {
        return VALOR_FIXO;
    }
}

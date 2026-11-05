package questao2;

public class CobrancaRotativo implements EstrategiaCobranca {
    public static final double VALOR_HORA = 10.00;

    @Override
    public double calcular(int minutosPermanencia) {
        int horasIniciadas = (int) Math.ceil(minutosPermanencia / 60.0);
        return horasIniciadas * VALOR_HORA;
    }
}

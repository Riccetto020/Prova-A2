package questao2;

public class CobrancaConveniado implements EstrategiaCobranca {
    public static final int MINUTOS_GRATUITOS = 30;
    public static final double VALOR_HORA = 10.00;
    public static final double PERCENTUAL_DESCONTO = 0.20;

    @Override
    public double calcular(int minutosPermanencia) {
        int minutosCobrados = Math.max(0, minutosPermanencia - MINUTOS_GRATUITOS);
        int horasIniciadas = (int) Math.ceil(minutosCobrados / 60.0);
        double valorBruto = horasIniciadas * VALOR_HORA;
        return valorBruto * (1 - PERCENTUAL_DESCONTO);
    }
}

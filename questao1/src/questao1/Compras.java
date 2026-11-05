package questao1;

import java.util.Optional;

public class Compras implements Observador {
    private static final int LIMITE_MINIMO = 5;

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        Optional.of(novaQuantidade)
                .filter(q -> q < LIMITE_MINIMO)
                .ifPresent(q -> System.out.println("[COMPRAS] ALERTA: estoque de '" + nomeProduto
                        + "' abaixo de " + LIMITE_MINIMO + " unidades (atual: " + q + ")."));
    }
}

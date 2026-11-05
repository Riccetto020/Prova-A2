package questao1;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Vendas implements Observador {
    private final Set<String> produtosZerados = new HashSet<>();

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        Optional.of(novaQuantidade)
                .filter(q -> q == 0)
                .ifPresent(q -> produtosZerados.add(nomeProduto));

        Optional.of(novaQuantidade)
                .filter(q -> q != 0)
                .filter(q -> produtosZerados.remove(nomeProduto))
                .ifPresent(q -> System.out.println("[VENDAS] ALERTA: '" + nomeProduto
                        + "' voltou a ter estoque (" + q + " unidades)."));
    }
}

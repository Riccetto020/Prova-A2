package questao1;

public class Auditoria implements Observador {
    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        System.out.println("[AUDITORIA] Produto '" + nomeProduto
                + "' teve o estoque alterado para " + novaQuantidade + ".");
    }
}

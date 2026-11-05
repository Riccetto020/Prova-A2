package questao1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Produto {
    private final String nome;
    private int quantidade;
    private final List<Observador> observadores = new ArrayList<>();

    public Produto(String nome, int quantidadeInicial) {
        this.nome = nome;
        this.quantidade = quantidadeInicial;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void adicionarObservador(Observador observador) {
        Optional.of(observador)
                .filter(o -> !observadores.contains(o))
                .ifPresent(observadores::add);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void setQuantidade(int novaQuantidade) {
        Optional.of(novaQuantidade)
                .filter(q -> q != this.quantidade)
                .ifPresent(q -> {
                    this.quantidade = q;
                    notificarObservadores();
                });
    }

    private void notificarObservadores() {
        new ArrayList<>(observadores).forEach(o -> o.atualizar(nome, quantidade));
    }
}

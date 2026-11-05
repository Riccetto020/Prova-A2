package questao1;

public class Main {
    public static void main(String[] args) {
        Produto notebook = new Produto("Notebook", 10);

        Observador compras = new Compras();
        Observador vendas = new Vendas();
        Observador auditoria = new Auditoria();

        notebook.adicionarObservador(compras);
        notebook.adicionarObservador(vendas);
        notebook.adicionarObservador(auditoria);

        System.out.println("--- Estoque 10 -> 7 ---");
        notebook.setQuantidade(7);

        System.out.println("--- Estoque 7 -> 7 (sem mudança: ninguém é notificado) ---");
        notebook.setQuantidade(7);

        System.out.println("--- Estoque 7 -> 3 (Compras deve alertar) ---");
        notebook.setQuantidade(3);

        System.out.println("--- Estoque 3 -> 0 (zerou) ---");
        notebook.setQuantidade(0);

        System.out.println("--- Estoque 0 -> 8 (Vendas deve alertar) ---");
        notebook.setQuantidade(8);

        System.out.println("--- Removendo Auditoria em tempo de execução ---");
        notebook.removerObservador(auditoria);

        System.out.println("--- Estoque 8 -> 2 (Auditoria não recebe mais) ---");
        notebook.setQuantidade(2);
    }
}

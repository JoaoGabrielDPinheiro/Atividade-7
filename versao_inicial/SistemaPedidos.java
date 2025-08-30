public class SistemaPedidos {
    public void criarPedido(String cliente, String produto, int quantidade) {
        System.out.println("Criando pedido para " + cliente);
        double preco = calcularPreco(produto, quantidade);
        System.out.println("Produto: " + produto + " | Quantidade: " + quantidade + " | Preço: " + preco);
        salvarPedidoNoBanco(cliente, produto, quantidade, preco);
        enviarEmailConfirmacao(cliente);
    }

    public double calcularPreco(String produto, int quantidade) {
        if (produto.equals("Caneta")) return 1.5 * quantidade;
        if (produto.equals("Caderno")) return 5.0 * quantidade;
        return 10.0 * quantidade;
    }

    public void salvarPedidoNoBanco(String cliente, String produto, int quantidade, double preco) {
        System.out.println("Salvando pedido no banco...");
        // Simulação de persistência
    }

    public void enviarEmailConfirmacao(String cliente) {
        System.out.println("Enviando e-mail de confirmação para " + cliente);
    }

    public static void main(String[] args) {
        SistemaPedidos sistema = new SistemaPedidos();
        sistema.criarPedido("João", "Caneta", 10);
    }
}
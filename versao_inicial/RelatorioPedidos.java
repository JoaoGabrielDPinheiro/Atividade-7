public class RelatorioPedidos {
    public void gerarRelatorio(String cliente, String produto, int quantidade) {
        double precoTotal = new SistemaPedidos().calcularPreco(produto, quantidade);
        System.out.println("===== RELATÓRIO DO PEDIDO =====");
        System.out.println("Cliente: " + cliente);
        System.out.println("Produto: " + produto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço Total: " + precoTotal);
        System.out.println("================================");
    }

    public static void main(String[] args) {
        RelatorioPedidos relatorio = new RelatorioPedidos();
        relatorio.gerarRelatorio("Maria", "Caderno", 5);
    }
}
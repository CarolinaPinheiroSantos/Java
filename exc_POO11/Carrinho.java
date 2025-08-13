package exc_POO11;

import java.util.HashMap;
import java.util.Map;

public class Carrinho {
    private Map<String, Integer> itens = new HashMap<>(); // produto e quantidade
    private Produto produtosDisponiveis; // referência para pegar os preços

    public Carrinho(Produto produtosDisponiveis) {
        this.produtosDisponiveis = produtosDisponiveis;
    }

    // Adiciona um produto
    public void adicionarProduto(String nomeProduto, int quantidade) {
        if (produtosDisponiveis.getDetalhe().containsKey(nomeProduto)) {
            itens.put(nomeProduto, itens.getOrDefault(nomeProduto, 0) + quantidade);
            System.out.println(quantidade + " x " + nomeProduto + " adicionado(s) ao carrinho.");
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    // Calcula o total sem desconto
    public double calcularTotal() {
        double total = 0.0;
        for (Map.Entry<String, Integer> entry : itens.entrySet()) {
            String nome = entry.getKey();
            int qtd = entry.getValue();
            double preco = produtosDisponiveis.getDetalhe().get(nome);
            total += preco * qtd;
        }
        return total;
    }

    // Aplica desconto
    public double aplicarDesconto(double percentual) {
        double total = calcularTotal();
        double desconto = total * (percentual / 100);
        return total - desconto;
    }

    // Mostra resumo da compra
    public void mostrarResumo(double percentualDesconto) {
        System.out.println("\nResumo da Compra:");
        for (Map.Entry<String, Integer> entry : itens.entrySet()) {
            String nome = entry.getKey();
            int qtd = entry.getValue();
            double preco = produtosDisponiveis.getDetalhe().get(nome);
            System.out.println(qtd + " x " + nome + " = R$ " + (preco * qtd));
        }
        double totalComDesconto = aplicarDesconto(percentualDesconto);
        System.out.println("Total com " + percentualDesconto + "% de desconto: R$ " + totalComDesconto);
    }
}

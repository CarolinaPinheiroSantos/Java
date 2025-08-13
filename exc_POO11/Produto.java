package exc_POO11;

import java.util.HashMap;
import java.util.Map;

public class Produto {
    private String nomeProduto;
    private Double preco;

//    public Produto(String nome, Double preco) {
//        this.nomeProduto = nome;
//        this.preco = preco;
//    }

    //    private Map<String, Float> informacaoProduto;

    private Map<String, Double> detalhe = new HashMap<String, Double>() {{
        put("Nescau", 10.50);
        put("Sabonete", 5.90);
        put("Farinha", 4.75);
    }};


    public void exibirInfo(){
        for (Map.Entry<String, Double> entry : detalhe.entrySet()) {
            System.out.println("- " + entry.getKey() + ": R$ " + entry.getValue());
        }
    }

//    public void aplicarDesconto(Double totalCompra, Double percentual){
//
//    }


    public String getNomeProduto() {
        return nomeProduto;
    }

    public Double getPreco() {
        return preco;
    }

    public Map<String, Double> getDetalhe() {
        return detalhe;
    }
}

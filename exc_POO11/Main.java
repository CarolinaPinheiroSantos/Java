package exc_POO11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu email: ");
        String email = scanner.nextLine();

        Cliente cliente = new Cliente(nome, email);
        cliente.mostrarDados();

        System.out.println("Esses são os produtos da loja:");
        Produto produtos = new Produto();
        produtos.exibirInfo();


        Carrinho carrinho = new Carrinho(produtos);

        for (int i=3; i > 0; i--){
            System.out.println("Escolha um produto: ");
            String produtoEscolhido = scanner.nextLine();

            System.out.println("Quantidade: ");
            int quantidade = scanner.nextInt();
            scanner.nextLine();

            carrinho.adicionarProduto(produtoEscolhido, quantidade);
        }

        System.out.println("Digite o % do desconto da compra: ");
        double percentual = scanner.nextDouble();

        carrinho.calcularTotal();
        carrinho.mostrarResumo(percentual);

    }

}

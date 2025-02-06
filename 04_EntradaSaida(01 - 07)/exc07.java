import java.util.Scanner;

public class exc07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Qual mes de venda: ");
        String mes = scanner.nextLine();

        System.out.print("Quantos carros vendidos: ");
        int carros_vendidos = scanner.nextInt();

        System.out.print("Qual foi o total das vendas na loja: ");
        double vendas_loja = scanner.nextDouble();

        int salario = 1500;
        int comissao_carro = carros_vendidos * 350;
        double comissao_loja = vendas_loja * 0.001;
        double total = salario + comissao_loja +comissao_carro;

        System.out.printf("Vendedor(a) : %s\ncomissão pelos carros vendidos: R$%d\ncomissão loja: R$%.2f\nsalario mes %s: R$%.2f", nome, comissao_carro, comissao_loja, mes, total);

    }
}

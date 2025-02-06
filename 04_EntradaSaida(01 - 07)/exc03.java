import java.util.Scanner;

public class exc03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valo da mercadoria: ");
        double valor = scanner.nextDouble();

        double representante = valor + (valor/100 * 20);
        double impostos = valor + (valor/100 * 30);
        double valor_venda = valor + representante + impostos;

        System.out.println("O valor do reepresentante " + representante);
        System.out.println("O valor do imposto " + impostos);
        System.out.println("O valor do venda dessa mercadoria " + valor_venda);

        scanner.close();
    }

}

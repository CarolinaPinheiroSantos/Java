import java.util.Scanner;
public class Exercico02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite qual produto você deseja: ");
        String produto = scanner.next();

        System.out.print("Digite qual valor do produto: ");
        double valor = scanner.nextDouble();

        System.out.println("Estamos com a promoção que acima de 12 unidades ganha desconto de 10%!!!!!!!!!!");
        System.out.print("Digite quantos produtos você deseja: ");
        int quantidade = scanner.nextInt();

        double total;
        double total_desconto;

        if (quantidade <= 12){
            total = valor * quantidade;
            System.out.println("O valor total da compra é " + total);
        } else {
            total = valor * quantidade;
            total_desconto = total - (total / 10);
            System.out.println("Você ganhou 10% de desconto! O valor total da compra é " + total + " e com desconto ficou " + total_desconto);
        }

    }
}

import java.util.Scanner;

public class exerc04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o encremento");
        int encremento = scanner.nextInt();


        for(int contagem = encremento; contagem <= numero; contagem += encremento){
            System.out.println(contagem);
        }
    }
}

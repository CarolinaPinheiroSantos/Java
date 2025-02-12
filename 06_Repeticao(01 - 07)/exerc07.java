import java.util.Scanner;

public class exerc07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int peso_maior = 0;
        String nome_peso_maior = "";
        int altura_maior = 0;
        String nome_altura_maior = "";

        while (contador < 6){
            contador ++;

            System.out.println("Digite nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite peso: ");
            int peso = scanner.nextInt();

            System.out.println("Digite altura: ");
            int altura = scanner.nextInt();
            scanner.nextLine();

            if (peso > peso_maior) {
                peso_maior = peso;
                nome_peso_maior = nome;
            }
            if (altura > altura_maior) {
                altura_maior = altura;
                nome_altura_maior = nome;
            }
        }
        System.out.printf("A pessoa mais pesada é %s e tem %d kg\n", nome_peso_maior, peso_maior);
        System.out.printf("A pessoa mais alta é %s e tem %d cm\n", nome_altura_maior, altura_maior);
    }
}

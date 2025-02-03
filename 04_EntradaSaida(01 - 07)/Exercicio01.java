import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira seus daos para cadastramento");
        System.out.print("Digite seu nome inteiro:");
        String nome = scanner.next();

        System.out.print("Digite dia de nascimento: ");
        int dia_nascimento = scanner.nextInt();

        System.out.print("Digite mes de nascimento: ");
        int mes_nascimento = scanner.nextInt();

        System.out.print("Digite ano de nascimento: ");
        int ano_nascimento = scanner.nextInt();

        System.out.print("Digite sua pretenção salarial: ");
        int pretenção_salarial = scanner.nextInt();

        System.out.print("Digite seu grau de ensino(ensino medio, ensino tecnico ou ensino superior): ");
        String grau_ensino = scanner.next();

        System.out.print("Digite qual seu cargo pretendido: ");
        String cargo = scanner.next();

        System.out.print("Possui CNH do tipo B(sim ou nao): ");
        String carta_carro = scanner.next();

        System.out.printf("Nome: %c \n Data de nascimento: %d/%d/%d", nome, dia_nascimento, mes_nascimento,ano_nascimento);
    }
}

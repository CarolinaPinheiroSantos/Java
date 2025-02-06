import java.util.Scanner;
public class exc01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira seus daos para cadastramento");
        System.out.print("Digite seu nome inteiro:");
        String nome = scanner.nextLine();

        System.out.print("Digite dia de nascimento: ");
        int dia_nascimento = scanner.nextInt();

        System.out.print("Digite mes de nascimento: ");
        int mes_nascimento = scanner.nextInt();

        System.out.print("Digite ano de nascimento: ");
        int ano_nascimento = scanner.nextInt();

        System.out.print("Digite sua pretenção salarial: ");
        int pretencao_salarial = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite seu grau de ensino(ensino medio, ensino tecnico ou ensino superior): ");
        String grau_ensino = scanner.nextLine();

        System.out.print("Digite qual seu cargo pretendido: ");
        String cargo = scanner.nextLine();

        System.out.print("Possui CNH do tipo B(sim ou nao): ");
        String cartaB = scanner.nextLine();

        System.out.println("\nResumo da documentação");
        System.out.printf("\nNome: %s \nData de nascimento: %d/%d/%d \nPretenção Salarial: R$%d \nGrau de ensino: %s \nCargo pretendido: %s \nPossui CNH tipo B: %s",
                nome, dia_nascimento, mes_nascimento, ano_nascimento, pretencao_salarial, grau_ensino, cargo, cartaB);
        System.out.println("Cadastro concluido com sucesso!!");

        scanner.close();
    }
}

import java.util.Scanner;

public class exerc03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quer opnar sobre o filme(s/n): ");
        String opcao = scanner.nextLine();

        int opniao1 = 0;
        int opniao2 = 0;
        int opniao3 = 0;
        int total = 0;

        while (opcao.equals("s")) {
            System.out.print("'Ainda estou aqui'\n1-Otimo \n2-Bom \n3-Ruim \nfoi um filme:");
            int opniao = scanner.nextInt();

            if (opniao == 1) {
                opniao1++;
            } else if (opniao == 2) {
                opniao2++;
            } else if (opniao == 3) {
                opniao3++;
            }
            total++;

            scanner.nextLine();
            System.out.print("Quer opnar sobre o filme novamente(s/n): ");
            opcao = scanner.nextLine();

        }
        int media = (opniao1 + opniao2 + opniao3) / 3;
        System.out.printf("\nTotal de pessoas que acharam otimo: %d", opniao1);
        System.out.printf("\nTotal de pessoas que acharam bom: %d", opniao2);
        System.out.printf("\nTotal de pessoas que acharam ruim: %d", opniao3);
        System.out.printf("\nMedia das notas do filme: %d", media);

    }
}

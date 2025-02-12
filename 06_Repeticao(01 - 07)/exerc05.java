import java.util.Scanner;

public class exerc05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int saldo_positivo = 0;
        int saldo_negativo = 0;
        int total = 0;

        System.out.print("Deseja digitar seu saldo(s/n): ");
        String opcao = scanner.nextLine();

        while (opcao.equals("s")){
            System.out.print("Digite seu saldo: R$");
            int saldo = scanner.nextInt();

            if (saldo > 0 ){
                saldo_positivo++;
            }else {
                saldo_negativo++;
            }
            total++;
            scanner.nextLine();
            System.out.print("Deseja digitar seu saldo(s/n): ");
            opcao = scanner.nextLine();
        }

        if (saldo_positivo >= (total/2)){
            System.out.println("Nenhum risco!");
        }else{
            System.out.println("Risco ao banco!!!!");
        }
    }
}

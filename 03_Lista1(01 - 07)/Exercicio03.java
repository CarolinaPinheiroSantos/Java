import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos gols o corinthians fez: ");
        int gol_corinthians = scanner.nextInt();

        System.out.print("Quantos gols o são paulo fez: ");
        int gol_saoPaulo = scanner.nextInt();

        if(gol_corinthians == gol_saoPaulo ){
            System.out.println("Empate do Derbi");
        } else if (gol_corinthians > gol_saoPaulo) {
            System.out.println("O timão ganhouuuuu");
        } else {
            System.out.println("É o são paulo ganhou afff 🙄");
        }
    }
}

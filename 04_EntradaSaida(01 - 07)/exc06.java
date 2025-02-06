import java.util.Scanner;

public class exc06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite sua outra nota: ");
        double nota2 = scanner.nextDouble();

        nota1 = nota1*0.4;
        nota2 = nota2*0.6;
        double media_notas = nota1 + nota2;

        System.out.println(media_notas);

        scanner.close();
    }
}

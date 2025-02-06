import java.util.Scanner;

public class exc04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        int antecessor = numero -1;
        int sucessor = numero +1;

        System.out.printf("“O número informado foi %s, o antecessor é %s e o sucessor é %s", numero, antecessor, sucessor);

        scanner.close();
    }
}

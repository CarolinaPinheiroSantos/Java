import java.util.Scanner;

public class exerc06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resultado = 0;
        System.out.print("Qual tabuada(ex:2): ");
        int multiplicador = scanner.nextInt();

        for(int multiplicando = 1; multiplicando <= 10; multiplicando++){
            resultado = multiplicador * multiplicando;
            System.out.printf("%d x %d = %d\n", multiplicador, multiplicando, resultado);
        }
    }
}

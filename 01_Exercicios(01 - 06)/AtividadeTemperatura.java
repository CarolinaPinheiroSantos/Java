import java.util.Scanner;

public class AtividadeTemperatura {

        public static void main(String[] args) {

// 1
// Transformar Graus celsius em fareihaint
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite quantos graus celsius: ");
            double celsius = scanner.nextDouble();

            double resultado = (celsius * 1.8) + 32;
            System.out.println("Essa temperatura em fareihaint é " + resultado);


// 2
// Transformar Graus fareihaint em celsius

            System.out.print("Digite quantos graus fareihaint: ");
            double fareihaint = scanner.nextDouble();

            double calculo = (fareihaint - 32) / 1.8;
            System.out.println("Essa temperatura em fareihaint é " + calculo);

            scanner.close();

        }
}

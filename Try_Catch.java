import java.util.Scanner;

public class Try_Catch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite um numero:");
            int numerador = scanner.nextInt();

            System.out.println("Digite um denominador:");
            int denominador = scanner.nextInt();

            int resultado = dividir(numerador, denominador);
            System.out.println("Resultado: "+ resultado);

        }catch (ArithmeticException e){
            System.out.println("probleminha de operacao aritmetica");

        }catch (Exception e){
            System.out.println("Entrada invalida");

        }finally {
            scanner.close();
            System.out.println("Programa finalizado");
        }
    }

    public static int dividir(int a, int b){
        return a/b;
    }
}

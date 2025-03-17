import java.util.Scanner;

public class ExemploThowNew {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            if (idade < 18) {
                throw new IllegalAccessException("Erro por idade minima ser de 18 anos");
            }
            System.out.println("Cadastrado realizado");
        } catch (IllegalAccessException e) {
            System.out.println("erro é:" + e.getMessage());
        } finally {
            System.out.println("Programa finalizdo");
        }
    }
}

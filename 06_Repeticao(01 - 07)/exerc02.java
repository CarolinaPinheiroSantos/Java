import java.util.Scanner;

public class exerc02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Idade acima de 50 anos
        int cont_idade = 0;
        System.out.println("Digite 10 idade: ");
        for (int i = 0; i < 10; i++) {
            int idade = scanner.nextInt();
            if (idade > 50) {
                cont_idade++;
            }
        }
        System.out.printf("%d tem idade acima de 50 anos", cont_idade);

//        Altura acima de 1.60m
        int cont_altura = 0;
        System.out.println("Digite 10 altura: ");
        for (int i = 0; i < 10; i++) {
            double altura = scanner.nextInt();
            if (altura > 1.60) {
                cont_altura++;
            }
        }
        System.out.printf("%d tem altura acima de 1.60m", cont_altura);

//        Peso abaixo de 80kg
        int cont_peso = 0;
        System.out.println("Digite 10 pesos: ");
        for (int i = 0; i < 10; i++) {
            double peso = scanner.nextInt();
            if (peso < 80) {
                cont_peso++;
            }
        }
        System.out.printf("%d tem peso acima de 80kg", cont_peso);
    }
}



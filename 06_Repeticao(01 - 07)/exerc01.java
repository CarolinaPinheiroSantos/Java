import java.util.Scanner;

public class exerc01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        while(true){
            System.out.println("O que deseja saber:");
            System.out.println("1 - Quantos números pares? \n2 - Quantos números ímpares? \n3 - Quantos negativos? \n4 - Quantos positivos? \n5 - Sair do programa");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    int pares = 0;
                    for (int numero : numeros) {
                        if (numero % 2 == 0) {
                            ++pares;
                        }
                    }
                    System.out.printf("Tem %d numeros pares", pares);
                    break;
                case 2:
                    int impar = 0;
                    for (int numero : numeros) {
                        if (numero % 2 != 0) {
                            ++impar;
                        }
                    }
                    System.out.printf("Tem %d numeros impares", impar);
                    break;
                case 3:
                    int negativo = 0;
                    for (int numero : numeros) {
                        if (numero < 0) {
                            ++negativo;
                        }
                    }
                    System.out.printf("Tem %d numeros negativos", negativo);
                    break;
                case 4:
                    int positivo = 0;
                    for (int numero : numeros) {
                        if (numero < 0) {
                            ++positivo;
                        }
                    }
                    System.out.printf("Tem %d numeros positivos", positivo);
                    break;
                case 5:
                    System.out.println("Saindo do programa");
                    System.exit(0);
                    break;
            }
            }
    }
}

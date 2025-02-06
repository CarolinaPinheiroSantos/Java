import java.util.Scanner;

public class exc02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero1;
        double numero2;
        double resultado;

        System.out.println("bem vindo a calculadora!");
        System.out.print("Digite primeiro numero: ");
        numero1 = scanner.nextInt();

        System.out.println("Qual operacão:\n1- Adição \n2- Subtração\n3- multiplicação\n4- divisão\n5- potenciação");
        int opcao = scanner.nextInt();

        System.out.println("Digite segundo numero: ");
        numero2 = scanner.nextInt();

        if(opcao == 1){
            resultado = numero1 + numero2;
            System.out.print(resultado);
        } else if (opcao == 2) {
            resultado = numero1 - numero2;
            System.out.print(resultado);
        } else if (opcao == 3) {
            resultado = numero1 * numero2;
            System.out.print(resultado);
        } else if (opcao == 4) {
            if(numero2 == 0){
                System.out.println("A divição não pode ser realizada");
            }else{
                resultado = numero1 / numero2;
                System.out.print(resultado);
            }
        } else if (opcao == 5) {
            resultado = Math.pow(numero1, numero2);
            System.out.print(resultado);
        } else {
            System.out.println("Digite uma opcao correta!!");
        }

        scanner.close();
    }
}

import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numeroRandom = Math.random() * 100;

        int numeroAleatorio = (int)numeroRandom;

        System.out.print("Adivinhe um numero de 1 a 100(Você tem 3 chancessss em): ");
        int numeroChute = scanner.nextInt();

        for (int i = 0; i < 2; i++){
            if (numeroAleatorio == numeroChute){
                System.out.println("Você acertouuuu!!!! vc é um genio");
            }else {
                System.out.println("Você errou😔");
            }
            System.out.print("Tente de novo, você consegue: ");
            numeroChute = scanner.nextInt();
        }
        System.out.println(numeroAleatorio);
        System.out.println("Na proxima quem sabe você consegue...");
        scanner.close();
    }
}

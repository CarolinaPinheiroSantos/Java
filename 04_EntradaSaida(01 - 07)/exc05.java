import java.util.Scanner;

public class exc05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora: ");
        int hora = scanner.nextInt();

        System.out.print("Digite os minutos: ");
        int minutos = scanner.nextInt();

        System.out.print("Digite os segundos: ");
        int segundos = scanner.nextInt();

        double horas_em_segundos = (hora * 3600) + (minutos * 60) + segundos;
        System.out.printf("O horario %d:%d:%d tem %.2f segundos", hora, minutos, segundos, horas_em_segundos);

        scanner.close();
    }
}

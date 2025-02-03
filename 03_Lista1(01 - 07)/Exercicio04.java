import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor_viagem = 3000;

        System.out.println("Lugares para passar férias: \n 1 - Maceió \n 2 - Porto de galinhas");
        System.out.print("Onde você pretende passar suas férias(1 ou 2): ");
        int lugar = scanner.nextInt();

        System.out.print("Deseja almoço/janta incluso: \n 1- Sim \n 2- Não. \n Digite 1 ou 2: ");
        int almoco_jantar = scanner.nextInt();

        if (lugar == 1 && almoco_jantar == 1){
            valor_viagem += valor_viagem;
            System.out.println("O valor da viagem fica " + valor_viagem);
        } else if (lugar == 1 && almoco_jantar == 2) {
            valor_viagem = valor_viagem + (valor_viagem/100 * 85);
            System.out.println("O valor da viagem fica " + valor_viagem);
        } else if (lugar == 2 && almoco_jantar == 1) {
            valor_viagem = valor_viagem + (valor_viagem/100 * 60);
            System.out.println("O valor da viagem fica " + valor_viagem);
        } else {
            valor_viagem = valor_viagem + (valor_viagem/100 * 45);
            System.out.println("O valor da viagem fica " + valor_viagem);
        }

    }


}

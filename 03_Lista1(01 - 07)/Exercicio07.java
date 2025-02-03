import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Qual lado é a pintinha da minha bochecha: ");
        System.out.print("1- Esqueda \n2- Direita \n3- ahhh você nem tem \nResposta:");
        int resultado1 = scanner.nextInt();

        if (resultado1 == 2){
            System.out.println("Arrasouuuuuuuuu, você deve ser muito minha amiga(o)");
        } else {
            System.out.println("Você não sabe, te odeio . ");
        }

        System.out.println("Eu sou loira natual: ");
        System.out.print("1- Sim \n2- Nao \n3- mais ou menos \nResposta:");
        int resultado2 = scanner.nextInt();

        if (resultado2 == 3){
            System.out.println("Ah tava facil, minimo né");
        }else {
            System.out.println("É dá pra melhorar né");
        }
    }
}

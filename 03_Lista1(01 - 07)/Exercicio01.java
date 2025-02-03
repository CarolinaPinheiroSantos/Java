import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade == 0){
            System.out.println("Você nem nasceu né");
        } else if (idade > 0 && idade <= 14 ){
            System.out.println("Você é uma criança!!");
        } else if (idade >= 15 && idade <= 17) {
            System.out.println("Você é um adolecente chato");
        } else if (idade >= 18 && idade <= 30) {
            System.out.println("Você esta ficando longe de jovem e ta quase adulto");
        } else {
            System.out.println("Você é aldulto ou velho");

        }
    }
}


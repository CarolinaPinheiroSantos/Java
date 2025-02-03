public class Exercicios05 {
    public static void main(String[] args) {
        double quantidade_atual = 100;
        double quantidade_maxima = 1000;
        double quantidade_minima = 20;
        double quantidade_media = (quantidade_maxima + quantidade_minima) / 2;

        if (quantidade_atual >= quantidade_media){
            System.out.println("Não efetuar compra");
        }else {
            System.out.println("Efetuar compra");
        }
    }
}

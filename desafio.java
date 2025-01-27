public class desafio {
    public static void main(String[] args) {
        double primeiro = Math.pow(-3.0 / 4.0, -2);
        double segundo = Math.pow(3, -1) / 4;
        double terceiro = Math.pow(-3.0 / 4.0, -1);

        double cima = (3 * primeiro) + (6 * segundo - 4);
        double baixo = (7 * terceiro) + 2;

        double resultado_final = Math.pow((cima / baixo), -1) + 4 ;

        System.out.println(resultado_final);
    }
}

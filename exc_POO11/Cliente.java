package exc_POO11;

public class Cliente {
    private String nomeCliente;
    private String email;

    public Cliente(String nomeCliente, String email){
        this.nomeCliente = nomeCliente;
        this.email = email;
    }

    public void mostrarDados(){
        System.out.println("Nome: " + this.nomeCliente);
        System.out.println("Email: " + this.email);
    }
}

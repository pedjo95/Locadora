
public abstract class Cliente {

    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }
    
    public abstract double discontoCliente();

}

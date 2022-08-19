public class PessoaFisica extends Cliente {
    
    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public double discontoCliente() {
        return 0.95;
    }
    
}


public class PessoaJuridica extends Cliente{

    private String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public double discontoCliente() {
        return 0.9;
    }

}

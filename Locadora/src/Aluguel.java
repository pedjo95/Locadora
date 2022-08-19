public class Aluguel {
    
    private Veiculo veiculo;
    private Cliente cliente;
    private int quantidadeDias;
    
    public Aluguel(Veiculo veiculo, Cliente cliente, int quantidadeDias) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.quantidadeDias = quantidadeDias;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }

    public double valorFinalAluguel(){
        
        if(cliente instanceof PessoaFisica && quantidadeDias > 5){
            return veiculo.diariaAutomovel() * quantidadeDias * cliente.discontoCliente();
        }
        else if(cliente instanceof PessoaJuridica && quantidadeDias > 3){
            return veiculo.diariaAutomovel() * quantidadeDias * cliente.discontoCliente() ;
        }
        return veiculo.diariaAutomovel() * quantidadeDias;
        
    }
    
}

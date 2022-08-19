public class VeiculoMedio extends Veiculo {

    public VeiculoMedio(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public double diariaAutomovel() {
        return 150.0;
    }
    
}

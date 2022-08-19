public class VeiculoSUV extends Veiculo {

    public VeiculoSUV(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public double diariaAutomovel() {
        return 200.0;
    }
    
}

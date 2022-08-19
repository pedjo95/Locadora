public class VeiculoPequeno extends Veiculo {

    public VeiculoPequeno(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public double diariaAutomovel() {
        return 100.0;
    }
    
}

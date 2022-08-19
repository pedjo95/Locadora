public class Aplicacao {
    public static void main(String[] args) throws Exception {

        VeiculoPequeno veiculo01 = new VeiculoPequeno("Ford", "K");
        PessoaFisica cliente01 = new PessoaFisica("Ari", "0123");
        Aluguel aluguel01 = new Aluguel(veiculo01, cliente01, 10);
        System.out.println(aluguel01.valorFinalAluguel());
        
        Veiculo veiculo02 = new VeiculoSUV("Porsche", "Cayenne");
        Cliente cliente02 = new PessoaJuridica("Banco Brasileiro", "0001");
        Aluguel aluguel02 = new Aluguel(veiculo02, cliente02, 5);
        System.out.println(aluguel02.valorFinalAluguel());
    }
}

package HerancaExemplo1;

public class VeiculoDAO {
    public String imprimirDadosVeiculo(VeiculoDTO veiculoDTO){
        return "A placa é: " + veiculoDTO.getPlaca() +
                "\nA cor é: " + veiculoDTO.getCor();
    }
}

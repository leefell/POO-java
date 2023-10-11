package HerancaExemplo1;

public class CarroDAO extends VeiculoDAO {
    public String imprimirDadosCarro(CarroDTO carroDTO){
        return imprimirDadosVeiculo(carroDTO) +
                "\nA Potência é: " + carroDTO.getPotencia() +
                "\nA quantidade de portas é: " + carroDTO.getQtd_portas();
    }
}

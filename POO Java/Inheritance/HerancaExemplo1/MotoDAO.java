package HerancaExemplo1;

public class MotoDAO extends VeiculoDAO{
    public String imprimirDadosMoto(MotoDTO motoDTO){
        return imprimirDadosVeiculo(motoDTO) + 
                "\nA Cilindrada é: " + motoDTO.getCilindrada() + 
                "\nO tipo do Motor é: " + motoDTO.getTipo_motor();
    }
}
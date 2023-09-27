package encapsulamentoTriangulo;

public class TrianguloDAO {
    private String classificacao;
    public String calcular(TrianguloDTO trianguloDTO){
        if((trianguloDTO.getLadoA() < trianguloDTO.getLadoB() + trianguloDTO.getLadoC()) &&
            (trianguloDTO.getLadoB() < trianguloDTO.getLadoA() + trianguloDTO.getLadoC()) &&
                (trianguloDTO.getLadoC() < trianguloDTO.getLadoA() + trianguloDTO.getLadoB())){
            
            if((trianguloDTO.getLadoA() == trianguloDTO.getLadoB()) && trianguloDTO.getLadoB() == trianguloDTO.getLadoC()){
                this.classificacao = "O triangulo e Equilatero, uma vez que os tres comprimentos sao iguais.";
            }
                
            else if((trianguloDTO.getLadoA() == trianguloDTO.getLadoB()) || trianguloDTO.getLadoA() == trianguloDTO.getLadoC()){
                        this.classificacao = "O triangulo e Isoceles, uma vez que o comprimento de dois lados sao iguais.";
            }
                
            else
                    this.classificacao = "O triangulo e Escaleno, uma vez que nenhum comprimento de seus lados sao iguais.";
            }else{
                    this.classificacao = "Os valores nao podem formar um triangulo.";
        }
        
        return classificacao;
    }
}   

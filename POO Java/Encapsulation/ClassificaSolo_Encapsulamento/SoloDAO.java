package ClassificaSolo_Encapsulamento;

public class SoloDAO {
    private String resposta;
    public String calcular(SoloDTO soloDTO){
        if((soloDTO.getPontosAgua() >= 0) && (soloDTO.getPontosAgua() <= 10)){
            this.resposta = "Rochosa.";
        }else if((soloDTO.getPontosAgua() > 10) && (soloDTO.getPontosAgua() <= 40)){
            this.resposta = "Firme.";
        }else if((soloDTO.getPontosAgua() > 40) && (soloDTO.getPontosAgua() <= 80)){
            this.resposta = "Pantanoso.";
        }else{
            this.resposta = "Quantidade de Água Invalido!";
        }
        
        return this.resposta;
    }
}


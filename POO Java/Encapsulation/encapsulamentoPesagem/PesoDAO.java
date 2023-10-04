package encapsulamentoPesagem;

public class PesoDAO {
    public String mensagem;
    public String classificar(PesoDTO pesoDTO){
        
        
        if(pesoDTO.getAltura() <= 1.20 && pesoDTO.getPeso() <= 60){
            mensagem =  "Classificação A";
        }else if(pesoDTO.getAltura() >= 1.20 && pesoDTO.getAltura() <= 1.70 && pesoDTO.getPeso() <= 60){
            mensagem =  "Classificação B";
        }else if(pesoDTO.getAltura() > 1.70 && pesoDTO.getPeso() <= 60){
            mensagem =  "Classificação C";
        }else if(pesoDTO.getAltura() < 1.20 && pesoDTO.getPeso() >= 60 && pesoDTO.getPeso() <= 90){
            mensagem =  "Classificação D";
        }else if(pesoDTO.getAltura() > 1.20 && pesoDTO.getAltura() <= 1.70 && pesoDTO.getPeso() >= 60 && pesoDTO.getPeso() <= 90){
             mensagem =  "Classificação E"; 
        }else if(pesoDTO.getAltura() > 1.70 && pesoDTO.getPeso() >= 60 && pesoDTO.getPeso() <= 90){
             mensagem =  "Classificação F";
        }else if(pesoDTO.getAltura() <= 1.20 && pesoDTO.getPeso() > 90){
            mensagem =  "Classificação G";
        }else if(pesoDTO.getAltura() >= 1.20 && pesoDTO.getAltura() <= 1.7 && pesoDTO.getPeso() > 90){
            mensagem =  "Classificação H";
        }else{
            mensagem = "Classificação I";
        }
     
        return mensagem;
        
    }
}
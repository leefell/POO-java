package EncapsulamentoEx2_CNH;

public class CartaDAO {
    public String mostrarDados(CartaDTO cartaDTO){
        if(cartaDTO.getIdade() >= 18){
            return("Está Habilitado a ter carta!");
        }else{
            return("Ainda não pode ter carta!");
        }
    }
}

package encapsulamentoPesagem;

public class PesoCTR {
    PesoDAO pesoDAO = new PesoDAO();
    
    public String mensagem(PesoDTO pesoDTO){
        return pesoDAO.classificar(pesoDTO);
    }
}

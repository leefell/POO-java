package encapsulamentoLanchonete;

public class LancheCTR {
    
    LancheDAO lancheDAO = new LancheDAO();
    
    public void calculo(LancheDTO lancheDTO){
        lancheDAO.calculo(lancheDTO);
    }
    
}

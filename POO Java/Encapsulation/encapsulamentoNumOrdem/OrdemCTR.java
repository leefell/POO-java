package encapsulamentoNumOrdem;

public class OrdemCTR {
    OrdemDAO ordemDAO = new OrdemDAO();
    
    public String mostrar(OrdemDTO ordemDTO){
        return ordemDAO.calculo(ordemDTO);
    }
}

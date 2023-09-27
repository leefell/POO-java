package ordenarNumero;
 
public class OrdemCTR {
    OrdemDAO ordemDAO = new OrdemDAO();
    
    public String mensagem(OrdemDTO ordemDTO){
        return ordemDAO.ordenar(ordemDTO);
    }
}

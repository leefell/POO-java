package ExInterface1;

public class MotoristaCTR {
    
    MotoristaDAO motoristaDAO = new MotoristaDAO();
    public String calcular(MotoristaDTO motoristaDTO){
        return motoristaDAO.calcular(motoristaDTO);
    }
}

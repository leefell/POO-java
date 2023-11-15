package Matriz;

public class CTR {
    
    DAO dao = new DAO();
    
    public String mostrarMatriz(DTO dto){
        return dao.mostrarMatriz(dto);
    }
    
}

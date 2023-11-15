package MatrizEx1;

public class CTR {
    
    DAO dao = new DAO();
    
    public String mostrarMatriz(DTO dto){
        return dao.mostrarMatriz(dto);
    }
    
    public String mostrarDiagonal(DTO dto){
        return dao.mostrarDiagonal(dto);
    }
}

package MatrizEx2;

public class CTR {
    
    DAO dao = new DAO();
    
    public String exibirMatriz(DTO dto){
        return dao.exibirMatriz(dto);
    }
}

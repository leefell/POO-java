package VetorEx3;

public class CTR {

    DAO dao = new DAO();
    
    public void escolher(DTO dto){
         dao.escolher(dto);
    }

    public void adicao(DTO dto){
        dao.adicao(dto);
    }

    public void subtracao(DTO dto){
        dao.subtracao(dto);
    }

    public void multiplicacao(DTO dto){
        dao.multiplicacao(dto);
    }

    public void divisao(DTO dto){
        dao.divisao(dto);
    }

    public String mensagem(DTO dto){
        return dao.mensagem(dto);
    }
}
package encapsulamentoTriangulo;

public class TrianguloCTR {
    TrianguloDAO trianguloDAO = new TrianguloDAO();
    
    public String classificacao(TrianguloDTO trianguloDTO){
        return trianguloDAO.calcular(trianguloDTO);
    }
}

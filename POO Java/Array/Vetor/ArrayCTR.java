package Vetor;

public class ArrayCTR {
    ArrayDAO arrayDAO = new ArrayDAO();
    public String verificarPosicao(ArrayDTO arrayDTO){
        return arrayDAO.verificarPosicao(arrayDTO);
    }   
}

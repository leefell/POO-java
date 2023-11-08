package VetorEx2;

public class ArrayCTR {
    
    ArrayDAO arrayDAO = new ArrayDAO();
    public void Calcular(ArrayDTO arrayDTO){
              arrayDAO.Calcular(arrayDTO);
    }
    
    public String imprimir(){
        return arrayDAO.imprimir();
    }
}

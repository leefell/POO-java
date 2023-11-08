package VetorEx1;

public class ArrayDAO {
    private String resposta = "";
    public String inverter(ArrayDTO arrayDTO){
        int n[] = arrayDTO.getN();
        for(int i = arrayDTO.getN().length - 1; i >= 0; i--){
            this.resposta += n[i] + "  ";
        }
        return this.resposta; 
    } 
}

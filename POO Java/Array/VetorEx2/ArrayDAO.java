package VetorEx2;

public class ArrayDAO {
    
    private int[] n1;
    private int[] n2;
    private int[] n3 = new int[5];
    private String resp = "";
    public void Calcular(ArrayDTO arrayDTO){
        n1 = arrayDTO.getVetor1();
        n2 = arrayDTO.getVetor2();
        
        for(int x = 0; x < n1.length; x++){
            n3[x] = n1[x] * n2[x];
        }   
}

    public String imprimir(){
            for(int x = 0; x < n3.length; x++){
                resp += n3[x] + " ";
            }
            return resp;
    }
}

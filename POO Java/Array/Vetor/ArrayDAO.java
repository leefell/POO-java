package Vetor;

public class ArrayDAO {
    private String resposta = "";
    public String verificarPosicao(ArrayDTO arrayDTO){
         int n[] = arrayDTO.getN();
         for(int i = 0; i < n.length; i++){
             if(i % 2 == 0){
                 this.resposta += n[i] + "\n";
             }
             // O return é as posições pares.
         }
         return this.resposta;
    }
}

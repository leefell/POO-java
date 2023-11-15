package Matriz;

public class DAO {
    String resposta = ""; 
    public String mostrarMatriz(DTO dto){
       int n[][] = dto.getN();
       for(int linha = 0; linha < 2; linha++){
           for(int coluna = 0; coluna < 3; coluna++){
               this.resposta += n[linha][coluna] + " ";
           }
           this.resposta += "\n";
       }
       return this.resposta;
    }
}
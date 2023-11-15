package MatrizEx2;

public class DAO {
    
    String mensagem = "";
    public String exibirMatriz(DTO dto){
        int n[][] = dto.getN();
        int media;
        
        this.mensagem += "Registro Escolar        Notas        Média\n";
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 6; j++){
                if(j == 5){
                    media = 0;
                    for(int b = 1; b < 5; b++){
                        media += n[i][b];
                    }
                    media = media/4;
                    n[i][j] = media;
                }
                 this.mensagem += n[i][j] + "          ";
            }
            this.mensagem += "\n";
        }
        
        return this.mensagem;
   }
}

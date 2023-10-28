package ExInterface1;

public class MotoristaDTO implements IMotoristaDTO {
    private int idade;
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
}

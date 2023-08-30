package ExSoma;

public class Soma {
    private int soma = 0;
    
    public void somarNumeros(int num){
        this.soma += num;      
    }
    
    public int imprimir(){
        return this.soma;
    }
}
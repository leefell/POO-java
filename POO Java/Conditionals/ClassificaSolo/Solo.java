package ClassificaSolo;

public class Solo {
    private int pontos;
   
    public String calcular(int pontos){
        this.pontos = pontos;
        
        if(this.pontos <= 10)
            return "Solo Rochoso.";
        else
            if(this.pontos > 10 && this.pontos <= 40)
                return "Solo Firme.";
            else
                if(this.pontos > 40 && this.pontos <= 80)
                    return "Solo Pantanoso.";
                else
                    return "Quantidade de água Inválida.";
    } 
}

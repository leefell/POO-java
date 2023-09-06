package Pesagem;

public class Peso {
  
    private double altura, peso;
    private String categoria;
    
    public String classificar(double altura, double peso){
        this.altura = altura;
        this.peso = peso;
              
        if(this.altura < 1.20){
            if(this.peso <= 60)
                this.categoria = "A";
            else
                if(this.peso > 60 && this.peso <= 90)
                    this.categoria = "D";
                else 
                    if(this.peso > 90)
                        this.categoria = "G";
        }
        else
            if((this.altura >= 1.20) && (this.altura <= 1.70)){
                if(this.peso <= 60)
                    this.categoria = "B";
                else
                    if(this.peso > 60 && this.peso <= 90)
                        this.categoria = "E";
                    else
                        if(this.peso > 90)
                            this.categoria = "H";
            }
        else
            if(this.altura > 1.70){
                if(this.peso <= 60)
                    this.categoria = "C";
                else
                    if(this.peso > 60 && this.peso <= 90)
                        this.categoria = "F";
                    else
                        if(this.peso > 90)
                            this.categoria = "I";
            }                
        
        return categoria;
    }
    
}

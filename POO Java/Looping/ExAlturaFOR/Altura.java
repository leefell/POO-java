package ExAlturaFOR;

public class Altura {
    
    private double somaAlturas = 0;
    private int maior2Metros = 0;
    private String texto = "";
    
    public void SomaAltura(double altura){
        if(altura > 2){
            maior2Metros ++;
        }
        
        this.somaAlturas += altura;
    }
    
    private double calculoMediaAlturas(){
        return somaAlturas / 20;
    }
    
    public String mostrarMedia(){
        
        this.texto = "A média das alturas é: "
                + this.calculoMediaAlturas() + "\n" + "Existem " + this.maior2Metros +
                " maiores que 2 metros.";
                
        return texto; 
    }
}

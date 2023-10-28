package polimorfismoExercicio1;

public class MediaDAO {
    
    double media;
    
    public void calcularMedia(MediaDTO mediaDTO){
        
        switch (mediaDTO.getOpc()) {
            case 1:
                this.calcularMedia(mediaDTO.getN1(), mediaDTO.getN2());
                break;
            case 2:
                this.calcularMedia(mediaDTO.getN1(), mediaDTO.getN2(), mediaDTO.getN3());
                break;
            case 3:
                this.calcularMedia(mediaDTO.getN1(), mediaDTO.getN2(), mediaDTO.getN3(), mediaDTO.getN4());
                break;
            default:
                System.out.println("Opção Inválida.");
                break;
        }
        
    }
    
    private void calcularMedia(double n1, double n2){
        
        this.media = (n1+n2)/2;
        
    }
    
    private void calcularMedia(double n1, double n2, double n3){
        
        this.media = (n1+n2+n3)/3;
        
    }
    
    private void calcularMedia(double n1, double n2, double n3, double n4){
        
        this.media = (n1+n2+n3+n4)/4;
        
    }
    
    public String imprimir(){
       return "\nA media das notas é: " + this.media; 
    }
    
}

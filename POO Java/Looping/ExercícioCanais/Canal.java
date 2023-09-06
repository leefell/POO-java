package ExercícioCanais;

public class Canal {
    
    private int canal_9, canal_12, canal_23, canal_40, outros;
    private String mensagem;
    
    public void votar(int num){
        switch (num) {
            case 9:
                this.canal_9++;
                break;
            case 12:
                this.canal_12++;
                break;
            case 23:
                this.canal_23++;
                break;
            case 40:
                this.canal_40++;
                break;
            case 0:
                break;
            default:
                this.outros++;
                break;
        }
    }
    
    public String mensagem(){
        mensagem = "Audiência do canal 9: " + this.canal_9 +
                   "\nAudiência do canal 12: " + this.canal_12 + 
                   "\nAudiência do canal 23: " + this.canal_23 +
                   "\nAudiência do canal 40: " + this.canal_40 +
                   "\nAudiência de outros  : " + this.outros;
                   
        return mensagem;              
    }
    
}

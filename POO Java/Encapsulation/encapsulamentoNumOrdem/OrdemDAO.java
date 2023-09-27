package encapsulamentoNumOrdem;

public class OrdemDAO {
    public String mostrar;
    public String calculo(OrdemDTO ordemDTO){
        if((ordemDTO.getN4() > ordemDTO.getN3())){
            this.mostrar = " " + ordemDTO.getN4() + " " + ordemDTO.getN3() + " " + ordemDTO.getN2() + " " + ordemDTO.getN1();
            
        }else if((ordemDTO.getN4() > ordemDTO.getN2())){
            this.mostrar = " " + ordemDTO.getN3() + " " + ordemDTO.getN4() + " " + ordemDTO.getN2() + " " + ordemDTO.getN1();
        }
        else if((ordemDTO.getN4() > ordemDTO.getN1())){
            this.mostrar = " " + ordemDTO.getN3() + " " + ordemDTO.getN2() + " " + ordemDTO.getN4() + " " + ordemDTO.getN1();
        }else
            this.mostrar = " " + ordemDTO.getN3() + " " + ordemDTO.getN2() + " " + ordemDTO.getN1() + " " + ordemDTO.getN4();
        
        return mostrar;
    } 

}

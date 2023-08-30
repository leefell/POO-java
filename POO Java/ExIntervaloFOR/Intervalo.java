package ExIntervaloFOR;

public class Intervalo {
    private int n1, n2;
    public String imprimir = "";
    public String mostrarIntervalo(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
        
        if(n1 < n2){
        for(int i = n1; i <=  n2; i++){
            if(i == n2){
                imprimir += i;
            break;
            }
            imprimir +=  i  + " - ";  
        }
               
      }      
         return imprimir;     
   }
}
//Faça um algoritmo que solicite dois números inteiros e mostre todos os números do intervalo;
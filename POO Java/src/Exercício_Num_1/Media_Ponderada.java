package Exercício_Num_1;

public class Media_Ponderada {
  
  private double num1, num2, num3, mediaF;
  private int peso1, peso2, peso3;
   
    public double InfoNota(double num1, double num2, double num3, int peso1, int peso2, int peso3){
       this.num1 = num1;
       this.num2 = num2;
       this.num3 = num3;
       this.peso1 = peso1;
       this.peso2 = peso2;
       this.peso3 = peso3;
       
       this.mediaF=(this.num1 * this.peso1 + this.num2 * this.peso2 + this.num3 * this.peso3) / (this.peso1 + this.peso2 + this.peso3);
       return this.mediaF;
    }
      
}

package Exercicio_Comissao;

public class Ex_Comissao {
    
    private double comissao;
    private double salario;
    private double salarioFinal;
    private double vendas;
    
    public String salFinal(double salario, double vendas){
        
        this.salario = salario;
        this.vendas = vendas;
        
        this.comissao = this.vendas * 0.04;
        
        this.salarioFinal = this.salario + this.comissao;
        
        return "O valor da comissao é: " + this.comissao + "\nO salário final do funcinário é: " + this.salarioFinal;
    }
    
    
    
}

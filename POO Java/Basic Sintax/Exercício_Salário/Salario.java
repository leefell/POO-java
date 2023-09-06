package Exercício_Salário;

public class Salario {

    private double salarioBase;
    private double aumento;
    private double salarioFinal;

    public double salarioNovo(double salarioBase, double aumento) {

        this.salarioBase = salarioBase;
        this.aumento = aumento;

        this.salarioFinal = this.salarioBase * (this.aumento / 100 + 1);
        return this.salarioFinal;
    }
}

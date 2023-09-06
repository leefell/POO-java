package Exercício_Salário;

import javax.swing.JOptionPane;

public class Principal_Salario {

    public static void main(String[] args) {

        Salario salario1 = new Salario();

        double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário base: "));
        double aumento = Double.parseDouble(JOptionPane.showInputDialog("Informe o percentual de aumento: "));

        JOptionPane.showMessageDialog(null, "O novo salário será R$ " + salario1.salarioNovo(salario, aumento));
    }
}

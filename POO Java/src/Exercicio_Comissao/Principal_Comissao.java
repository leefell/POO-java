package Exercicio_Comissao;

import javax.swing.JOptionPane;

public class Principal_Comissao {
    public static void main(String[] args){
        
        Ex_Comissao comissao = new Ex_Comissao();
        
        double salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário Fixo: "));
        double valorVendas = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor das vendas: "));
        
        JOptionPane.showMessageDialog(null, comissao.salFinal(salarioFixo, valorVendas));
    }
    
}

package If_Else_Ex01;

import javax.swing.JOptionPane;

public class Principal_Condicional {
    public static void main(String [] args){
        Condicional condicional = new Condicional();
        
        JOptionPane.showMessageDialog(null, "A situação do Aluno é: " +
                condicional.calcular(
                      Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota 1: ")),
                      Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota 2: "))
                ));       
    } 
}

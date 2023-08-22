package NumOrdem;

import javax.swing.JOptionPane;

public class Principal_Ordem {
    public static void main(String args[]){
        
        OrdemDecrescente ordemDecrescente = new OrdemDecrescente();
        
        JOptionPane.showMessageDialog(null, "Digite os três primeiros números em ordem crescente, e o 4 nao deve seguir a regra");
        JOptionPane.showMessageDialog(null, ordemDecrescente.ordenar(Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: ")),
                                      Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: ")),
                                      Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número: ")),
                                      Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto número: "))
        ));
    }   
}
package Pesagem;

import javax.swing.JOptionPane;

public class PrincipalPeso {
    
    public static void main(String args[]){
        
        Peso peso = new Peso();
        JOptionPane.showMessageDialog(null, "Classificação: " + peso.classificar(Double.parseDouble(JOptionPane.showInputDialog("Informe a altura: ")),
                Double.parseDouble(JOptionPane.showInputDialog("Informe o Peso: "))));
        
    }
    
}

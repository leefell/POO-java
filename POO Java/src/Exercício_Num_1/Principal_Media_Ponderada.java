package Exercício_Num_1;

import javax.swing.JOptionPane;

public class Principal_Media_Ponderada {
    public static void main(String[] args) {
       double num1, num2, num3;
       int peso1, peso2, peso3;
    
       Media_Ponderada nota = new Media_Ponderada();
       
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
        num3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: ")); 
        
        peso1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o peso 1: "));
        peso2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o peso 2: "));
        peso3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o peso 3: "));
     
       JOptionPane.showMessageDialog(null, nota.InfoNota(num1, num2, num3, peso1, peso2, peso3));
        
    }    
}

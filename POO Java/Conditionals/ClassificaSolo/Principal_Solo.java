package ClassificaSolo;

import javax.swing.JOptionPane;

public class Principal_Solo {
    public static void main(String [] args){
        Solo solo = new Solo();
        
        int pontos;
        pontos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de pontos de água: "));
        
        JOptionPane.showMessageDialog(null, solo.calcular(pontos));
    }
}

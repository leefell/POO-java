package ExAlturaFOR;

import javax.swing.JOptionPane;

public class PrincipalAltura {
    public static void main(String args[]){
        
        Altura obj = new Altura();
        for(int i = 1; i <= 20
                ; i++){
            obj.SomaAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe a altura " + i)));
        }
        
        JOptionPane.showMessageDialog(null, obj.mostrarMedia());
    } 
}

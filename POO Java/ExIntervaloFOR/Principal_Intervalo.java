package ExIntervaloFOR;

import javax.swing.JOptionPane;

public class Principal_Intervalo {
    public static void main(String args[]){
        
        Intervalo intervalo = new Intervalo();
        JOptionPane.showMessageDialog(null, intervalo.mostrarIntervalo(
                Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número ")),
                Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"))));
    }
}

package Switch_Case_Ex01;

import javax.swing.JOptionPane;

public class Principal_Operação {
    public static void main(String [] args){
        Operacao operacao = new Operacao();
        
        int op, n1, n2;
        op = Integer.parseInt(JOptionPane.showInputDialog("Informe a operação | 1 - Somar | 2 - Subtrair"));
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: "));
        
        JOptionPane.showMessageDialog(null, operacao.calcular(op, n1, n2));
        
    }
    
}

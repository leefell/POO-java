package ExSoma;

import javax.swing.JOptionPane;

public class PrincipalSomaFOR {
    
    public static void main(String args[]){
        
        Soma obj = new Soma();
        
        for(int i = 1; i <= 10; i++){
            obj.somarNumeros(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero " + i + ".")));
        }
        JOptionPane.showMessageDialog(null, "A soma dos números é: " +  obj.imprimir());
        
    }
    
}

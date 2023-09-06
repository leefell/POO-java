package ExemploWhileNum;

import javax.swing.JOptionPane;

public class PrincipalWhile {
    public static void main (String[] args){
        int numero;      
        ExWhile objeto = new ExWhile();
        
        do{
            numero = Integer.parseInt(
                  JOptionPane.showInputDialog("Informe o número | 0 - Sair"));
            objeto.somar(numero);
                
        }while(numero != 0);
        JOptionPane.showMessageDialog(null, "O resultado é: " + objeto.mostra());
    }
}

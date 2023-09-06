package ExemploDoWhile;

import javax.swing.JOptionPane;

public class PrincipalDoWhile {
    
    public static void main(String [] args){
        int numero;
        classeDoWhile objeto = new classeDoWhile();
        
        do{
            numero = Integer.parseInt(
            JOptionPane.showInputDialog("Informe o número"));
        objeto.somar(numero);
        }while(numero != 0);
        
        JOptionPane.showMessageDialog(null, "O resultado da soma é: " + objeto.mostra());
        
    }
    
}

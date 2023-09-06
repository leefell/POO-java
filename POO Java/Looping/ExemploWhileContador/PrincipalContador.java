package ExemploWhileContador;

import javax.swing.JOptionPane;

public class PrincipalContador {
    
    public static void main(String[] args){
        int cont = 1;
        int numero;
        Contador objeto = new Contador();
        while(cont <= 10){
            numero = Integer.parseInt(
            JOptionPane.showInputDialog("Informe o número: "));
         objeto.somar(numero);
         cont++;
        }
        JOptionPane.showMessageDialog(null, "O resultado da soma dos 10 números digitados é: " + objeto.mostra());
        
    }
    
}

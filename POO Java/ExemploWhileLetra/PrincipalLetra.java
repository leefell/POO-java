package ExemploWhileLetra;

import javax.swing.JOptionPane;

public class PrincipalLetra {

    public static void main(String args[]){
        String letra = "x";       
        ClasseLetra objeto = new ClasseLetra();
        
        //while(!letra.equalsIgnoreCase("x")){ = diferente de x
        while(letra.equalsIgnoreCase("x")){
            letra = JOptionPane.showInputDialog("Informe a letra");
            objeto.verificar(letra);
        }
        JOptionPane.showMessageDialog(null, "A quantidade de vezes que x foi digitado é: " + objeto.mostra());
    }
    
}

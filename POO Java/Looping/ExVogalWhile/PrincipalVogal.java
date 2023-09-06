package ExVogalWhile;

import javax.swing.JOptionPane;

public class PrincipalVogal {

    public static void main(String[] args) {

        String letra;

        Vogal objeto = new Vogal();
        do {
            letra = JOptionPane.showInputDialog("Digite uma letra: ");
            objeto.verificar(letra);

        } while (!letra.equals("0"));

        JOptionPane.showMessageDialog(null, objeto.Mostrar());
    }

}

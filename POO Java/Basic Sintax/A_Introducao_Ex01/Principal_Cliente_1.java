package A_Introducao_Ex01;

import javax.swing.JOptionPane;

public class Principal_Cliente_1 {

    public static void main(String[] args) {

        Cliente_1 cliente_1 = new Cliente_1();
        cliente_1.mostrar(JOptionPane.showInputDialog("Informe o nome: "), JOptionPane.showInputDialog("Informe o RG: "));
        
    }
}
 
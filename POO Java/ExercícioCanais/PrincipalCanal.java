package ExercícioCanais;

import javax.swing.JOptionPane;

public class PrincipalCanal {
    
    public static void main(String[] args){
        
        int canal;
        Canal objeto = new Canal();
        
        do{
            
            canal = Integer.parseInt(JOptionPane.showInputDialog("Digite seu canal favorito "
                    + "\n(9 | 12 | 23 | 40): "));
            objeto.votar(canal);
            
        }while(canal != 0);
        
        JOptionPane.showMessageDialog(null, objeto.mensagem());
        
    }
    
}

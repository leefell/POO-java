package MatrizEx1;

import javax.swing.JOptionPane;
// import java.util.Random;

public class VIEW {
    
    public static void main(String[] args) {
        
        //Random random = new Random();
        
        DTO dto = new DTO();
        CTR ctr = new CTR();
        
        int n[][] = new int[3][3];
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
               n[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número para a linha: " + i + " Coluna: " + j));
              //n[i][j] = random.nextInt(100);
            }
        }        
        dto.setN(n);
        JOptionPane.showMessageDialog(null, ctr.mostrarMatriz(dto));
        JOptionPane.showMessageDialog(null, ctr.mostrarDiagonal(dto));
    }
}
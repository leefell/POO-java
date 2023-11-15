package Matriz;

import javax.swing.JOptionPane;

public class VIEW {
    
    public static void main(String[] args){
        DTO dto = new DTO();
        CTR ctr = new CTR();
        int num [][] = new int[2][3];
        
        for(int linha = 0; linha < 2; linha++){
            for(int coluna = 0; coluna < 3; coluna++){
                num[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da linha: " +
                        linha + " coluna: " + coluna));
            }
        }
        dto.setN(num);
        JOptionPane.showMessageDialog(null, ctr.mostrarMatriz(dto));
    }
}
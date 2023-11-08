package Vetor;

import javax.swing.JOptionPane;

public class ArrayVIEW {
    public static void main(String[] args){
        ArrayDTO arrayDTO = new ArrayDTO();
        ArrayCTR arrayCTR = new ArrayCTR();
        int num[] = new int[5];
        
        for(int i = 0; i < 5; i++){
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número para a posição: " + i));
        }
        arrayDTO.setN(num);
        JOptionPane.showMessageDialog(null, arrayCTR.verificarPosicao(arrayDTO));
    }
}

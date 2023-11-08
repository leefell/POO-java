package VetorEx2;

import javax.swing.JOptionPane;

public class ArrayVIEW {
    
    public static void main(String[] args){
        int[] nx = new int[5];
        int[] nz = new int[5];
        
        ArrayDTO arrayDTO = new ArrayDTO();
        ArrayCTR arrayCTR = new ArrayCTR();
        
        for(int y = 0; y < 5; y++){
            nx[y] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número " + (y + 1) + " do vetor 1"));
        }
        arrayDTO.setVetor1(nx);
        
        for(int y = 0; y < 5; y++){
            nz[y] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número " + (y + 1) + " do vetor 2"));
        }
        arrayDTO.setVetor2(nz);
        arrayCTR.Calcular(arrayDTO);
        
        JOptionPane.showMessageDialog(null, arrayCTR.imprimir());
    }
    
}

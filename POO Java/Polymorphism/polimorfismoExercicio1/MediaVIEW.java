package polimorfismoExercicio1;

import javax.swing.JOptionPane;

public class MediaVIEW {
    
    public static void main(String[] args){
        
        MediaCTR mediaCTR = new MediaCTR();
        MediaDTO mediaDTO = new MediaDTO();
        
        try{
            
            mediaDTO.setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1: ")));
            mediaDTO.setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2: ")));
            mediaDTO.setN3(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3: ")));
            mediaDTO.setN4(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 4: ")));
            
            mediaDTO.setOpc(Integer.parseInt(JOptionPane.showInputDialog(
                    "[1] - Calcular a Media com apenas N1 e N2." +
                    "\n[2] - Calcular a Media com N1, N2 e N3." + 
                    "\n[3] - Calcular a Media com N1, N2 e N3."+
                    "\nInsira a opção:")));
            
            mediaCTR.calcularMedia(mediaDTO);
            JOptionPane.showMessageDialog(null, mediaCTR.imprimir());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}

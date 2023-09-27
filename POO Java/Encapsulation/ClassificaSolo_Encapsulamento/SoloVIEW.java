package ClassificaSolo_Encapsulamento;

import javax.swing.JOptionPane;

public class SoloVIEW {
    
    public static void main(String[] args){
        
        try{
            
            SoloCTR soloCTR = new SoloCTR();
            SoloDTO soloDTO = new SoloDTO();
            
            soloDTO.setPontosAgua(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Pontos d'agua: ")));
            
            JOptionPane.showMessageDialog(null, soloCTR.calcular(soloDTO));
               
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());     
    }
     
  } 
}

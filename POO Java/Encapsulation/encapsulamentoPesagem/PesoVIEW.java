package encapsulamentoPesagem;

import javax.swing.JOptionPane;

public class PesoVIEW {
    
    public static void main(String[] args){
        
        
        try{
            
            PesoCTR pesoCTR = new PesoCTR();
            PesoDTO pesoDTO = new PesoDTO();
            
            pesoDTO.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Digite a altura da pessoa: ")));
            pesoDTO.setPeso(Float.parseFloat(JOptionPane.showInputDialog("Digite o peso da pessoa: ")));
            
            JOptionPane.showMessageDialog(null, pesoCTR.mensagem(pesoDTO));      
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }      
    }
    
}

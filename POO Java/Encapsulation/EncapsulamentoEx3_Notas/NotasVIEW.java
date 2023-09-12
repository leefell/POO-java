package EncapsulamentoEx3_Notas;

import javax.swing.JOptionPane;

public class NotasVIEW {
    public static void main(String[] args){
        
        try{
            NotasDTO notasDTO = new NotasDTO();
            NotasCTR notasCTR = new NotasCTR();
        
            notasDTO.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1:")));
            notasDTO.setNota2(Double.parseDouble(
                    JOptionPane.showInputDialog("Informe a nota 2:")));
            
            JOptionPane.showMessageDialog(null, notasCTR.imprimir(notasDTO));    
 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
        
    }

}   

    

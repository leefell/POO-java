package encapsulamentoTriangulo;

import javax.swing.JOptionPane;

public class TrianguloVIEW {
    
    public static void main(String[] args){
        
        try{
            
            TrianguloCTR trianguloCTR = new TrianguloCTR();
            TrianguloDTO trianguloDTO = new TrianguloDTO();
            
            trianguloDTO.setLadoA(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do Lado A: ")));
            trianguloDTO.setLadoB(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do Lado B: ")));
            trianguloDTO.setLadoC(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do Lado C: ")));
            
            JOptionPane.showMessageDialog(null, trianguloCTR.classificacao(trianguloDTO));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }      
    }
    
}

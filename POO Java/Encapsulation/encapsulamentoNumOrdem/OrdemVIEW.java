package encapsulamentoNumOrdem;

import javax.swing.JOptionPane;

public class OrdemVIEW {
    
    public static void main(String[] args){
        
        try{
            
            OrdemCTR ordemCTR = new OrdemCTR();
            OrdemDTO ordemDTO = new OrdemDTO();
           
            ordemDTO.setN1(Integer.parseInt(JOptionPane.showInputDialog("Digite os 3 primeiros números em ordem, o 4 aleatoriamente." + "\nDigite o primeiro número: ")));
            ordemDTO.setN2(Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: ")));
            ordemDTO.setN3(Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número: ")));
            ordemDTO.setN4(Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto número: ")));
            
            JOptionPane.showMessageDialog(null, "A ordem decrescente dos numeros é: " + ordemCTR.mostrar(ordemDTO));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
        
        
    }
    
}

package ordenarNumero;

import javax.swing.JOptionPane;

public class OrdemVIEW {
    
    public static void main(String[] args){
        
        try{
            
            OrdemCTR ordemCTR = new OrdemCTR();
            OrdemDTO ordemDTO = new OrdemDTO();
           
            ordemDTO.setN1(Integer.parseInt(JOptionPane.showInputDialog("Digite 4 para serem ordenados." + "\nDigite o primeiro número: ")));
            ordemDTO.setN2(Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: ")));
            ordemDTO.setN3(Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número: ")));
            
            JOptionPane.showMessageDialog(null, "A ordem crescente dos numeros é: " + ordemCTR.mensagem(ordemDTO));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
    }
}

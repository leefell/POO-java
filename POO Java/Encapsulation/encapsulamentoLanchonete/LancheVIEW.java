package encapsulamentoLanchonete;

import javax.swing.JOptionPane;

public class LancheVIEW {
    
    public static void main(String[] args){
        
        try{
            
            LancheCTR lancheCTR = new LancheCTR();
            LancheDTO lancheDTO = new LancheDTO();
            
            do{
                
                lancheDTO.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Codigo -------- Produto --------- Preço(R$) \n" +
                                                                             "1   -------- Hamburguer -------- 6.00 \n" +
                                                                             "2   -------- CheeseBurguer -------- 7.00 \n" +
                                                                             "3   -------- Misto Quente -------- 5.00 \n" +
                                                                             "4   -------- Americano -------- 4.00 \n" +
                                                                             "5   -------- Queijo Prato -------- 3.00 \n" +
                                                                             "0   -------- Sair \n" +
                                                                             "Digite o codigo do produto: ")));
                
                lancheCTR.calculo(lancheDTO);
            }while(lancheDTO.getCodigo() != 0);

            JOptionPane.showMessageDialog(null, "Total: R$" + lancheDTO.getTotal());
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
        
    }
    
}

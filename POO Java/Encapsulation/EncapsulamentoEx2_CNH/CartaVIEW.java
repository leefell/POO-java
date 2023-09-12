package EncapsulamentoEx2_CNH;

import javax.swing.JOptionPane;

public class CartaVIEW {
    public static void main(String[] args){
        
        try{
            
            CartaCTR cartaCTR = new CartaCTR();
            CartaDTO cartaDTO = new CartaDTO();
            
            cartaDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")));
                                                              
            JOptionPane.showMessageDialog(null, cartaCTR.imprimir(cartaDTO));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
        
    }
}

/*
CTR = 
DAO =
CTR = Controle
VIEW = Interage com o usuário
*/


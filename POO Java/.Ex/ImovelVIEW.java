package Exercicio01;

import javax.swing.JOptionPane;

public class ImovelVIEW {
    
    public static void main(String[] args){
        
        try{
            
            CasaCTR casaCTR = new CasaCTR();
            CasaDTO casaDTO = new CasaDTO();
            
            JOptionPane.showMessageDialog(null, "Cadastrando Imovel. ");
            casaDTO.setCidade(JOptionPane.showInputDialog("Cidade: "));
            casaDTO.setBairro(JOptionPane.showInputDialog("Bairro: "));
            casaDTO.setEndereco(JOptionPane.showInputDialog("Endereço: "));
            casaDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Numero da casa: ")));
            casaDTO.setProprietario(JOptionPane.showInputDialog("Proprietario: "));
            casaDTO.setN_quartos(Integer.parseInt(JOptionPane.showInputDialog("Numero de Quartos: ")));
            casaDTO.setN_banheiros(Integer.parseInt(JOptionPane.showInputDialog("Numero de Banheiros: ")));
            
            JOptionPane.showMessageDialog(null, casaCTR.publicarDados(casaDTO));
            
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + e.getMessage());
        }
        
    }
    
}

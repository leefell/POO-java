package ExPolimorfismo1;

import javax.swing.JOptionPane;

public class ClienteVIEW {
    public static void main(String[] args){
      
        
      ClienteDTO clienteDTO = new ClienteDTO();
      ClienteCTR clienteCTR = new ClienteCTR();
      
      clienteDTO.setNome(JOptionPane.showInputDialog("Informe o Nome: "));
      clienteDTO.setRg(JOptionPane.showInputDialog("Informe o RG: "));
      clienteDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: ")));
      clienteDTO.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe a Altura: ")));
      
      JOptionPane.showMessageDialog(null, clienteCTR.mostrarInformacoes(clienteDTO));
 }   
}
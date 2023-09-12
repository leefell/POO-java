package EncapsulamentoEx1;

import javax.swing.JOptionPane;

public class ClienteVIEW {

    public static void main(String[] args) {

        try {

            FuncionarioCTR funcionarioCTR = new FuncionarioCTR();
            FuncionarioDTO funcionarioDTO = new FuncionarioDTO();

            funcionarioDTO.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código: ")));
            funcionarioDTO.setTelefone(JOptionPane.showInputDialog("Digite o Telefone: "));

            JOptionPane.showMessageDialog(null, funcionarioCTR.imprimir(funcionarioDTO));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
    }
}

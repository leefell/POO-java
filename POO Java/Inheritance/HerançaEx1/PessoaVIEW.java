package HerançaEx1;

import javax.swing.JOptionPane;

public class PessoaVIEW {
    
    public static void main(String[] args){
        
        try{
            
            FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
            FuncionarioCTR funcionarioCTR = new FuncionarioCTR();
            
            JOptionPane.showMessageDialog(null, "Trabalhando com funcionario.");
            funcionarioDTO.setNome(JOptionPane.showInputDialog("Nome: "));
            funcionarioDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade: ")));
            funcionarioDTO.setEndereco(JOptionPane.showInputDialog("Endereço: "));
            funcionarioDTO.setTelefone(JOptionPane.showInputDialog("Telefone: "));
            funcionarioDTO.setSiape(JOptionPane.showInputDialog("Siape: "));
            funcionarioDTO.setFuncao(JOptionPane.showInputDialog("Funcao: "));
            
            JOptionPane.showMessageDialog(null, funcionarioCTR.mostrarDadosFuncionario(funcionarioDTO));
            JOptionPane.showMessageDialog(null, funcionarioCTR.aponsetadoria(funcionarioDTO));
            
            AlunoDTO alunoDTO = new AlunoDTO();
            AlunoCTR alunoCTR = new AlunoCTR();
            
            JOptionPane.showMessageDialog(null, "Trabalhando com Aluno.");
            alunoDTO.setNome(JOptionPane.showInputDialog("Nome: "));
            alunoDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade: ")));
            alunoDTO.setTelefone(JOptionPane.showInputDialog("Telefone: "));
            alunoDTO.setProntuario(JOptionPane.showInputDialog("Prontuario: "));
            alunoDTO.setCurso(JOptionPane.showInputDialog("Curso: "));
            
            JOptionPane.showMessageDialog(null, alunoCTR.mostrarDadosAluno(alunoDTO));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + e.getMessage());
        }
        
        
    }
    
}

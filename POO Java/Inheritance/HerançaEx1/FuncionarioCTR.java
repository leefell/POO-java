package HerançaEx1;

public class FuncionarioCTR {
    
    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    public String mostrarDadosFuncionario(FuncionarioDTO funcionarioDTO){
        return funcionarioDAO.mostrarDadosFuncionario(funcionarioDTO);
    }
    
}

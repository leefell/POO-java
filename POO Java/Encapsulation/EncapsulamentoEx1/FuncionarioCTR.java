package EncapsulamentoEx1;

public class FuncionarioCTR {
    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    
    public String imprimir(FuncionarioDTO funcionarioDTO){
        return funcionarioDAO.imprimir(funcionarioDTO);
    }
    
}

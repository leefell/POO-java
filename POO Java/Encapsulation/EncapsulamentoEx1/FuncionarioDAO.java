package EncapsulamentoEx1;

public class FuncionarioDAO {
    public String imprimir(FuncionarioDTO funcionarioDTO){
        return "O código informado foi: " + 
                funcionarioDTO.getCodigo()
                +"\nO telefone informado foi: " +
                funcionarioDTO.getTelefone();
    }
}

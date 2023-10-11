package HerançaEx1;

public class FuncionarioDAO extends PessoaDAO{
    
    public String mostrarDadosFuncionario(FuncionarioDTO funcionarioDTO){
        return mostrarDadosPessoa(funcionarioDTO) +
               "\nSiape: " + funcionarioDTO.getSiape() +
               "\nFuncao: " + funcionarioDTO.getFuncao()+ 
               "\n" + this.aponsentaria(funcionarioDTO) + " anos para aposentar!";
    }
    
    public String aponsentaria(FuncionarioDTO funcionarioDTO){
        
        if(funcionarioDTO.getIdade() > 60)
            return "\nO funcionário ja pode se aposentar!";
        else
            return "Ainda faltam: " + (60 - funcionarioDTO.getIdade());
        
    }
    
}


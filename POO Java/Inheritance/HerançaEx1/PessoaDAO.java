package HerançaEx1;

public class PessoaDAO {
    public String mostrarDadosPessoa(PessoaDTO pessoaDTO){
        
        return "Nome: " + pessoaDTO.getNome() +
               "\nEndereço: " + pessoaDTO.getEndereco() +
               "\nTelefone: " + pessoaDTO.getTelefone() +
               "\nIdade: " + pessoaDTO.getIdade();
    }
}

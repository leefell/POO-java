package HerançaEx1;

public class PessoaCTR {

    PessoaDAO pessoaDAO = new PessoaDAO();
    public String mostrarDadosPessoa(PessoaDTO pessoaDTO){
        return pessoaDAO.mostrarDadosPessoa(pessoaDTO);
    }
}

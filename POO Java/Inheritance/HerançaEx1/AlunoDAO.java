package HerançaEx1;

public class AlunoDAO extends PessoaDAO{
    public String mostrarDadosAluno(AlunoDTO alunoDTO){
        
        return mostrarDadosPessoa(alunoDTO) +
               "\nCurso: " + alunoDTO.getCurso() + 
               "\nProntuario: " + alunoDTO.getProntuario();
    }
}

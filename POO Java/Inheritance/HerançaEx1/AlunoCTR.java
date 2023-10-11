package HerançaEx1;

public class AlunoCTR {
    AlunoDAO alunoDAO = new AlunoDAO();
    public String mostrarDadosAluno(AlunoDTO alunoDTO){
        return alunoDAO.mostrarDadosAluno(alunoDTO);
    }
}

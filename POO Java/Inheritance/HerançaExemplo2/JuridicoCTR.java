package HerançaExemplo2;

public class JuridicoCTR {
   
    JuridicoDAO juridicoDAO = new JuridicoDAO();
    public String mostrarDadosJuridico(JuridicoDTO juridicoDTO){
        return juridicoDAO.mostrarDadosJuridico(juridicoDTO);
    }
}

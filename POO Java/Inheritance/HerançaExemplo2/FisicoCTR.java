package HerançaExemplo2;

public class FisicoCTR {
    
    FisicoDAO fisicoDAO = new FisicoDAO();
    public String mostrarDadosFisico(FisicoDTO fisicoDTO){
        return fisicoDAO.mostrarDadosFisico(fisicoDTO);
    }
}

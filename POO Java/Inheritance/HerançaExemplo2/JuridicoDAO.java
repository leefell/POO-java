package HerançaExemplo2;

public class JuridicoDAO extends ClienteDAO{
    public String mostrarDadosJuridico(JuridicoDTO juridicoDTO){
        
        return mostrarDadosCliente(juridicoDTO) + 
               "\nCPNJ: " + juridicoDTO.getCnpj() +
               "\nI.E: " + juridicoDTO.getIe();
    }
}

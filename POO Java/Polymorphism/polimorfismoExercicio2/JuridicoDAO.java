package polimorfismoExercicio2;

public class JuridicoDAO extends ClienteDAO{
    public String mostrarDadosJuridico(JuridicoDTO juridicoDTO){
        
        return super.mostrarDadosCliente(juridicoDTO) + 
               "\nCPNJ: " + juridicoDTO.getCnpj() +
               "\nI.E: " + juridicoDTO.getIe();
    }
}
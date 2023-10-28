package polimorfismoExercicio2;

public class FisicoDAO extends ClienteDAO{
    public String mostrarDadosFisico(FisicoDTO fisicoDTO){
        
        return super.mostrarDadosCliente(fisicoDTO) + 
               "\nCPF: " + fisicoDTO.getCpf() + 
               "\nRG: " + fisicoDTO.getRg();
    }
}
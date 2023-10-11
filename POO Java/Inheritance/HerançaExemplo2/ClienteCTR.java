package HerançaExemplo2;

public class ClienteCTR {
    
    ClienteDAO clienteDAO = new ClienteDAO();
    public String mostrarDadosCliente(ClienteDTO clienteDTO){
        return clienteDAO.mostrarDadosCliente(clienteDTO);
    }
}

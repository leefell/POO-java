package polimorfismoExercicio2;

public class ClienteDAO {
    public String mostrarDadosCliente(ClienteDTO clienteDTO){
        
        return "Nome: " + clienteDTO.getNome() +
               "\nEstado: " + clienteDTO.getEstado() +
               "\nCidade: " + clienteDTO.getCidade() +
               "\nEndereço: " + clienteDTO.getEndereço();
    }
}
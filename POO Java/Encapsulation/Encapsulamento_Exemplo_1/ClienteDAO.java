package Encapsulamento_Exemplo_1;

public class ClienteDAO {
    
    public String mostrarNomeRg(ClienteDTO clienteDTO){
        return "O nome informado foi: "
                + clienteDTO.getNome() + "\n O RG informado foi: "
                + clienteDTO.getRg()
                + "\n A idade informada foi: " + clienteDTO.getIdade();
    }       
    
    public String mostrarNomeIdade(ClienteDTO clienteDTO){
        return "O nome informado foi: "
                + clienteDTO.getNome()
                + "\n A idade informada foi: " + clienteDTO.getIdade();     
    }
}

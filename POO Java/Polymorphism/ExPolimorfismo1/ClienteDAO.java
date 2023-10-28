package ExPolimorfismo1;

public class ClienteDAO {
    
    public String mostrarInformacoes(ClienteDTO clienteDTO){
        return "O nome informado foi: " + clienteDTO.getNome() +
                "\n O RG informado foi: " + clienteDTO.getRg() +
                verifica(clienteDTO.getIdade()) +
                verifica(clienteDTO.getAltura());
    }
    
    private String verifica(int idade){
        if(idade >= 18){
            return "\n Idade maior que 18 anos, pode entrar no brinquedo ";
        }else{
            return "\n Idade menor que 18 anos, não pode entrar no brinquedo ";
        }
    }
    
    private String verifica(double altura){
        if(altura >= 1.50){
            return "\n Altura maior que 1.50, pode entrar no brinquedo ";
        }else{
            return "\n Altura menor que 1.50, não pode entrar no brinquedo ";
        }
    }
    
    
}

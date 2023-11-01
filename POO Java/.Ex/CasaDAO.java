package Exercicio01;

public class CasaDAO extends ImovelDTO{
    
    private String mensagem;
    
    public String publicarDados(CasaDTO casaDTO){
        mensagem = "Cidade: " + casaDTO.getCidade() + "\nBairro: " + casaDTO.getBairro() +
                "\nEndereço: " + casaDTO.getEndereco() + "\nNúmero da casa: " + casaDTO.getNumero() +
                "\nProprietario: " + casaDTO.getProprietario() + "\nNúmero de Quartos: " + casaDTO.getN_quartos() +
                "\nNúmero de Banheiros: " + casaDTO.getN_banheiros();
        
        return mensagem;
    }
    
}

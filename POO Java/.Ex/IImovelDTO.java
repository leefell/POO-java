package Exercicio01;

public interface IImovelDTO {
    
    void setEndereco(String endereco);
    void setNumero(int numero);
    void setBairro(String bairro);
    void setCidade(String cidade);
    void setProprietario(String proprietario);
    
    String getEndereco();
    int getNumero();
    String getBairro();
    String getCidade();
    String getProprietario();
    
}

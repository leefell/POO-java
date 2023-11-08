 package VetorEx3;

public class DTO {
    private int[] vetor1 = new int[5];
    private int[] vetor2 = new int[5];
    private String escolha;

    public String getEscolha() {
        return escolha;
    }

    public void setEscolha(String escolha) {
        this.escolha = escolha;
    }
    
    public int[] getVetor1() {
        return vetor1;
    }

    public void setVetor1(int[] vetor1) {
        this.vetor1 = vetor1;
    }

    public int[] getVetor2() {
        return vetor2;
    }

    public void setVetor2(int[] vetor2) {
        this.vetor2 = vetor2;
    }
}
package VetorEx3;

public class DAO {
    private int[] n1;
    private int[] n2;
    private double[] n3 = new double[5];
    private String opc;
    private String mensagem = "";

    public void escolher(DTO dto) {
        opc = dto.getEscolha().toUpperCase();
        
        switch (opc) {
            case "A":
                this.adicao(dto);
                break;
            case "S":
                this.subtracao(dto);
                break;
            case "M":
                this.multiplicacao(dto);
                break;
            case "D":
                this.divisao(dto);
                break;
            default:
                mensagem = "Opção Inválida!";
                break;
        }
    }

    public void adicao(DTO dto) {
        n1 = dto.getVetor1();
        n2 = dto.getVetor2();

        for (int i = 0; i < n1.length; i++) {
            n3[i] = (n1[i] + n2[i]);
        }
    }

    public void subtracao(DTO dto) {
        n1 = dto.getVetor1();
        n2 = dto.getVetor2();

        for (int i = 0; i < n1.length; i++) {
            n3[i] = (n1[i] - n2[i]);
        }
    }

    public void multiplicacao(DTO dto) {
        n1 = dto.getVetor1();
        n2 = dto.getVetor2();

        for (int i = 0; i < n1.length; i++) {
            n3[i] = (n1[i] * n2[i]);
        }
    }

    public void divisao(DTO dto) {
        n1 = dto.getVetor1();
        n2 = dto.getVetor2();

        for (int i = 0; i < n1.length; i++) {
            n3[i] = (n1[i] / n2[i]);
        }
    }

    public String mensagem(DTO dto) {
        this.escolher(dto);
        mensagem = "";
        for (int i = 0; i < n3.length; i++) {
            this.mensagem += n3[i] + "  ";
        }
        return this.mensagem;
    }
}

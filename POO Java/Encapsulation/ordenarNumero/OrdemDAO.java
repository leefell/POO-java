package ordenarNumero;

public class OrdemDAO {
    private String mensagem;

    public String ordenar(OrdemDTO ordemDTO) {
        int n1 = ordemDTO.getN1();
        int n2 = ordemDTO.getN2();
        int n3 = ordemDTO.getN3();

        if (n1 > n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }

        if (n2 > n3) {
            int temp = n2;
            n2 = n3;
            n3 = temp;
        }

        if (n1 > n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }

        this.mensagem = n1 + " " + n2 + " " + n3;
        return mensagem;
    }
}

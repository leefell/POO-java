package Switch_Case_Ex01;

public class Operacao {
    private int opcao, n1, n2;
    public String calcular(int opcao, int n1, int n2){
        this.opcao = opcao;
        this.n1 = n1;
        this.n2 = n2;
        
        switch(this.opcao){
            case 1:
                return "O resultado é: " + (this.n1 + this.n2); // nao tem break, por causa do return, ele faz a case e ja retorna o valor
            case 2:
                return "O resultado é: " + (this.n1 - this.n2);
            default:
                return "Opção Inválida.";
        }
    }
}

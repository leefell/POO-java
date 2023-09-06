package NumOrdem;

public class OrdemDecrescente {
    private int n1, n2, n3, n4;
    
    public String ordenar(int n1, int n2, int n3, int n4){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        
        if(this.n4 > this.n3)
            return "A ordem é: " + n4 + "-" + n3 + "-" + n2 + "-" + n1;
        else
            if(this.n4 > this.n2)
                return "A ordem é: " + n3 + "-" + n4 + "-" + n2 + "-" + n1;
            else
                if(this.n4 > this.n1)
                    return "A ordem é: " + n3 + "-" + n2 + "-" + n4 + "-" + n1;
                else
                    return "A ordem é: " + n3 + "-" + n2 + "-" + n1 + "-" + n4;
    }
}

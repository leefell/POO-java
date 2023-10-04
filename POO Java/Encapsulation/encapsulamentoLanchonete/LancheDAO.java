package encapsulamentoLanchonete;

public class LancheDAO {
    public void calculo(LancheDTO lancheDTO){
        float total = lancheDTO.getTotal();

         switch(lancheDTO.getCodigo()){
             
             case 1:
                 total += 6.0;
                 break;
             case 2:
                 total += 7.0;
                 break;
             case 3:
                 total += 5.0;
                 break;
             case 4:
                 total += 4.0;
                 break;
             case 5:
                 total += 3.0;
                 break;
             case 0:
                 break;
             
        }

       lancheDTO.setTotal(total);
    }
}

package HerancaExemplo1;

public class CarroCTR {
   CarroDAO carroDAO = new CarroDAO();
   public String imprimirDadosCarro(CarroDTO carroDTO){
       return carroDAO.imprimirDadosCarro(carroDTO);
   }
}

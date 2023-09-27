package ClassificaSolo_Encapsulamento;

public class SoloCTR {
    SoloDAO soloDAO = new SoloDAO();
    
    public String calcular(SoloDTO soloDTO){
        return soloDAO.calcular(soloDTO);
    }
}

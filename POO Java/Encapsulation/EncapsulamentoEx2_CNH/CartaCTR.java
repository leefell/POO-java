package EncapsulamentoEx2_CNH;

public class CartaCTR {
    CartaDAO cartaDAO = new CartaDAO();
    
     public String imprimir(CartaDTO cartaDTO){
        return cartaDAO.mostrarDados(cartaDTO);
    }
    
}

package EncapsulamentoEx3_Notas;

public class NotasCTR {
    NotasDAO notasDAO = new NotasDAO();
    
    public String imprimir(NotasDTO notasDTO){
        return notasDAO.mensagem(notasDTO);
    }
}

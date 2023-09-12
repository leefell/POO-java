//Segundo a ser criado
package EncapsulamentoEx3_Notas;

public class NotasDAO {
    public double CalcularMedia(NotasDTO notasDTO){
        return ((notasDTO.getNota1() + notasDTO.getNota2()) / 2);
    }
    
    public String mensagem(NotasDTO notasDTO){
        if(this.CalcularMedia(notasDTO) >= 7){
            return "Aluno Aprovado, média: " + this.CalcularMedia(notasDTO);
        }else if(this.CalcularMedia(notasDTO) < 7 && this.CalcularMedia(notasDTO) >= 4){
            return "Aluno de Recuperação, média: " + this.CalcularMedia(notasDTO);
        }else{
            return "Aluno Reprovado, média: " + this.CalcularMedia(notasDTO);
    }
  }
}

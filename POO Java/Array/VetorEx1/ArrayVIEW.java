package VetorEx1;

import javax.swing.JOptionPane;

public class ArrayVIEW {
    public static void main(String[] args){
        try{
            
            ArrayDTO arrayDTO = new ArrayDTO();
            ArrayCTR arrayCTR = new ArrayCTR();
            
            int num[] = new int[5];
            
            for(int i = 0; i < 5; i++){
                num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            }
            
            arrayDTO.setN(num);
            JOptionPane.showMessageDialog(null, arrayCTR.inverter(arrayDTO));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Deu erro");
        }
    }
}

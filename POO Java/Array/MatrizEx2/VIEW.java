package MatrizEx2;

import javax.swing.JOptionPane;

public class VIEW {
    
    public static void main(String[] args) {
        
        DTO dto = new DTO();
        CTR ctr = new CTR();
        
        int n[][] = new int[2][6];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 5; j++){
                n[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o Registro escolar e as 4 notas: "));
            }
        }
        
        dto.setN(n);
        JOptionPane.showMessageDialog(null, ctr.exibirMatriz(dto));
    }
}

package VetorEx3;

import javax.swing.JOptionPane;

public class VIEW {

    public static void main(String[] args) {

       try {
            DTO dto = new DTO();
            CTR ctr = new CTR();

            int array1[] = new int[5];
            int array2[] = new int[5];

            for (int i = 0; i < array1.length; i++) {
                array1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para a posição " + (i + 1) + " do Array 1"));
            }

            for (int i = 0; i < array2.length; i++) {
                array2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para a posição " + (i + 1) + " do Array 2"));
            }

            dto.setVetor1(array1);
            dto.setVetor2(array2);

            String escolha = JOptionPane.showInputDialog("Escolha a operação:\nA - Adição\nS - Subtração\nM - Multiplicação\nD - Divisão");
            dto.setEscolha(escolha);

            String resultado = ctr.mensagem(dto);
            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Deu erro! " + e.getMessage());
        }
    }
}
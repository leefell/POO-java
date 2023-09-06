package A_Introducao_Ex01;

import javax.swing.JOptionPane;

public class Cliente_1 {
    private String nome, rg;
    
    public void mostrar(String nome, String rg){
        this.nome = nome;
        this.rg = rg;
                                                                                                
        JOptionPane.showMessageDialog(null, "O nome informado foi: " + this.nome + 
                                      "\nO rg informado foi: " + this.rg);
    }
    
    public void mostrarNome(String nome){
        this.nome = nome;
        
        JOptionPane.showMessageDialog(null,"O nome informado foi: " + this.nome);
    }
    
}

package HerancaExemplo1;

import javax.swing.JOptionPane;

public class VeiculoVIEW {
    public static void main(String[] args){
        
        CarroDTO carroDTO = new CarroDTO();
        CarroCTR carroCTR = new CarroCTR();
        
        carroDTO.setPlaca(JOptionPane.showInputDialog("Informe a Placa: "));
        carroDTO.setCor(JOptionPane.showInputDialog("Informe a Cor: "));
        carroDTO.setPotencia(Integer.parseInt(JOptionPane.showInputDialog("Informe a Potencia: ")));
        carroDTO.setQtd_portas(Integer.parseInt(JOptionPane.showInputDialog("Informe as portas: ")));
        
        JOptionPane.showMessageDialog(null, carroCTR.imprimirDadosCarro(carroDTO));
        
        MotoDTO motoDTO = new MotoDTO();
        MotoCTR motoCTR = new MotoCTR();
        
        motoDTO.setPlaca(JOptionPane.showInputDialog("Informe a Placa: "));
        motoDTO.setCor(JOptionPane.showInputDialog("Informe a cor: "));
        motoDTO.setCilindrada(Integer.parseInt(JOptionPane.showInputDialog("Informe a cilindrada: ")));
        motoDTO.setTipo_motor(JOptionPane.showInputDialog("2t / 4t: "));
        
        JOptionPane.showMessageDialog(null, motoCTR.imprimirDadosMoto(motoDTO));
        
        //verificar a funcionalidade na proxima aula
        
    }
}

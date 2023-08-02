package A_Introducao_Ex01;

public class Principal_Cliente {
    
    public static void main(String[] args){
        
        Cliente cliente = new Cliente();
       
        System.out.println("==== Chamando os métodos do objeto ====\n");
        
        cliente.mostrar("Alexandre", "12.345.678-99");
        cliente.mostrar("Augusto", "99.999.999-99");
        cliente.mostrarNome("Alexandre");
        cliente.mostrarNome("Augusto");
        
        System.out.println("==== Fim da Chamanda aos métodos do objeto ====\n");
                
    } // fecha main
} // fecha classe

package ExVogalWhile;

public class Vogal {

    private String letra, mensagem;
    private int A, E, I, O, U, consoante;

    public void verificar(String letra) {
        this.letra = letra;
        if (this.letra.equalsIgnoreCase("a")) {
            A++;
        } else if (this.letra.equalsIgnoreCase("e")) {
            E++;
        } else if (this.letra.equalsIgnoreCase("i")) {
            I++;
        } else if (this.letra.equalsIgnoreCase("o")) {
            O++;
        } else if (this.letra.equalsIgnoreCase("u")) {
            U++;
        } else {
            consoante++;
        }
    }

    public String Mostrar() {
        mensagem = "Foram digitadas: " + this.A + " letras A \nForam digitadas: "
                + this.E + " letras E \nForam digitadas: " + this.I + " letras I"
                + "\nForam digitadas: " + this.O + " letras O \nForam digitadas: "
                + this.U + " letras U \nConsoantes: " + (consoante - 1);

        return mensagem;
    }
}

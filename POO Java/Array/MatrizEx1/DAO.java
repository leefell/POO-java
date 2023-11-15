package MatrizEx1;

public class DAO {

    String matriz = "";
    String diagonalPrincipal = "";

    public String mostrarMatriz(DTO dto) {
        int n[][] = dto.getN();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.matriz += n[i][j] + " ";
            }
            this.matriz += "\n";
        }

        return this.matriz;
 }

    public String mostrarDiagonal(DTO dto) {
        int n[][] = dto.getN();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    this.diagonalPrincipal += n[i][j] + " ";
                }
            }
            this.diagonalPrincipal += "\n";
        }
        return this.diagonalPrincipal;
    }
}

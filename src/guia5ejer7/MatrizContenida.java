
package guia5ejer7;

public class MatrizContenida {
    private int[][] matrizM;
    private int[][] matrizP;

    public MatrizContenida(int[][] matrizM, int[][] matrizP) {
        this.matrizM = matrizM;
        this.matrizP = matrizP;
    }

    public boolean verificarContenido() {
        int filasM = matrizM.length;
        int columnasM = matrizM[0].length;
        int filasP = matrizP.length;
        int columnasP = matrizP[0].length;

        for (int i = 0; i <= filasM - filasP; i++) {
            for (int j = 0; j <= columnasM - columnasP; j++) {
                if (esSubmatriz(i, j)) {
                    System.out.println("La matriz P está contenida en la matriz M.");
                    System.out.println("Comienza en la fila: " + i + ", columna: " + j);
                    return true;
                }
            }
        }

        System.out.println("La matriz P no está contenida en la matriz M.");
        return false;
    }

    private boolean esSubmatriz(int filaInicio, int columnaInicio) {
        for (int i = 0; i < matrizP.length; i++) {
            for (int j = 0; j < matrizP[0].length; j++) {
                if (matrizM[filaInicio + i][columnaInicio + j] != matrizP[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public void imprimirMatrices() {
        System.out.println("Matriz M:");
        imprimirMatriz(matrizM);
        System.out.println("");
        System.out.println("Matriz P:");
        imprimirMatriz(matrizP);
    }

    private void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

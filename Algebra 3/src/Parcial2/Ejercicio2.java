package Parcial2;

public class Ejercicio2 {

    public boolean ejercicio2(double[][] matrix) {
        boolean result = true;
        int counter = 2;
        for (int i = 0; i < counter && i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    result = false;
                    break;
                }
            }
            counter++;
        }
        return result;
    }

    public static void main(String[] args) {
        double[][] matrixA = { {1, 2, 0, 0}, {2, 1, 3, 0}, {0, 3, 1, 4}, {0, 0, 4, 1} };
        double[][] matrixB = { {1, 2, 0, 1}, {2, 1, 3, 0}, {0, 3, 1, 4}, {0, 0, 4, 1} };
        Ejercicio2 ejercicio2 = new Ejercicio2();
        boolean resultA = ejercicio2.ejercicio2(matrixA);
        if (resultA) System.out.println("The matrix A is symmetrical");
        else System.out.println("The matrix A is not symmetrical");
        boolean resultB = ejercicio2.ejercicio2(matrixB);
        if (resultB) System.out.println("The matrix B is symmetrical");
        else System.out.println("The matrix B is not symmetrical");
    }
}

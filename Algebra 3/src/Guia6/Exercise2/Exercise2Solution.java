// Nombres: Tomas Varela, Franco Velardez
// Guía: N°6
// Ejercicio: 2)

package Guia6.Exercise2;

import Guia6.Calculator.Calculator;

public class Exercise2Solution implements Exercise2 {

    /**
     * @param matrix
     * @param calculator
     * @return TRUE if the given matrix is symmetrical, or FALSE otherwise
     */
    @Override
    public boolean exerciseA(double[][] matrix, Calculator calculator) {
        boolean result = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    /**
     * @param matrix
     * @param calculator
     * @return TRUE if the given matrix is diagonally dominant, or FALSE otherwise
     */
    @Override
    public boolean exerciseB(double[][] matrix, Calculator calculator) {
        boolean result = true;
        for (int i = 0; i < matrix.length; i++) {
            double main = 0;
            double rest = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    main = Math.abs(matrix[i][j]);
                } else {
                    rest = calculator.sum(rest, Math.abs(matrix[i][j]));
                }
            }
            if (main < rest) {
                result = false;
                break;
            }
        }
        return result;
    }
}

// Nombres: Tomas Varela, Franco Velardez
// Guía: N°6
// Ejercicio: 4)

package Guia6.Exercise4;

import Guia6.Calculator.Calculator;

public class Exercise4Solution implements Exercise4 {

    /**
     * @param matrixA
     * @param matrixB
     * @param calculator
     * @return the sum of both given matrices
     */
    @Override
    public double[][] summation(double[] matrixA, double[] matrixB, Calculator calculator) {
        double[][] result = new double[matrixLength(matrixA.length)][matrixLength(matrixB.length)];
        if (matrixA.length == matrixB.length) {
            double[] summation = new double[matrixA.length];
            for (int i = 0; i < matrixA.length; i++) {
                summation[i] = calculator.sum(matrixA[i], matrixB[i]);
            }
            int k = 0;
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[0].length; j++) {
                    if (j < i) {
                        result[i][j] = 0;
                    }
                    else {
                        result[i][j] = summation[k];
                        k++;
                    }
                }
            }
        }
        return result;
    }

    /**
     * @param n
     * @return the length of the matrix based on the length of its simplified form as a vector without the zeroes
     */
    private int matrixLength(int n){
        return (int)((-1 + Math.sqrt(1 + 8 * n)) / 2);
    }
}

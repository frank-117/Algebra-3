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
        int matrixLength = (int) matrixLength(matrixA.length, calculator);
        double[] sumVector = new double[matrixA.length];
        double[][] result = new double[matrixLength][matrixLength];
        for(int i = 0; i < matrixA.length; i++){
            sumVector[i] = calculator.sum(matrixA[i], matrixB[i]);
        }
        int counter= 0;
        for(int i = 0; i < matrixLength; i++){
            for(int j = 0; j < matrixLength; j++){
                if(i <= j) {
                    result[j][i] = sumVector[counter];
                    counter++;
                }
            }
        }
        return result;
    }

    /**
     * @param vectorLength
     * @param calculator
     * @return the length of the matrix based on the length of its simplified form as a vector without the zeroes
     */
    private double matrixLength(int vectorLength, Calculator calculator) {
        double a = calculator.division(calculator.sum(-1, Math.sqrt(calculator.sum(1, calculator.multiplication(8, vectorLength)))), 2);
        double b = calculator.division(calculator.subtraction(-1, Math.sqrt(calculator.sum(1, calculator.multiplication(8, vectorLength)))), 2);
        if (a > 0) return a;
        return b;
    }
}

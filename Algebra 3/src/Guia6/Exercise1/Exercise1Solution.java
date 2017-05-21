// Nombres: Tomas Varela, Franco Velardez
// Guía: N°6
// Ejercicio: 1)

package Guia6.Exercise1;

import Guia6.Calculator.Calculator;

public class Exercise1Solution implements Exercise1 {

    /**
     * @param matrix
     * @param calculator
     * @return the sum of the main diagonal of the given matrix
     */
    @Override
    public double exerciseA(double[][] matrix, Calculator calculator) {
        double result = 0;
        if (matrix.length == matrix[0].length) {
            for (int i = 0; i < matrix.length; i++){
                result = calculator.sum(result, matrix[i][i]);
            }
        }
        return result;
    }

    /**
     * @param matrix
     * @param calculator
     * @return the sum of the secondary diagonal of the given matrix
     */
    @Override
    public double exerciseB(double[][] matrix, Calculator calculator) {
        double result = 0;
        if(matrix.length == matrix[0].length) {
            for (int i = matrix.length - 1; i >= 0; i--){
                result = calculator.sum(result, matrix[i][matrix.length - i - 1]);
            }
        }
        return result;
    }

    /**
     * @param matrix
     * @param calculator
     * @return an array where each element is the sum of each row of the given matrix
     */
    @Override
    public double[] exerciseC(double[][] matrix, Calculator calculator) {
        double[] result = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                result[i] = calculator.sum(result[i], matrix[i][j]);
            }
        }
        return result;
    }

    /**
     * @param matrix
     * @param vector
     * @param calculator
     * @return the multiplication between a given matrix, and a given vector
     */
    @Override
    public double[] exerciseD(double[][] matrix, double[] vector, Calculator calculator) {
        double[] result = new double[vector.length];
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                result[i] = calculator.sum(result[i], calculator.multiplication(matrix[i][j], vector[j]));
            }
        }
        return result;
    }

    /**
     * @param matrixA
     * @param matrixB
     * @param calculator
     * @return the resulting matrix of the sum of two given matrices
     */
    @Override
    public double[][] exerciseE(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        double[][] result = new double[matrixA.length][matrixA[0].length];
        if (matrixA.length == matrixB.length && matrixA[0].length == matrixB[0].length) {
            for (int i = 0; i < matrixA.length; i++) {
                for (int j = 0; j < matrixA[i].length; j++) {
                    result[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);
                }
            }
        }
        return result;
    }

    /**
     * @param matrixA
     * @param matrixB
     * @param calculator
     * @return the resulting matrix of the multiplication between two given matrices
     */
    @Override
    public double[][] exerciseF(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        double[][] result = new double[matrixA.length][matrixB[0].length];
        if (matrixA[0].length == matrixB.length) {
            for (int i = 0; i < matrixA.length; i++) {
                for (int j = 0; j < matrixB[0].length; j++) {
                    for (int k = 0; k < matrixA[0].length; k++) {
                        result[i][j] = calculator.sum(result[i][j], calculator.multiplication(matrixA[i][k], matrixB[k][j]));
                    }
                }
            }
        }
        return result;
    }

    /**
     * @param matrix
     * @param calculator
     * @return the transposed matrix of a given matrix
     */
    @Override
    public double[][] exerciseG(double[][] matrix, Calculator calculator) {
        double[][] result = new double[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[i].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                result[i][j] = matrix[j][i];
            }
        }
        return result;
    }
}

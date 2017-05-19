// Nombres: Tomas Varela, Franco Velardez
// Guía: N°6
// Ejercicio: 1)

package Guia6.Exercise1;

import Guia6.Calculator.Calculator;

public class Exercise1Solution implements Exercise1 {

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

    @Override
    public double[][] exerciseE(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        return new double[0][];
    }

    @Override
    public double[][] exerciseF(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        return new double[0][];
    }

    @Override
    public double[][] exerciseG(double[][] matrix, Calculator calculator) {
        return new double[0][];
    }
}

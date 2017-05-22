package Guia6.Exercise4;

import Guia6.Calculator.Calculator;

public class Exercise4Solution implements Exercise4 {

    @Override
    public double[][] summation(double[] matrixA, double[] matrixB, Calculator calculator) {
        int matrixLength = (int) matrixLength(matrixA.length);
        double[] sumVector = new double[matrixA.length];
        double[][] result = new double[matrixLength][matrixLength];
        for(int i = 0; i<matrixA.length; i ++){
            sumVector[i] =matrixA[i] + matrixB[i];
        }
        int counter= 0;
        for(int i= 0; i<matrixLength ; i++){
            for(int j = 0; j<matrixLength && i<=j; j++){
                result[j][i] = sumVector[counter];
                counter++;
            }
        }
        return result;
    }

    private double matrixLength(int vectorLength){
        double a = (- 1 + Math.sqrt(1 +8*vectorLength))/2;
        double b = (- 1 - Math.sqrt(1 +8*vectorLength))/2;
        if(a>0){
            return a;
        }
        else return b;
    }
}

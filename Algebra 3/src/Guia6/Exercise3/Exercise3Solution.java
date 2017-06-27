// Nombres: Tomas Varela, Franco Velardez
// Guía: N°6
// Ejercicio: 3)

package Guia6.Exercise3;

import Guia6.Calculator.Calculator;

public class Exercise3Solution implements Exercise3 {
    /**
     *
     * @param matrixA
     * @param vectorX
     * @param calculator
     * @return multiplication between an upper triangular matrix and a given vector
     */
    @Override
    public double[] exerciseAI(double[][] matrixA, double[] vectorX, Calculator calculator) {
        double[] result = new double[vectorX.length];
        if(matrixA[0].length == vectorX.length ) {
            for(int j = 0; j < matrixA.length; j++) {
                for(int i = 0; i <= j; i++){
                    double addition = 0;
                    for(int k = i; k <= j; k++){
                        addition = calculator.sum(addition, calculator.multiplication(matrixA[i][k], vectorX[k]));
                    }
                    result[i] = addition;

                }
            }
        }
        return result;
    }

    /**
     *
     * @param matrixA
     * @param matrixB
     * @param calculator
     * @return the sum between two upper triangular matrices
     */
    @Override
    public double[][] exerciseAII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        double[][] result = new double[matrixA.length][matrixA.length];
        if(matrixA[0].length == matrixB.length ) {
            for(int i = 0; i < matrixA.length; i++) {
                for(int j = i; j < matrixA[0].length; j++) {
                    result[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);
                }
            }
        }
        return result;
    }

    /**
     *
     * @param matrixA
     * @param matrixB
     * @param calculator
     * @return the multiplication between two upper triangular matrices
     */
    @Override
    public double[][] exerciseAIII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        double[][] result = new double[matrixA.length][matrixB[0].length];
        if(matrixA[0].length == matrixB.length ) {
            for(int j = 0; j < matrixA.length; j++) {
                for(int i = 0; i <= j; i++) {
                    double addition = 0;
                    for(int k = i; k <= j; k++) {
                        addition = calculator.sum(addition, calculator.multiplication(matrixA[i][k], matrixB[k][j]));
                    }
                    result[i][j] = addition;
                }
            }
        }
        return result;
    }

    /**
     *
     * @param matrixA
     * @param vectorX
     * @param calculator
     * @return the multiplication between an upper Hessenberg matrix and a given vector
     */
    @Override
    public double[] exerciseBI(double[][] matrixA, double[] vectorX, Calculator calculator) {
        double[] result = new double[vectorX.length];
        if (matrixA[0].length == vectorX.length) {
            for(int j = 0; j < matrixA.length; j++) {
                double addition = 0;
                for (int i = 0; i <= j && i < matrixA[0].length; i++) {
                    addition = calculator.sum(addition, calculator.multiplication(matrixA[i][j], vectorX[j]));
                }
                result[result.length - 1 - j] = addition;
            }
        }
        return result;
    }

    /**
     *
     * @param matrixA
     * @param matrixB
     * @param calculator
     * @return the sum between two upper Hessenberg matrices
     */
    @Override
    public double[][] exerciseBII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        double[][] result = new double[matrixA.length][matrixB[0].length];
        if(matrixA[0].length == matrixB.length ) {
            for(int j = 0; j < matrixA.length; j++) {
                for(int i = 0; i < j + 2 && i < matrixA.length; i++) {
                    result[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);
                }
            }
        }
        return result;
    }

    /**
     *
     * @param matrixA
     * @param matrixB
     * @param calculator
     * @return the multiplication between two upper Hessenberg matrices
     */
    @Override
    public double[][] exerciseBIII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        double[][] result = new double[matrixA.length][matrixB[0].length];
        if(matrixA[0].length == matrixB.length ){
            for(int j = 0; j <= matrixA.length - 1; j++) {
                for(int i = 0; i <= matrixA.length - 1; i++) {
                    double addition = 0;
                    for(int k = 0; k <= matrixA.length - 1; k++) {
                        addition = calculator.sum(addition, calculator.multiplication(matrixA[i][k], matrixB[k][j]));
                    }
                    result[i][j] = addition;
                }
            }
        }
        return result;
    }

    /**
     *
     * @param matrixA
     * @param vectorX
     * @param calculator
     * @return the multiplication between a tridiagonal matrix and a given vector
     */
    @Override
    public double[] exerciseCI(double[][] matrixA, double[] vectorX, Calculator calculator) {
        double[] result = new double[vectorX.length];
        int counter = 2;
        for(int i = 0; i<counter && i<matrixA.length ; i++){
            for(int j=0; j<matrixA[i].length && j<= i+1 ; j++){
                result[i] = calculator.sum(result[i], calculator.multiplication(matrixA[i][j], vectorX[j]));
            }
            counter++;
        }

        return result;
    }

    /**
     *
     * @param matrixA
     * @param matrixB
     * @param calculator
     * @return the sum between two tridiagonal matrices
     */
    @Override
    public double[][] exerciseCII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        double result[][] = new double[matrixA.length][matrixA.length];
        int counter = 2;
        for(int i = 0; i<matrixA.length && i<counter ; i++){
            for(int j=0; j<matrixA[i].length && j<= i+1 ; j++){
                result[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);
            }
            counter++;
        }

        return result;
    }

    /**
     *
     * @param matrixA
     * @param matrixB
     * @param calculator
     * @return the multiplication between two tridiagonal matrices
     */
    @Override
    public double[][] exerciseCIII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        int counter = 2;
        double result[][] = new double[matrixA.length][matrixA.length];
        for(int i = 0; i<matrixA.length && i<counter; i++){
            for(int j=0; j<matrixA.length && j<= i+2 ; j++){
                for(int k = 0; k<matrixA.length && k<=i+2 ; k++){
                    result[i][j] = calculator.sum(result[i][j], calculator.multiplication(matrixA[k][j],matrixB[i][k]));
                }

            }
            counter++;
        }

        return result;
    }

    /**
     *
     * @param matrixA
     * @param k1A amount of diagonals up from the main diagonal that are not zeros
     * @param k2A amount of diagonals down from the main diagonal that are not zeros
     * @param vectorX
     * @param calculator
     * @return the multiplication between the matrix and the vector
     */
    @Override
    public double[] exerciseDI(double[][] matrixA, int k1A, int k2A, double[] vectorX, Calculator calculator) {
        double[] result = new double[vectorX.length];
        int counter = k1A;
        for(int i = 0; i<counter && i<matrixA.length ; i++){
            for(int j=0; j<matrixA[i].length && j<= i+k2A ; j++){
                result[i] = calculator.sum(result[i], calculator.multiplication(matrixA[i][j], vectorX[j]));
            }
            counter++;
        }

        return result;
    }

    /**
     *
     * @param matrixA
     * @param k1A amount of diagonals up from the main diagonal that are not zeros on matrixA
     * @param k2A amount of diagonals down from the main diagonal that are not zeros on matrixA
     * @param matrixB
     * @param k1B amount of diagonals up from the main diagonal that are not zeros on matrixB
     * @param k2B amount of diagonals down from the main diagonal that are not zeros on matrixB
     * @param calculator
     * @return the sum between the two matrices
     */
    @Override
    public double[][] exerciseDII(double[][] matrixA, int k1A, int k2A, double[][] matrixB, int k1B, int k2B, Calculator calculator) {
        double result[][] = new double[matrixA.length][matrixA.length];
        int counter1 = k1A;
        int counter2 = k1B;
        for(int i = 0 , k = 0; (i<matrixA.length && i<counter1) || (k<matrixB.length && k<counter2) ; i++ , k++){
            for(int j=0, l=0; (j<matrixA[i].length && j<= i+k2A) || (l<matrixA[k].length && l<=k+k2B); j++ , l++){
                result[i][j] = calculator.sum(matrixA[i][j], matrixB[k][l]);
            }
            counter1++;
            counter2++;
        }

        return result;
    }
    /**
     *
     * @param matrixA
     * @param k1A amount of diagonals up from the main diagonal that are not zeros on matrixA
     * @param k2A amount of diagonals down from the main diagonal that are not zeros on matrixA
     * @param matrixB
     * @param k1B amount of diagonals up from the main diagonal that are not zeros on matrixB
     * @param k2B amount of diagonals down from the main diagonal that are not zeros on matrixB
     * @param calculator
     * @return the multiplication between the two matrices
     */
    @Override
    public double[][] exerciseDIII(double[][] matrixA, int k1A, int k2A, double[][] matrixB, int k1B, int k2B, Calculator calculator) {
        int counter1 = k1A;
        int counter2 = k1B;
        double result[][] = new double[matrixA.length][matrixA.length];
        for(int i = 0; i<matrixA.length && i<counter1 && i<counter2; i++){
            for(int j=0; j<matrixA.length && j<= k2A+2 ; j++){
                for(int k = 0; k<matrixA.length && k<=k2B+2 ; k++){
                    result[i][j] = calculator.sum(result[i][j], calculator.multiplication(matrixA[k][j],matrixB[i][k]));
                }

            }
            counter1++;
            counter2++;
        }

        return result;
    }

    /**
     *
     * @param matrixA an upper triangular matrix
     * @param matrixB a downwards triangular matrix
     * @param calculator
     * @return  the multiplication between the two matrices
     */
    @Override
    public double[][] exerciseE(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        double[][] result = new double[matrixA[0].length][matrixB.length];
        for (int i = 0; i < matrixA[0].length; i++) {
            for (int k = 0; k < matrixB.length; k++) {
                double addition = 0;
                for (int j = 0, l = 0; j <= i && l <= k; j++, l++) {
                    addition = calculator.sum(addition, calculator.multiplication(matrixA[i][j], matrixB[l][k]));
                }
                result[i][k] = addition;
            }
        }
        return result;
    }
}

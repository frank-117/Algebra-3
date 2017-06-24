// Nombres: Tomas Varela, Franco Velardez
// Guía: N°7

package Guia7;

public class Guia7 implements TP4 {

    /**
     * @param coefficients upper triangular matrix with 1 in the main diagonal
     * @param independentTerms results
     * @return the solutions to the equations system
     */
    @Override
    public double[] exercise1(double[][] coefficients, double[] independentTerms) {
        double[] result = new double[independentTerms.length];
        for(int i = coefficients.length - 1; i >= 0; i--){
            double value = 0;
            for(int j = i + 1; j < coefficients.length; j++){
                value += coefficients[i][j] * result[j];
            }
            result[i] = independentTerms[i] - value;
        }
        return result;
    }

    /**
     * @param coefficients lower triangular matrix
     * @param independentTerms results
     * @return the solutions to the equations system
     */
    @Override
    public double[] exercise2(double[][] coefficients, double[] independentTerms) {
        double[] result = new double[independentTerms.length];
        for(int i = 0; i < coefficients.length; i++){
            double value = 0;
            for(int j = 0; j < i; j++){
                value += coefficients[i][j] * result[j];
            }
            result[i] = (independentTerms[i] - value) / coefficients[i][i];
        }
        return result;
    }

    /**
     * @param coefficients given matrix
     * @param independentTerms results
     * @return the solutions to the equations system using Gauss elimination without pivoting
     */
    @Override
    public double[] exercise5WithoutPivoteo(double[][] coefficients, double[] independentTerms) {
        for (int k = 0; k < coefficients.length; k++) {
            double diagonal = coefficients[k][k];
            for (int j = k; j < coefficients[0].length; j++) {
                coefficients[k][j] = (coefficients[k][j] / diagonal);
            }
            independentTerms[k] = (independentTerms[k] / diagonal);
            for (int i = k + 1; i < coefficients.length; i++) {
                double multiplier = coefficients[i][k];
                for (int j = k; j < coefficients[0].length; j++) {
                    coefficients[i][j] = (coefficients[i][j] - multiplier * coefficients[k][j]);
                }
                independentTerms[i] = independentTerms[i] - multiplier * independentTerms[k];
            }
        }
        return exercise1(coefficients, independentTerms);
    }

    /**
     * @param coefficients given matrix
     * @param independentTerms results
     * @return the solutions to the equations system using Gauss elimination with partial pivoting
     */
    @Override
    public double[] exercise5PartialPivoteo(double[][] coefficients, double[] independentTerms) {
        for (int k = 0; k < coefficients.length; k++) {
            for (int i = k; i < coefficients[0].length; i++) {
                double max = coefficients[k][k];
                if (coefficients[i][k] > max){
                    double[] temp1 = coefficients[k];
                    coefficients[k] = coefficients[i];
                    coefficients[i] = temp1;
                    double temp2 = independentTerms[k];
                    independentTerms[k] = independentTerms[i];
                    independentTerms[i] = temp2;
                }
            }
            double diagonal = coefficients[k][k];
            for (int j = k; j < coefficients[0].length; j++) {
                coefficients[k][j] = (coefficients[k][j] / diagonal);
            }
            independentTerms[k] = (independentTerms[k] / diagonal);
            for (int i = k + 1; i < coefficients.length; i++) {
                double multiplier = coefficients[i][k];
                for (int j = k; j < coefficients[0].length; j++) {
                    coefficients[i][j] = (coefficients[i][j] - multiplier * coefficients[k][j]);
                }
                independentTerms[i] = independentTerms[i] - multiplier * independentTerms[k];
            }
        }
        return exercise1(coefficients, independentTerms);
    }

    /**
     * @param coefficients given matrix
     * @param independentTerms results
     * @param calculator to keep track of calculations
     * @return the solutions to the equations system using Gauss elimination adopted to a superior Hessenberg matrix
     */
    @Override
    public double[] exercise6(double[][] coefficients, double[] independentTerms, Calculator calculator) {
        for (int k = 0; k < coefficients.length; k++) {
            double diagonal = coefficients[k][k];
            for (int j = k; j < coefficients[0].length; j++) {
                coefficients[k][j] = calculator.division(coefficients[k][j], diagonal);
            }
            independentTerms[k] = calculator.division(independentTerms[k], diagonal);
            if (k + 1 < coefficients.length){
                int i = k + 1;
                double multiplier = coefficients[i][k];
                for (int l = k; l < coefficients[0].length; l++) {
                    coefficients[i][l] = calculator.subtraction(coefficients[i][l], calculator.multiplication(multiplier, coefficients[k][l]));
                }
                independentTerms[i] = calculator.subtraction(independentTerms[i], calculator.multiplication(multiplier, independentTerms[k]));
            }
        }
        return exercise1(coefficients, independentTerms);
    }

    /**
     * @param coefficients given matrix
     * @param independentTerms results
     * @param calculator to keep track of calculations
     * @return the solutions to the equations system using Gauss elimination adopted to the Spline method
     */
    @Override
    public double[] exercise7(double[][] coefficients, double[] independentTerms, Calculator calculator) {
        coefficients[0][0] = calculator.division(coefficients[0][1], coefficients[0][0]);
        independentTerms[0] = calculator.division(independentTerms[0], coefficients[0][0]);
        for(int i = 1; i < coefficients.length - 1; i++){
            coefficients[i][i + 1] = calculator.division(coefficients[i][i + 1], (calculator.subtraction(coefficients[i][i], calculator.multiplication(coefficients[i -1][i], coefficients[i][i - 1]))));
            double numerator = calculator.subtraction(independentTerms[i], calculator.multiplication(independentTerms[i - 1], coefficients[i][i - 1]));
            double denominator = calculator.subtraction(independentTerms[i], calculator.multiplication(coefficients[i - 1][i], coefficients[i][i - 1]));
            independentTerms[i] = calculator.division(numerator, denominator);
        }
        for(int i = coefficients.length - 2; i >= 0; i--){
            independentTerms[i] = independentTerms[i] - coefficients[i][i + 1] * independentTerms[i + 1];
        }
        return independentTerms;
    }

    /**
     * @param coefficients the given matrix
     * @return the inverse of a matrix using Gauss-Jordan
     */
    @Override
    public double[][] exercise8(double[][] coefficients) {
        double[][] identity = new double[coefficients.length][coefficients.length];
        for(int i = 0; i < identity.length; i++) {
            for (int j = 0; j < identity.length; j++) {
                if(i == j) identity[i][j] = 1;
                else identity[i][j] = 0;
            }
        }
        double[][] extendedMat = new double[coefficients.length][coefficients.length + identity.length];
        for(int i = 0; i < coefficients.length; i++) {
            System.arraycopy(coefficients[i], 0, extendedMat[i], 0, coefficients.length);
        }
        for(int i = 0; i < extendedMat.length; i++) {
            System.arraycopy(identity[i], 0, extendedMat[i], coefficients.length, identity.length);
        }
        for(int k = 0; k < extendedMat.length; k++) {
            double pivotA = extendedMat[k][k];
            for(int j = k; j < extendedMat[0].length; j++) {
                extendedMat[k][j] = extendedMat[k][j] / pivotA;
            }
            for(int i = 0; i < extendedMat.length; i++) {
                if(i != k){
                    double pivotB = extendedMat[i][k];
                    for(int j = k; j < extendedMat[0].length; j++) {
                        extendedMat[i][j] = extendedMat[i][j] - pivotB * extendedMat[k][j];
                    }
                }
            }
        }
        double[][] result = new double[extendedMat.length][extendedMat.length];
        for(int i = 0; i < result.length; i++) {
            System.arraycopy(extendedMat[i], coefficients.length, result[i], 0, result.length);
        }
        return result;
    }

    /**
     * @param coefficients given matrix
     * @param independentTerms results
     * @return the solutions to the equations system using LU decomposition
     */
    @Override
    public double[] exercise9(double[][] coefficients, double[] independentTerms) {
        double[][] U = new double[coefficients.length][coefficients[0].length];
        double[][] L = new double[coefficients.length][coefficients[0].length];
        for (int k = 0; k < coefficients.length; k++) {
            for (int j = k; j < coefficients.length; j++) {
                double u = 0;
                double l = 0;
                for (int p = 0; p < k; p++) {
                    u += L[k][p] * U[p][j];
                    l += L[j][p] * U[p][k];
                }
                U[k][j] = coefficients[k][j] - u;
                L[j][k] = (coefficients[j][k] - l) / U[k][k];
            }
        }
        double[] z = exercise2(L, independentTerms);
        return exercise5WithoutPivoteo(U, z);
    }
}

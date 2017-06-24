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
        int n = independentTerms.length;
        for (int p = 0; p < n; p++) {
            int max = p;
            for (int i = p + 1; i < n; i++) {
                if (Math.abs(coefficients[i][p]) > Math.abs(coefficients[max][p])) {
                    max = i;
                }
            }
            double[] temp = coefficients[p];
            coefficients[p] = coefficients[max];
            coefficients[max] = temp;
            double t = independentTerms[p];
            independentTerms[p] = independentTerms[max];
            independentTerms[max] = t;
            for (int i = p + 1; i < n; i++) {
                double alpha = coefficients[i][p] / coefficients[p][p];
                independentTerms[i] -= alpha * independentTerms[p];
                for (int j = p; j < n; j++) {
                    coefficients[i][j] -= alpha * coefficients[p][j];
                }
            }
        }
        double[] x = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            double sum = 0.0;
            for (int j = i + 1; j < n; j++) {
                sum += coefficients[i][j] * x[j];
            }
            x[i] = (independentTerms[i] - sum) / coefficients[i][i];
        }
        return x;
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
        coefficients[0][1] = calculator.division(coefficients[0][1], coefficients[0][0]);
        independentTerms[0] = calculator.division(independentTerms[0], coefficients[0][0]);
        for(int i = 1; i < coefficients.length - 1; i++){
            coefficients[i][i + 1] = calculator.division(coefficients[i][i + 1], (calculator.subtraction(coefficients[i][i], calculator.multiplication(coefficients[i -1][i], coefficients[i][i - 1]))));
            double numerator = calculator.subtraction(independentTerms[i], calculator.multiplication(independentTerms[i - 1],coefficients[i][i - 1]));
            double denominator = calculator.subtraction(independentTerms[i], calculator.multiplication(coefficients[i - 1][i],coefficients[i][i - 1]));
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
        int rows = coefficients.length;
        int columns = coefficients[0].length;
        double[][] out = new double[rows][columns];
        double[][] old = new double[rows][columns * 2];
		double[][] newest = new double[rows][columns * 2];
        for (int v = 0; v < rows; v++) {
            for (int s = 0; s < columns * 2; s++) {
                if (s - v == rows) old[v][s] = 1;
                if(s < columns) old[v][s] = coefficients[v][s];
            }
        }
        for (int v = 0; v < rows; v++) {
            for (int v1 = 0; v1 < rows; v1++) {
                for (int s = 0; s < columns * 2; s++) {
                    if (v == v1) newest[v][s] = old[v][s] / old[v][v];
                    else newest[v1][s] = old[v1][s];
                }
            }
            old = aux(newest);
            for (int v1 = v + 1; v1 < rows; v1++) {
                for (int s = 0; s < columns * 2; s++) {
                    newest[v1][s] = old[v1][s] - old[v][s] * old[v1][v];
                }
            }
            old = aux(newest);
        }
        for (int s = columns - 1; s > 0; s--) {
            for (int v = s - 1; v >= 0; v--) {
                for (int s1 = 0; s1 < columns * 2; s1++) {
                    newest[v][s1] = old[v][s1] - old[s][s1] * old[v][s];
                }
            }
            old = aux(newest);
        }
        for (int v = 0; v < rows; v++) {
            System.arraycopy(newest[v], columns, out[v], 0, columns * 2 - columns);
        }
        return out;
    }

    public double[][] aux(double[][] in) {
        double[][] out = new double[in.length][in[0].length];
        for(int v = 0; v < in.length; v++) {
            System.arraycopy(in[v], 0, out[v], 0, in[0].length);
        }
        return out;
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

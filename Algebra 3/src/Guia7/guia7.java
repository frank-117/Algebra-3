package Guia7;

public class guia7 implements TP4 {
    @Override
    public double[] exercise1(double[][] coefficients, double[] independentTerms) {
        return new double[0];
    }

    @Override
    public double[] exercise2(double[][] coefficients, double[] independentTerms) {
        return new double[0];
    }

    @Override
    public double[] exercise5WithoutPivoteo(double[][] coefficients, double[] independentTerms) {
        return new double[0];
    }

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
            double[] temp = coefficients[p]; coefficients[p] = coefficients[max]; coefficients[max] = temp;
            double   t    = independentTerms[p]; independentTerms[p] = independentTerms[max]; independentTerms[max] = t;


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

    @Override
    public double[] exercise6(double[][] coefficients, double[] independentTerms, Calculator calculator) {
        return new double[0];
    }

    @Override
    public double[] exercise7(double[][] coefficients, double[] independentTerms, Calculator calculator) {
        return new double[0];
    }

    @Override
    public double[][] exercise8(double[][] coefficients) {
        return new double[0][];
    }

    @Override
    public double[] exercise9(double[][] coefficients, double[] independentTerms) {
        return new double[0];
    }
}

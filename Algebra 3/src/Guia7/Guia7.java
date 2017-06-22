package Guia7;

public class Guia7 implements TP4 {

    @Override
    public double[] exercise1(double[][] coefficients, double[] independentTerms) {
        double[] result = new double[coefficients.length];
        for (int i = coefficients.length - 1; i > 0; i--) {
            for (int j = coefficients[i].length - 1; j >= i; j--) {
                result[i] = independentTerms[i];
                int end = i;
                while (end != coefficients.length && (end - 1) > coefficients[i].length) {
                    result[i] -= coefficients[end - 1][coefficients[end].length - 1] * coefficients[end][coefficients[end].length - 1];
                    end--;
                }
            }
        }
        return result;
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
        double[][] a = coefficients;
        int e = 1;
        int n = a.length;
        for (int j = 0; j < n; j++) {
            int p = j;
            double max = Math.abs(a[p][0]);
            for (int i = j + 1; i < n; i++) {
                if (Math.abs(a[i][j]) > max) {
                    p = i;

                }

            }
            System.out.println(p);
            if (p > j) {
                double temp = 0;
                for (int i = 0; i < a[1].length; i++) {
                    temp = a[j][i];
                    a[j][i] = a[p][i];
                    a[p][i] = temp;
                }
            }
            double divisor = a[j][j];
            for ( int i = 0; i < a[j].length; i ++){

                a[j][i] = a[j][i]/divisor;
            }
            for (int i = 0; i < a.length; i++) {
                if (i != j) {
                    double multiple = a[i][j];
                    for (int x = 0; x < a[1].length; x++) {
                        a[i][x] = (a[i][x] - a[i][j] * a[j][x]);

                    }
                }
            }

        }
        return a;
    }

    @Override
    public double[] exercise9(double[][] coefficients, double[] independentTerms) {
        return new double[0];
    }
}

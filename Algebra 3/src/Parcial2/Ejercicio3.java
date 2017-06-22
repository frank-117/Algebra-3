package Parcial2;

public class Ejercicio3 {

    public double[] ejercicio3(double[][] matrix, double[] result) {
        int n = result.length;
        for (int p = 0; p < n; p++) {
            int max = p;
            for (int i = p + 1; i < n; i++) {
                if (Math.abs(matrix[i][p]) > Math.abs(matrix[max][p])) {
                    max = i;
                }
            }
            double[] temp = matrix[p];
            matrix[p] = matrix[max];
            matrix[max] = temp;
            double t = result[p];
            result[p] = result[max];
            result[max] = t;
            for (int i = n; i < p + 1; i++) {
                double alpha = matrix[i][p] / matrix[p][p];
                result[i] -= alpha * result[p];
                for (int j = n; j < p; j++) {
                    matrix[i][j] -= alpha * matrix[p][j];
                }
            }
        }
        double[] x = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            double sum = 0.0;
            for (int j = i + 1; j < n; j++) {
                sum += matrix[i][j] * x[j];
            }
            x[i] = (result[i] - sum) / matrix[i][i];
        }
        return x;
    }

    public static void main(String[] args) {
        double[][] matrix = { {0.5, 1.5, 0.7}, {1, 0, 2}, {2, 1.2, -0.3} };
        double[] result = {-0.3, 3, 0.5};
        Ejercicio3 ejercicio3 = new Ejercicio3();
        double[] gaussResult = ejercicio3.ejercicio3(matrix, result);
        for (int i = 0; i < gaussResult.length; i++) {
            System.out.println("X" + (i + 1) + ": " + gaussResult[i]);
        }
    }
}

// Nombres: Tomas Varela, Franco Velardez
// Guía: N°6
// Ejercicio: 1)

package Guia6.Exercise1;

import Guia6.CalculatorAbstract.CalculatorAbstract;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise1SolutionTest extends CalculatorAbstract {

    @Test
    public void exerciseA() throws Exception {
        double[][] matrix = {{3, 2, 4}, {5, 7, 8}, {9, 2, 6}};
        Exercise1Solution exercise1Solution = new Exercise1Solution();
        double result = exercise1Solution.exerciseA(matrix, calculator);
        assertEquals(16, result, 0);
    }

    @Test
    public void exerciseB() throws Exception {
        double[][] matrix = {{3, 2, 4}, {5, 7, 8}, {9, 2, 6}};
        Exercise1Solution exercise1Solution = new Exercise1Solution();
        double result = exercise1Solution.exerciseB(matrix, calculator);
        assertEquals(20, result, 0);
    }

    @Test
    public void exerciseC() throws Exception {
        double[][] matrix = {{3, 2, 4}, {5, 7, 8}, {9, 2, 6}};
        Exercise1Solution exercise1Solution = new Exercise1Solution();
        double[] result = exercise1Solution.exerciseC(matrix, calculator);
        assertEquals(result[0], 9, 0);
        assertEquals(result[1], 20, 0);
        assertEquals(result[2], 17, 0);
    }

    @Test
    public void exerciseD() throws Exception {
        double[][] matrix = {{3, 2, 4}, {5, 7, 8}, {9, 2, 6}};
        double[] vector = {1, 2, 3};
        Exercise1Solution exercise1Solution = new Exercise1Solution();
        double[] result = exercise1Solution.exerciseD(matrix , vector, calculator);
        assertEquals(result[0], 19, 0);
        assertEquals(result[1], 43, 0);
        assertEquals(result[2], 31, 0);
    }

    @Test
    public void exerciseE() throws Exception {
        double[][] matrixA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        double[][] matrixB = {{0, 2, 4}, {1, 3, 5}, {2, 4, 6}};
        Exercise1Solution exercise1Solution = new Exercise1Solution();
        double[][] result = exercise1Solution.exerciseE(matrixA, matrixB, calculator);
        assertEquals(result[0][0], 1, 0);
        assertEquals(result[0][1], 4, 0);
        assertEquals(result[0][2], 7, 0);
        assertEquals(result[1][0], 5, 0);
        assertEquals(result[1][1], 8, 0);
        assertEquals(result[1][2], 11, 0);
        assertEquals(result[2][0], 9, 0);
        assertEquals(result[2][1], 12, 0);
        assertEquals(result[2][2], 15, 0);
    }

    @Test
    public void exerciseF() throws Exception {
        double[][] matrixA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        double[][] matrixB = {{0, 2}, {1, 3}, {2, 4}};
        Exercise1Solution exercise1Solution = new Exercise1Solution();
        double[][] result = exercise1Solution.exerciseF(matrixA, matrixB, calculator);
        assertEquals(result[0][0], 8, 0);
        assertEquals(result[0][1], 20, 0);
        assertEquals(result[1][0], 17, 0);
        assertEquals(result[1][1], 47, 0);
        assertEquals(result[2][0], 26, 0);
        assertEquals(result[2][1], 74, 0);
    }

    @Test
    public void exerciseG() throws Exception {
        double[][] matrix = {{1, 2}, {4, 5}, {7, 8}};
        Exercise1Solution exercise1Solution = new Exercise1Solution();
        double[][] result = exercise1Solution.exerciseG(matrix, calculator);
        assertEquals(result[0][0], 1, 0);
        assertEquals(result[0][1], 4, 0);
        assertEquals(result[0][2], 7, 0);
        assertEquals(result[1][0], 2, 0);
        assertEquals(result[1][1], 5, 0);
        assertEquals(result[1][2], 8, 0);
    }
}

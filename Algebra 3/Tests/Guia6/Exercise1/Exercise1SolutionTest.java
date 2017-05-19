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
        double[][] matrix = {{3,2,4} , {5,7,8}, {9,2,6}};
        Exercise1Solution exercise1 = new Exercise1Solution();
        double result = exercise1.exerciseA(matrix, calculator);
        assertEquals(16, result, 0);
    }

    @Test
    public void exerciseB() throws Exception {
        double[][] matrix = {{3,2,4} , {5,7,8}, {9,2,6}};
        Exercise1Solution exercise1 = new Exercise1Solution();
        double result = exercise1.exerciseB(matrix, calculator);
        assertEquals(20, result, 0);
    }

    @Test
    public void exerciseC() throws Exception {
        double[][] matrix = {{3,2,4} , {5,7,8}, {9,2,6}};
        Exercise1Solution exercise1 = new Exercise1Solution();
        double[] result = exercise1.exerciseC(matrix, calculator);
        assertEquals(result[0], 9, 0);
        assertEquals(result[1], 20, 0);
        assertEquals(result[2], 17, 0);
    }

    @Test
    public void exerciseD() throws Exception {
        double[][] matrix = {{3,2,4} , {5,7,8}, {9,2,6}};
        double[] vector = {1,2,3};
        Exercise1Solution exercise1 = new Exercise1Solution();
        double[] result = exercise1.exerciseD(matrix , vector, calculator);
        assertEquals(result[0], 19, 0);
        assertEquals(result[1], 43, 0);
        assertEquals(result[2], 31, 0);
    }

    @Test
    public void exerciseE() throws Exception {
    }

    @Test
    public void exerciseF() throws Exception {
    }

    @Test
    public void exerciseG() throws Exception {
    }
}

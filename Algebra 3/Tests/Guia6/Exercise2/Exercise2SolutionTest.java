package Guia6.Exercise2;

import Guia6.CalculatorAbstract.CalculatorAbstract;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise2SolutionTest extends CalculatorAbstract {

    @Test
    public void exerciseA() throws Exception {

        double[][] matrix1 = {{3, 2, 4}, {5, 7, 8}, {9, 2, 6}};
        Exercise2Solution exercise2Solution1 = new Exercise2Solution();
        boolean result1 = exercise2Solution1.exerciseA(matrix1, calculator);
        assertTrue(result1);

        double[][] matrix2 = {{3, 2, 4}, {5, 7, 8}, {9, 2, 6}};
        Exercise2Solution exercise2Solution2 = new Exercise2Solution();
        boolean result2 = exercise2Solution2.exerciseA(matrix2, calculator);
        assertFalse(result2);
    }

    @Test
    public void exerciseB() throws Exception {
    }
}

package Guia6.Exercise4;

import Guia6.CalculatorAbstract.CalculatorAbstract;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise4SolutionTest extends CalculatorAbstract {

    @Test
    public void summation() throws Exception {
        double[] matrixA = {5,6,7,9,5,2,4,1,3,2};
        double[] matrixB = {2,6,1,3,7,3,8,3,8,2};
        Exercise4Solution exercise = new Exercise4Solution();
        double[][] result = exercise.summation(matrixA, matrixB, calculator);
        assertEquals(result[0][0], 7 , 0.1);
        assertEquals(result[0][1], 0 , 0.1);
        assertEquals(result[0][2], 0 , 0.1);
        assertEquals(result[0][3], 0 , 0.1);
        assertEquals(result[1][0], 12, 0.1);
        assertEquals(result[1][1], 12, 0.1);
        assertEquals(result[1][2], 0 , 0.1);
        assertEquals(result[1][3], 0 , 0.1);
        assertEquals(result[2][0], 8 , 0.1);
        assertEquals(result[2][1], 5 , 0.1);
        assertEquals(result[2][2], 4 , 0.1);
        assertEquals(result[2][3], 0 , 0.1);
        assertEquals(result[3][0], 12, 0.1);
        assertEquals(result[3][1], 12, 0.1);
        assertEquals(result[3][2], 11, 0.1);
        assertEquals(result[3][3], 4 , 0.1);
    }
}
package Guia7;

import org.junit.Test;

import static org.junit.Assert.*;

public class Guia7Test {

    Guia7 guia7 = new Guia7();

    @Test
    public void exercise1() throws Exception {
        double[][] matrix = { {1, 2, 4}, {0, 1, 2}, {0, 0, 1} };
        double[] result = {2, 4, 6};
        double[] gaussResult = guia7.exercise1(matrix, result);
        double[] expectedResult = {-6, -8, 6};
        for (int i = 0; i < gaussResult.length; i++) {
            assertEquals(expectedResult[i], gaussResult[i], 0);
        }
    }

    @Test
    public void exercise2() throws Exception {
    }

    @Test
    public void exercise5WithoutPivoteo() throws Exception {
        double[][] matrix = { {0.5, 1.5, 0.7}, {1, 0, 2}, {2, 1.2, -0.3} };
        double[] result = {-0.3, 3, 0.5};
        double[] gaussResult = guia7.exercise5WithoutPivoteo(matrix, result);
        for (int i = 0; i < gaussResult.length; i++) {
            System.out.println("X" + (i + 1) + ": " + gaussResult[i]);
        }
    }

    @Test
    public void exercise5PartialPivoteo() throws Exception {
        double[][] matrix = { {0.5, 1.5, 0.7}, {1, 0, 2}, {2, 1.2, -0.3} };
        double[] result = {-0.3, 3, 0.5};
        double[] gaussResult = guia7.exercise5PartialPivoteo(matrix, result);
        for (int i = 0; i < gaussResult.length; i++) {
            System.out.println("X" + (i + 1) + ": " + gaussResult[i]);
        }
    }

    @Test
    public void exercise6() throws Exception {
    }

    @Test
    public void exercise7() throws Exception {
    }

    @Test
    public void exercise8() throws Exception {
    }

    @Test
    public void exercise9() throws Exception {
    }
}
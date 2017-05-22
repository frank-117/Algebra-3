package Guia6.Exercise3;

import Guia6.CalculatorAbstract.CalculatorAbstract;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise3SolutionTest extends CalculatorAbstract {

    @Test
    public void exerciseAI() throws Exception {
        double[][] matrix = { {3,0,0}, {5,3,0}, {4,8,5} };
        double[] vector = {3,5,2};
        Exercise3Solution exercise = new Exercise3Solution();
        double[] result = exercise.exerciseAI(matrix, vector, calculator);
        assertEquals(result[0], 9, 0.1);
        assertEquals(result[1], 30, 0.1);
        assertEquals(result[2], 62, 0.1);
    }

    @Test
    public void exerciseAII() throws Exception {
        double[][] matrix = {{3,0,0}, {5,3,0}, {4,8,5} };
        double[][] matrix2= {{6,0,0}, {3,4,0}, {4,7,3}};
        Exercise3Solution exercise = new Exercise3Solution();
        double[][] result = exercise.exerciseAII(matrix, matrix2, calculator);
        assertEquals(result[0][0], 9 , 0.1);
        assertEquals(result[0][1], 0 , 0.1);
        assertEquals(result[0][2], 0 , 0.1);
        assertEquals(result[1][0], 8 , 0.1);
        assertEquals(result[1][1], 7 , 0.1);
        assertEquals(result[1][2], 0 , 0.1);
        assertEquals(result[2][0], 8 , 0.1);
        assertEquals(result[2][1], 15, 0.1);
        assertEquals(result[2][2], 8 , 0.1);
    }

    @Test
    public void exerciseAIII() throws Exception {
        double[][] matrix = {{3,0,0}, {5,3,0}, {4,8,5} };
        double[][] matrix2= {{6,0,0}, {3,4,0}, {4,7,3}};
        Exercise3Solution exercise = new Exercise3Solution();
        double[][] result = exercise.exerciseAIII(matrix, matrix2, calculator);
        assertEquals(result[0][0], 18, 0.1);
        assertEquals(result[0][1], 0 , 0.1);
        assertEquals(result[0][2], 0 , 0.1);
        assertEquals(result[1][0], 29, 0.1);
        assertEquals(result[1][1], 12, 0.1);
        assertEquals(result[1][2], 0 , 0.1);
        assertEquals(result[2][0], 59, 0.1);
        assertEquals(result[2][1], 45, 0.1);
        assertEquals(result[2][2], 15, 0.1);

    }

    @Test
    public void exerciseBI() throws Exception {
        double[][] matrix = { {7,8,0,0}, {5,2,3,0}, {6,2,1,9},{5,3,2,8}};
        double[] vector = {6,8,9,1};
        Exercise3Solution exercise = new Exercise3Solution();
        double[] result = exercise.exerciseBI(matrix, vector, calculator);
        assertEquals(result[0], 106, 0.1);
        assertEquals(result[1], 73 , 0.1);
        assertEquals(result[2], 70 , 0.1);
        assertEquals(result[3], 80 , 0.1);
    }

    @Test
    public void exerciseBII() throws Exception {
        double[][] matrix = { {7,8,0,0}, {5,2,3,0}, {6,2,1,9},{5,3,2,8}};
        double[][] matrix2= { {4,6,0,0}, {5,3,8,0}, {5,7,2,0},{3,7,2,7}};
        Exercise3Solution exercise = new Exercise3Solution();
        double[][] result = exercise.exerciseBII(matrix, matrix2, calculator);
        assertEquals(result[0][0], 11, 0.1);
        assertEquals(result[0][1], 14, 0.1);
        assertEquals(result[0][2], 0 , 0.1);
        assertEquals(result[0][3], 0 , 0.1);
        assertEquals(result[1][0], 10, 0.1);
        assertEquals(result[1][1], 5 , 0.1);
        assertEquals(result[1][2], 11, 0.1);
        assertEquals(result[1][3], 0 , 0.1);
        assertEquals(result[2][0], 11, 0.1);
        assertEquals(result[2][1], 9 , 0.1);
        assertEquals(result[2][2], 3 , 0.1);
        assertEquals(result[2][3], 9 , 0.1);
        assertEquals(result[3][0], 8 , 0.1);
        assertEquals(result[3][1], 10, 0.1);
        assertEquals(result[3][2], 4 , 0.1);
        assertEquals(result[3][3], 15, 0.1);

    }

    @Test
    public void exerciseBIII() throws Exception {
        double[][] matrix = { {7,8,0,0}, {5,2,3,0}, {6,2,1,9},{5,3,2,8}};
        double[][] matrix2= { {4,6,0,0}, {5,3,8,0}, {5,7,2,0},{3,7,2,7}};
        Exercise3Solution exercise = new Exercise3Solution();
        double[][] result = exercise.exerciseBIII(matrix, matrix2, calculator);
        assertEquals(result[0][0], 58, 0.1);
        assertEquals(result[0][1], 44, 0.1);
        assertEquals(result[0][2], 18 , 0.1);
        assertEquals(result[0][3], 0 , 0.1);
        assertEquals(result[1][0], 98, 0.1);
        assertEquals(result[1][1], 62 , 0.1);
        assertEquals(result[1][2], 17, 0.1);
        assertEquals(result[1][3], 72 , 0.1);
        assertEquals(result[2][0], 82, 0.1);
        assertEquals(result[2][1], 58 , 0.1);
        assertEquals(result[2][2], 23 , 0.1);
        assertEquals(result[2][3], 18 , 0.1);
        assertEquals(result[3][0], 103, 0.1);
        assertEquals(result[3][1], 63, 0.1);
        assertEquals(result[3][2], 37 , 0.1);
        assertEquals(result[3][3], 74, 0.1);
    }

    @Test
    public void exerciseCI() throws Exception {
        double[][] matrix = { {3,8,0,0}, {5,2,1,0}, {0,9,7,6},{0,0,4,5}};
        double[] vector = {6,8,9,1};
        Exercise3Solution exercise = new Exercise3Solution();
        double[] result = exercise.exerciseCI(matrix, vector, calculator);
        assertEquals(result[0], 82 , 0.1);
        assertEquals(result[1], 55 , 0.1);
        assertEquals(result[2], 141, 0.1);
        assertEquals(result[3], 41 , 0.1);
    }

    @Test
    public void exerciseCII() throws Exception {
        double[][] matrix = { {3,8,0,0}, {5,2,1,0}, {0,9,7,6},{0,0,4,5}};
        double[][] matrix2 = { {4,6,0,0}, {3,6,1,0}, {0,8,7,3},{0,0,9,1}};
        Exercise3Solution exercise = new Exercise3Solution();
        double[][] result = exercise.exerciseCII(matrix, matrix2, calculator);
        assertEquals(result[0][0], 7, 0.1);
        assertEquals(result[0][1], 14, 0.1);
        assertEquals(result[0][2], 0 , 0.1);
        assertEquals(result[0][3], 0 , 0.1);
        assertEquals(result[1][0], 8, 0.1);
        assertEquals(result[1][1], 8 , 0.1);
        assertEquals(result[1][2], 2, 0.1);
        assertEquals(result[1][3], 0 , 0.1);
        assertEquals(result[2][0], 0, 0.1);
        assertEquals(result[2][1], 17 , 0.1);
        assertEquals(result[2][2], 14 , 0.1);
        assertEquals(result[2][3], 9 , 0.1);
        assertEquals(result[3][0], 0 , 0.1);
        assertEquals(result[3][1], 0, 0.1);
        assertEquals(result[3][2], 13 , 0.1);
        assertEquals(result[3][3], 6, 0.1);
    }

    @Test
    public void exerciseCIII() throws Exception {
        double[][] matrix = { {3,8,0,0}, {5,2,1,0}, {0,9,7,6},{0,0,4,5}};
        double[][] matrix2 = { {4,6,0,0}, {3,6,1,0}, {0,8,7,3},{0,0,9,1}};
        Exercise3Solution exercise = new Exercise3Solution();
        double[][] result = exercise.exerciseCIII(matrix, matrix2, calculator);
        assertEquals(result[0][0], 42, 0.1);
        assertEquals(result[0][1], 44, 0.1);
        assertEquals(result[0][2], 6 , 0.1);
        assertEquals(result[0][3], 0 , 0.1);
        assertEquals(result[1][0], 39, 0.1);
        assertEquals(result[1][1], 45 , 0.1);
        assertEquals(result[1][2], 13, 0.1);
        assertEquals(result[1][3], 6 , 0.1);
        assertEquals(result[2][0], 40, 0.1);
        assertEquals(result[2][1], 79 , 0.1);
        assertEquals(result[2][2], 69 , 0.1);
        assertEquals(result[2][3], 57 , 0.1);
        assertEquals(result[3][0], 0 , 0.1);
        assertEquals(result[3][1], 81, 0.1);
        assertEquals(result[3][2], 67 , 0.1);
        assertEquals(result[3][3], 59, 0.1);
    }

    @Test
    public void exerciseDI() throws Exception {
    }

    @Test
    public void exerciseDII() throws Exception {
    }

    @Test
    public void exerciseDIII() throws Exception {
    }

    @Test
    public void exerciseE() throws Exception {
    }
}

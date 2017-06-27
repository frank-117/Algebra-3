// Nombres: Tomas Varela, Franco Velardez
// Guía: N°6
// Ejercicio: 4)

package Guia6.Exercise4;

import Guia6.CalculatorAbstract.CalculatorAbstract;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise4SolutionTest extends CalculatorAbstract {

    @Test
    public void summation() throws Exception {
        double[] matrixA = {4,5,3,7,6,1,2,8,6,2};
        Exercise4 exercise4 = new Exercise4Solution();
        double[][] result = exercise4.summation(matrixA, matrixA, calculator);
        for(int i = 0; i < result.length; i++){
            for (int j = 0; j < result[0].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

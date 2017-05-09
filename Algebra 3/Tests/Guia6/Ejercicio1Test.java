package Guia6;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ejercicio1Test {
    @Test
    public void ejercicioA() throws Exception {
        int[][] matrix = {{3,2,4} , {5,7,8}, {9,2,6}};
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int result = ejercicio1.ejercicioA(matrix);
        assertEquals(16, result);

    }

    @Test
    public void ejercicioB() throws Exception {
        int[][] matrix = {{3,2,4} , {5,7,8}, {9,2,6}};
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int result = ejercicio1.ejercicioB(matrix);
        assertEquals(20, result);

    }

    @Test
    public void ejercicioC(){
        int[][] matrix = {{3,2,4} , {5,7,8}, {9,2,6}};
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int[] result = ejercicio1.ejercicioC(matrix);
        assertEquals(result[0] , 9);
        assertEquals(result[1] , 20);
        assertEquals(result[2] , 17);
    }

    @Test
    public void ejercicioD(){
        int[][] matrix = {{3,2,4} , {5,7,8}, {9,2,6}};
        int[] vector = {1,2,3};
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int[] result = ejercicio1.ejercicioD(matrix , vector);
        assertEquals(result[0] , 19);
        assertEquals(result[1] , 43);
        assertEquals(result[2] , 31);

    }
}
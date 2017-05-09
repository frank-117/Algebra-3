package Guia6;

public class Ejercicio1 {

    public int ejercicioA(int[][] matrix){
        int result = 0;
        if(matrix.length == matrix[0].length) {
            for (int i = 0; i < matrix.length; i++){
                result += matrix[i][i];
            }
        }
        return result;
    }

    public int ejercicioB(int[][] matrix){
        int result = 0;
        if(matrix.length == matrix[0].length) {
            for (int i = matrix.length-1; i >= 0; i--){
                result += matrix[i][matrix.length - i - 1];
            }
        }
        return result;
    }

    public int[] ejercicioC(int[][] matrix){
        int[] result = new int[matrix.length];
        for (int i =0 ; i<matrix.length; i++){
            for(int j = 0 ; j<matrix[i].length ; j++){
                result[i] += matrix[i][j];
            }
        }
        return result;
    }

    public int[] ejercicioD(int[][] matrix , int[] vector){
        int[] result = new int[vector.length];
        for (int i =0 ; i<matrix.length; i++){
            for(int j = 0 ; j<matrix[i].length ; j++){
                result[i] += matrix[i][j]*vector[j];
            }
        }
        return result;
    }
}

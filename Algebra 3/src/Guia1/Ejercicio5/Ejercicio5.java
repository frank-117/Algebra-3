// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 5)

package Guia1.Ejercicio5;

public class Ejercicio5 {

    /**
     * El método recibe un arreglo de enteros y un número, y verifica si este ultimo se encuentra en el conjunto.
     */
    public static boolean ejercicio5(int[] a, int b) {

        for(int i=0; i<a.length; i++) {
            if(a[i] == b) {
                return true;
            }
        }
        return false;
    }
}

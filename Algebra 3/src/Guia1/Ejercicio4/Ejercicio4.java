// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 4)

package Guia1.Ejercicio4;

public class Ejercicio4 {

    /**
     * El método recibe un conjunto de enteros, y verifica si este es capicúa.
     */
    public static boolean ejercicio4(int[] a) {

        for(int i=0; i<(a.length/2); i++) {
            if(a[i] != a[a.length-(i+1)]) {
                return false;
            }
        }
        return true;
    }
}

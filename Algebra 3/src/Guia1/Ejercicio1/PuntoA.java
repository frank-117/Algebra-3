// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 1)a)

package Guia1.Ejercicio1;

public class PuntoA {

    /**
     * El método recibe un entero, y devuelve la suma de él mismo más todos los números naturales anteriores.
     */
    public static int puntoA(int a) {
        int result = 0;
        if(a >= 1) {
            for(int i=1; i<=a; i++) {
                result = result + i;
            }
        }
        return result;
    }
}

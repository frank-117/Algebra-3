// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 2)a)

package Guia1.Ejercicio2;

public class PuntoA {

    /**
     * El método recibe un entero, y devuelve su factorial.
     */
    public static int puntoA(int a) {

        int result = 0;

        if ((a == 0) || (a == 1)) {
            result = 1;
        } else if (a > 1) {
            result = a * puntoA(a - 1);
        }
        return result;
    }
}

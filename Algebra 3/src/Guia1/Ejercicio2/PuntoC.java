// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 2)c)

package Guia1.Ejercicio2;

public class PuntoC {

    /**
     * El método recibe un entero, y devuelve el valor de la sucesión Fibonacci aplicada en este número.
     */
    public static int puntoC(int a) {

        int result = 0;

        if ((a == 0) || (a == 1)) {
            result = a;
        } else if (a > 1) {
            result = puntoC(a - 1) + puntoC(a - 2);
        }
        return result;
    }
}

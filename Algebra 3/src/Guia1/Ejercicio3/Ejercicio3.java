// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 3)

package Guia1.Ejercicio3;

public class Ejercicio3 {

    /**
     * El método recibe un entero, y devuelve la cantidad de ceros que contiene.
     */
    public static int ejercicio3(int a) {

        if (a <= 0) {
            return 0;
        } else {
            if (a % 10 == 0) {
                return 1 + ejercicio3(a / 10);
            } else {
                return ejercicio3(a / 10);
            }
        }
    }
}

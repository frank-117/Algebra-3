// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 6)b)i)

package Guia1.Ejercicio6;

public class PuntoBI {

    /**
     * El método recibe un entero, y verifica que sea primo.
     */
    public static boolean puntoBI(int n) {

        if(n >= 1) {
            for(int i=2; i<n; i++) {
                if((n % i) == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

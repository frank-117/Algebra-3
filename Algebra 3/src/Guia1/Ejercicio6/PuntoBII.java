// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 6)b)ii)

package Guia1.Ejercicio6;

public class PuntoBII {

    /**
     * El método recibe un entero, y devuelve el primer número primo mayor o igual a este.
     */
    public static int puntoBII(int n) {

        int j = 0;

        for(int i=2; i<n; i++) {
            if((n % i) == 0) {
                j++;
                if(((n + j) % i) != 0) {
                    break;
                }
            }
        }
        return n + j;
    }
}

// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 6)b)iii)

package Guia1.Ejercicio6;

public class PuntoBIII {

    /**
     * El método recibe un entero, y devuelve la cantidad de factores primos que tiene.
     */
    public static int puntoBIII(int n) {

        int j = 0;

        for(int i=2; i<=n; i++) {
            while((n % i) == 0) {
                n /= i;
                j++;
            }
        }
        return j;
    }
}

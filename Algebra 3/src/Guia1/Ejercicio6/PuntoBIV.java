// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 6)b)iv)

package Guia1.Ejercicio6;

import java.util.*;

public class PuntoBIV {

    /**
     * El método recibe un entero, y devuelve en una lista sus factores primos.
     */
    public static List<Integer> puntoBIV(int n) {

        List<Integer> list = new ArrayList<Integer>();

        for(int i=2; i<=n; i++) {
            while((n % i) == 0) {
                n /= i;
                list.add(i);
            }
        }
        return list;
    }
}

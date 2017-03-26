// Nombres: Tomas Varela, Franco Velardez
// Guía: N°2
// Ejercicio: 10)

package Guia2.Ejercicio10;

import Guia2.Practice2;

public abstract class Ejercicio10 implements Practice2 {

    @Override
    public long exercise10(int n) {
        Long result = null;
        if (n >= 0) {
            for (int i = 0; i <= n; i++) {
                result += i * (long) Math.pow(2, i);
            }
        }
        return result;
    }
}

// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 6)a)

package Guia1.Ejercicio6;

public class PuntoA {

    /**
     * El método recibe un entero, y verifica que se cumpla que, si tiene algún divisor diferente al número 1 y a sí mismo
     entonces este divisor debe ser menor o igual a la raíz de este entero que le pasan.
     */
    public static boolean puntoA(int n) {

        for(int i=2; i<n; i++) {
            if((n % i) == 0) {
                if(i <= Math.sqrt(n)) {
                    return true;
                }
            }
        }
        return false;
    }
}

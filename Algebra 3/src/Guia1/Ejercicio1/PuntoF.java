// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 1)f)

package Guia1.Ejercicio1;

public class PuntoF {

    /**
     * El método recibe un número, y devuelve la suma de él mismo elevado al cubo, más todos los números naturales
     * anteriores elevados al cubo respectivamente..
     */
    public static double puntoF(double a) {
        double result = 0;
        if(a >= 1) {
            for(int i=1; i<=a; i++) {
                result = result + Math.pow(i, 3);
            }
        }
        return result;
    }
}

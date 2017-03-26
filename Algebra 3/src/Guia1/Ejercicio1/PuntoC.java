// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 1)c)

package Guia1.Ejercicio1;

public class PuntoC {

    /**
     * El método recibe un coeficiente y una potencia, y devuelve la suma de éste elevado a la potencia, más la suma
     * del mismo elevado a la potencia-1, y así sucesivamente hasta que esta valga cero inclusive.
     */
    public static double puntoC(double number, double power) {
        double result = 0;
        if(power >= 0) {
            for(int i=0; i<=power; i++) {
                result = result + Math.pow(number, i);
            }
        }
        return result;
    }
}

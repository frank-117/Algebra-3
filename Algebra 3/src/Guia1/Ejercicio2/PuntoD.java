// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 2)d)

package Guia1.Ejercicio2;

public class PuntoD {

    /**
     * El método recibe dos enteros, y devuelve su máximo común divisor.
     */
    public static int puntoD(int a, int b) {

        while(a != b){
            if(a > b){
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}

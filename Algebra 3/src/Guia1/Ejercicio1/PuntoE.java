// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 1)e)

package Guia1.Ejercicio1;

public class PuntoE {

    /**
     * El método recibe un entero, y devuelve la suma de él mismo multiplicado por el número entero siguiente,
     * más todos los números naturales anteriores multiplicadods por sus próximos, respectivamente.
     */
    public static int puntoE(int a) {
        int result = 0;
        if(a >= 1) {
            for(int i=1; i<=a; i++) {
                result = result + (i*(i+1));
            }
        }
        return result;
    }
}

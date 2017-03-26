// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 1)d)

package Guia1.Ejercicio1;

public class PuntoD {

    /**
     * El método recibe un entero, y devuelve la suma de él mismo multiplicado por dos, y al resultado
     * disminuído en 1, más todos los números naturales impares anteriores a este resultado obtenido.
     */
    public static int puntoD(int a) {
        int result = 0;
        if(a >= 1) {
            for(int i=1; i<=a; i++) {
                result = result + ((2*i)-1);
            }
        }
        return result;
    }
}

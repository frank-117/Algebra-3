// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 1)b)

package Guia1.Ejercicio1;

public class PuntoB {

    /**
     * El método recibe un entero, y devuelve la suma de él mismo elevado al cuadrado más todos los números
     * naturales anteriores, cada uno elevado al cuadrado respectivamente.
     */
    public static int puntoB(int a) {
        int result = 0;
        if(a >= 1) {
            for(int i=1; i<=a; i++) {
                result = result + i*i;
            }
        }
        return result;
    }
}

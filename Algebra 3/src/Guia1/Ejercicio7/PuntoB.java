// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 7)b)

package Guia1.Ejercicio7;

public class PuntoB {

    /**
     * El método recibe dos enteros, y devuelve su máximo común divisor usando el algoritmo de Euclides de
     * forma iterativa.
     */
    public static int formaIterativa(int a, int b) {

        while(a != b){
            if(a > b){
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    /**
     * El método recibe dos enteros, y devuelve su máximo común divisor usando el algoritmo de Euclides de
     * forma recursiva.
     */
    public static int formaRecursiva(int a, int b) {

        if(b == 0) {
            return a;
        } else {
            return formaRecursiva(b, a % b);
        }
    }
}

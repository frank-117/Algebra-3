// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 8)

package Guia1.Ejercicio8;

/**
 * La evaluación usando la forma monomial del polinomio de grado-n requiere al menos
 * n sumas y (n^2+n)/2 multiplicaciones, si las potencias se calculan mediante la repetición
 * de multiplicaciones. El algoritmo de Horner sólo requiere n sumas y n multiplicaciones.
 * (Minimizar el número de multiplicaciones es lo más deseable porque necesitan mucha carga
 * computacional y son inestables comparadas con la suma).
 */

public class Ejercicio8 {

    /**
     * El método recibe un arreglo de enteros(coeficientes del polinomio), un entero que representa el grado,
     * y otro entero que equivale el valor de x en el cual se quiere evaluar la función; y devuelve el valor de esta
     * evaluada en x, utilizando la regla de Horner de forma iterativa.
     */
    public static int formaIterativa(int[] poly, int n, int x) {

        int result = poly[0];

        for(int i=1; i<=n; i++) {
            result = (result * x) + poly[i];
        }
        return result;
    }

    /**
     * El método recibe un arreglo de enteros(coeficientes del polinomio), un entero que representa el grado,
     * y otro entero que equivale el valor de x en el cual se quiere evaluar la función; y devuelve el valor de esta
     * evaluada en x, utilizando la regla de Horner de forma recursiva.
     */
    public static int formaRecursiva(int[] poly, int n, int x) {

        if(n == 0) {
            return poly[0];
        }
        return (formaRecursiva(poly, n-1, x) * x) + poly[n];
    }
}

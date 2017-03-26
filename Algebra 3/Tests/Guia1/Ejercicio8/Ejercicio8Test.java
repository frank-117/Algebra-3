// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 8)

package Guia1.Ejercicio8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Ejercicio8Test {

    @Test
    public void Ejercicio4Test() {

        int[] poly = {1, 2, 3};
        int x = 2;
        int n = poly.length-1;
        int test0 = Guia1.Ejercicio8.Ejercicio8.formaIterativa(poly, n, x);
        int test1 = Guia1.Ejercicio8.Ejercicio8.formaRecursiva(poly, n, x);
        // test0 = test1
        assertEquals(11, test0);
        assertEquals(11, test1);
    }
}

// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 7)b)

package Guia1.Ejercicio7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PuntoBTest {

    @Test
    public void puntoBTest() {

        int test0 = Guia1.Ejercicio7.PuntoB.formaIterativa(10, 15);
        int test1 = Guia1.Ejercicio7.PuntoB.formaRecursiva(10, 15);
        // test0 = test1
        assertEquals(5, test0);
        assertEquals(5, test1);
    }
}

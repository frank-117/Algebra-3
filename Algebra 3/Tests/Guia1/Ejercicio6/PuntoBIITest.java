// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 6)b)ii)

package Guia1.Ejercicio6;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PuntoBIITest {

    @Test
    public void puntoBIITest() {

        int test = Guia1.Ejercicio6.PuntoBII.puntoBII(6);
        assertEquals(7, test);
    }
}

// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 6)b)iii)

package Guia1.Ejercicio6;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PuntoBIIITest {

    @Test
    public void puntoBIIITest() {

        int test = Guia1.Ejercicio6.PuntoBIII.puntoBIII(24);
        assertEquals(4, test);
    }
}

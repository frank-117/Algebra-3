// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 6)b)i)

package Guia1.Ejercicio6;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class PuntoBITest {

    @Test
    public void puntoBITest() {

        boolean test = Guia1.Ejercicio6.PuntoBI.puntoBI(7);
        assertTrue(test);
    }
}

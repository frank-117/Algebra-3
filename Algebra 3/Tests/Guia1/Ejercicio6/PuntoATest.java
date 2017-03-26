// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 6)a)

package Guia1.Ejercicio6;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class PuntoATest {

    @Test
    public void puntoATest() {

        boolean test = Guia1.Ejercicio6.PuntoA.puntoA(10);
        assertTrue(test);
    }
}

// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 2)b)

package Guia1.Ejercicio2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PuntoBTest {

    @Test
    public void puntoBTest() {

        double test = Guia1.Ejercicio2.PuntoB.puntoB(5);
        assertEquals(32, test, 0);
    }
}

// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 1)b)

package Guia1.Ejercicio1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PuntoBTest {

    @Test
    public void puntoBTest() {

        int test = Guia1.Ejercicio1.PuntoB.puntoB(5);
        assertEquals(55, test);
    }
}

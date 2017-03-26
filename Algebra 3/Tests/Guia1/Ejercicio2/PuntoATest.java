// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 2)a)

package Guia1.Ejercicio2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PuntoATest {

    @Test
    public void puntoATest() {

        int test = Guia1.Ejercicio2.PuntoA.puntoA(5);
        assertEquals(120, test);
    }
}

// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 1)a)

package Guia1.Ejercicio1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PuntoATest {

    @Test
    public void puntoATest() {

        int test = Guia1.Ejercicio1.PuntoA.puntoA(5);
        assertEquals(15, test);
    }
}

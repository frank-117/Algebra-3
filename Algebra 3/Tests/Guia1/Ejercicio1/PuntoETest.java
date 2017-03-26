// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 1)e)

package Guia1.Ejercicio1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PuntoETest {

    @Test
    public void puntoETest() {

        int test = Guia1.Ejercicio1.PuntoE.puntoE(5);
        assertEquals(70, test);
    }
}

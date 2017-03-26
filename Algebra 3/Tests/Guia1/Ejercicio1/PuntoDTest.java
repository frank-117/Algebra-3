// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 1)d)

package Guia1.Ejercicio1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PuntoDTest {

    @Test
    public void puntoDTest() {

        int test = Guia1.Ejercicio1.PuntoD.puntoD(5);
        assertEquals(25, test);
    }
}

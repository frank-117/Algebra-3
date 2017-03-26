// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 2)d)

package Guia1.Ejercicio2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PuntoDTest {

    @Test
    public void puntoDTest() {

        int test = Guia1.Ejercicio2.PuntoD.puntoD(15, 10);
        assertEquals(5, test);
    }
}

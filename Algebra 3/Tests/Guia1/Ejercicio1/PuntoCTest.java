// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 1)c)

package Guia1.Ejercicio1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PuntoCTest {

    @Test
    public void puntoCTest() {

        double test = Guia1.Ejercicio1.PuntoC.puntoC(5, 3);
        assertEquals(156, test, 0);
    }
}

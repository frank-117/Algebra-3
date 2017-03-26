// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 2)c)

package Guia1.Ejercicio2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PuntoCTest {

    @Test
    public void puntoCTest() {

        int test = Guia1.Ejercicio2.PuntoC.puntoC(5);
        assertEquals(5, test);
    }
}

// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 1)f)

package Guia1.Ejercicio1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PuntoFTest {

    @Test
    public void puntoFTest() {

        double test = Guia1.Ejercicio1.PuntoF.puntoF(5);
        assertEquals(225, test, 0);
    }
}

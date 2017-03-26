// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 7)a)i)

package Guia1.Ejercicio7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Este ejercicio fue resuelto implmentando el algoritmo creado en el Ejercicio 2, Punto D
 */

public class PuntoAI {

    @Test
    public void puntoAI() {

        int test = Guia1.Ejercicio2.PuntoD.puntoD(123, 277);
        assertEquals(1, test);
    }
}

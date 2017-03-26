// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 7)a)ii)

package Guia1.Ejercicio7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Este ejercicio fue resuelto implmentando el algoritmo creado en el Ejercicio 2, Punto D
 */

public class PuntoAII {

    @Test
    public void puntoAII() {

        int test = Guia1.Ejercicio2.PuntoD.puntoD(111, 201);
        assertEquals(3, test);
    }
}

// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 7)a)iii)

package Guia1.Ejercicio7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Este ejercicio fue resuelto implmentando el algoritmo creado en el Ejercicio 2, Punto D
 */

public class PuntoAIII {

    @Test
    public void puntoAIII() {

        int test = Guia1.Ejercicio2.PuntoD.puntoD(14039, 1529);
        assertEquals(139, test);
    }
}

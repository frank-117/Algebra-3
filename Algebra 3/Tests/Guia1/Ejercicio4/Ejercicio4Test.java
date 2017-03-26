// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 4)

package Guia1.Ejercicio4;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class Ejercicio4Test {

    @Test
    public void Ejercicio4Test() {

        int[] testing = {1, 2, 3, 2, 1};
        boolean test = Guia1.Ejercicio4.Ejercicio4.ejercicio4(testing);
        assertTrue(test);
    }
}

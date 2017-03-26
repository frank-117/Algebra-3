// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 5)

package Guia1.Ejercicio5;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class Ejercicio5Test {

    @Test
    public void Ejercicio5Test() {

        int[] testing = {1, 2, 3, 4, 5};
        int toTest = 3;
        boolean test = Guia1.Ejercicio5.Ejercicio5.ejercicio5(testing, toTest);
        assertTrue(test);
    }
}

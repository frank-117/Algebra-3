// Nombre: Franco Velardez
// Guía: N°1
// Ejercicio: 6)b)iv)

package Guia1.Ejercicio6;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.*;

public class PuntoBIVTest {

    @Test
    public void puntoBIIITest() {

        List<Integer> list = Arrays.asList(2, 2, 2, 3);
        List<Integer> test = Guia1.Ejercicio6.PuntoBIV.puntoBIV(24);
        assertThat(list, is(test));
    }
}

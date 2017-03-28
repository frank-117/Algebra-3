// Nombre: Tomas Varela, Franco Velardez
// Guía: N°2
// Ejercicio: 8), 9), 10), 11)

package Guia2;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Guia2Test {

    @Test
    public void exercise8Test() {
        Guia2 test = new Guia2();
        long result = test.exercise8(10, 20);
        assertEquals(165, result);
    }

    @Test
    public void exercise9Test() {
        Guia2 test = new Guia2();
        long result = test.exercise9(1, 5, 2, 4);
        assertEquals(135, result);
    }

    @Test
    public void exercise10Test() {
        Guia2 test = new Guia2();
        long result = test.exercise10(5);
        assertEquals(258, result);
    }

    @Test
    public void exercise11SumationTest() {
        Guia2 test = new Guia2();
        double result = test.exercise11Sumation(6, 5);
        assertEquals(112305, result, 0);
    }

    @Test
    public void exercise11FormulaTest() {
        Guia2 test = new Guia2();
        double result = test.exercise11Formula(6, 5);
        assertEquals(112305, result, 0);
    }

    @Test
    public void exercise11Test() {
        Guia2 test = new Guia2();
        double result1 = test.exercise11Sumation(6, 5);
        double result2 = test.exercise11Formula(6, 5);
        assertEquals(result1, result2, 0);
    }
}

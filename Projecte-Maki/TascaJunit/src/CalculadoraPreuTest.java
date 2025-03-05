import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraPreuTest {
    @Test
    void testCalcularPreuFinal() {
        assertEquals(5, CalculadoraPreu.calcularPreuFinal(3, false, false));
        assertEquals(5, CalculadoraPreu.calcularPreuFinal(3, true, false));
        assertEquals(5.445, CalculadoraPreu.calcularPreuFinal(5, true, true)); /*No arrodoneix el preu */
        assertEquals(17.41311, CalculadoraPreu.calcularPreuFinal(15.99, true, true)); /*No arrodoneix el preu */
        assertEquals(90, CalculadoraPreu.calcularPreuFinal(100, true, false));
        assertEquals(121, CalculadoraPreu.calcularPreuFinal(100, false, true));
        assertEquals(108.9, CalculadoraPreu.calcularPreuFinal(100, true, true));
    }
}

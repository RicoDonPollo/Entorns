
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class OperacionsMatematiquesTest {
    @Test
    void testMultiplicacioPositiu() {
        assertEquals(25, OperacionsMatematiques.multiplicacio(5, 5));

    }

    @Test
    void testMultiplicacioNegatiu() {
        assertEquals(25, OperacionsMatematiques.multiplicacio(-5, -5));

    }

    @Test
    void testRestaPositius() {
        assertEquals(4, OperacionsMatematiques.resta(6, 2));

    }

    @Test
    void testRestaNegatius() {
        assertEquals(0, OperacionsMatematiques.resta(-4, -4));

    }

    @Test
    void testSumaPositius() {
        assertEquals(4, OperacionsMatematiques.suma(2, 2));
    }

    @Test
    void testSumaNegatius() {
        assertEquals(-8, OperacionsMatematiques.suma(-3, -5));
    }
}

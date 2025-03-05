import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ParSenarTest {
    @Test
    void testMain() {
        assertEquals("Par", ParSenar.verificarParSenar(2));
        assertEquals("Par", ParSenar.verificarParSenar(4)); 
        assertEquals("Par", ParSenar.verificarParSenar(6));
        assertEquals("Par", ParSenar.verificarParSenar(-2));

        assertEquals("Senar", ParSenar.verificarParSenar(3));
        assertEquals("Senar", ParSenar.verificarParSenar(5)); 
        assertEquals("Senar", ParSenar.verificarParSenar(7));
        assertEquals("Senar", ParSenar.verificarParSenar(-3));


    }

    @Test
    void testVerificarParSenar() {

    }
}

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DNIValidatorTest {
    @Test
    void testValidarDNI() {
        assertEquals(false, DNIValidator.validarDNI(null));
        assertEquals(true, DNIValidator.validarDNI("12345678Z"));
        assertEquals(false, DNIValidator.validarDNI("32412343A"));
        assertEquals(false, DNIValidator.validarDNI("87833838F"));

    }
}

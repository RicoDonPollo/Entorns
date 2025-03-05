import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MathUtilsTest {
    @Test
    void testFactorial() {
        assertEquals(1, MathUtils.factorial(0));
        assertEquals(1, MathUtils.factorial(1));
        assertEquals(2, MathUtils.factorial(2)); 
        assertEquals(120, MathUtils.factorial(5)); 
        assertEquals(720, MathUtils.factorial(6)); 
        assertEquals(5040, MathUtils.factorial(7)); 

    }

    @Test
    void testGcd() {
        assertEquals(1, MathUtils.gcd(7,5)); 
        assertEquals(5, MathUtils.gcd(15,5)); 
        assertEquals(7, MathUtils.gcd(14,7)); 
        assertEquals(2, MathUtils.gcd(14,2)); 
        assertEquals(5, MathUtils.gcd(1000,5)); 

    }

    @Test
    void testIsPrime() {
        assertEquals(false, MathUtils.isPrime(1)); /*el 4 es un numero primer*/
        assertEquals(true, MathUtils.isPrime(2));
        assertEquals(true, MathUtils.isPrime(3));
        assertEquals(false, MathUtils.isPrime(4)); /*el 4 es un numero primer*/
        assertEquals(true, MathUtils.isPrime(5));

    }

    @Test
    void testSumOfDivisors() {
        assertEquals(-1, MathUtils.sumOfDivisors(0));
        assertEquals(-1, MathUtils.sumOfDivisors(-10));
        assertEquals(4, MathUtils.sumOfDivisors(3));
        assertEquals(6, MathUtils.sumOfDivisors(5));
        assertEquals(39, MathUtils.sumOfDivisors(18));
        assertEquals(24, MathUtils.sumOfDivisors(15));

    }
}

public class MathUtils {

    /**
     * Determina si un número és primer.
     * 
     * @param number El número enter positiu a comprovar.
     * @return true si el número és primer, false en cas contrari.
     */
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Calcula el factorial d'un número enter no negatiu.
     * 
     * @param number El número enter no negatiu.
     * @return El factorial del número, o -1 si el número és negatiu.
     */
    public static long factorial(int number) {
        if (number < 0) return -1;
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Retorna la suma de tots els divisors positius d'un número.
     * 
     * @param number El número enter positiu.
     * @return La suma dels divisors del número, o -1 si el número és negatiu.
     */
    public static int sumOfDivisors(int number) {
        if (number <= 0) return -1;
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    /**
     * Calcula el màxim comú divisor (GCD) de dos números.
     * 
     * @param a El primer número enter positiu.
     * @param b El segon número enter positiu.
     * @return El màxim comú divisor (GCD) dels dos números.
     */
    public static int gcd(int a, int b) {
        if (a <= 0 || b <= 0) return -1;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
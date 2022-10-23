public class Euclidean {
    /**
     * Calculates the greatest common denominator of two numbers, where m > n, using the Euclidean algorithm.
     *
     * @param m  first number
     * @param n  second number, n < m
     */
    public static int gcd(int m, int n) {
        if (m % n == 0) {
            return n;
        }
        return gcd(n,(m%n));
    }

    /**
     * Calculates the least common multiple of two numbers, where m > n.
     *
     * @param m  first number
     * @param n  second number, n < m
     */
    public static int lcm(int m, int n) {
        int gcd = gcd(m,n);
        return (m*n)/gcd;
    }
}

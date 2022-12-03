import java.util.ArrayList;

public class FindPrimeFactors {
    public static long[] getPrimeFactors(long n) {
        ArrayList<Integer> primes = SieveOfEratosthenes.getPrimes((int) (Math.sqrt(n)) + 1);

        for (Integer prime : primes) {
            if (n % prime == 0) {
                return (new long[]{prime, n / prime});
            }
        }

        return new long[]{0,0};
    }
}

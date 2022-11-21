import java.util.ArrayList;

public class SieveOfAtkins {
    public static ArrayList<Long> getPrimes(long limit) {
        ArrayList<Long> primes = new ArrayList<Long>();
        if (limit > 2) {
            primes.add(2L);
        }

        if (limit > 3) {
            primes.add(3L);
        }

        for (long x = 1; x*x < limit; x++) {
            for (long y = 1; y*y < limit; y++) {
                long n = (4 * x * x) + (y * y);
                if (n <= limit && (n % 12 == 1 || n % 12 == 5)) {
                    if (!primes.contains(n)) {
                        primes.add(n);
                    }
                }

                n = (3*x*x) + (y*y);
                if (n < limit && (n % 12 == 7)) {
                    if (!primes.contains(n)) {
                        primes.add(n);
                    }
                }

                n = (3 * x * x) - (y * y);
                if (x > y && n <= limit && n % 12 == 11) {
                    if (!primes.contains(n)) {
                        primes.add(n);
                    }
                }
            }
        }

        for (long r = 5; r*r < limit; r++) {
            if (primes.contains(r)) {
                for (long j = r * r; j < limit; j += 2*r) {
                    primes.remove(j);
                }
            }
        }

        return primes;
    }

    public static void main(String[] args) {
        System.out.println(java.time.LocalDateTime.now());
        System.out.println(getPrimes(1000000).size());
        System.out.println(java.time.LocalDateTime.now());
    }
}

import java.util.ArrayList;
import java.util.Collections;

public class SieveOfEratosthenes {
    /**
     * Given an upper limit n, this method uses a slightly optimized version of the
     * Sieve of Eratosthenes to compute all prime numbers from 1 to n.
     *
     * @param n The upper limit of which the method will calculate prime numbers to.
     * @return Returns an ArrayList of type Integer that contains prime numbers up until the limit.
     */
    public static ArrayList<Integer> getPrimes(int n)
    {
        ArrayList<Integer> primes = new ArrayList<>(Collections.singletonList(2));
        boolean[] prime = new boolean[n];
        for(int i=0;i<n;i++)
            prime[i] = true;

        for(int p = 3; p*p < n; p+=2)
        {
            if(prime[p])
            {
                for(int i = p*p; i < n; i += 2*p)
                    prime[i] = false;
            }
        }

        for(int i = 3; i < n; i+=2)
        {
            if(prime[i])
                primes.add(i);
        }

        return primes;
    }

    public static void main(String[] args) {
        System.out.println(java.time.LocalDateTime.now());
        System.out.println(getPrimes(10000000).size());
        System.out.println(java.time.LocalDateTime.now());
    }
}


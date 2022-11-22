function getPrimes(n) {
    let primes = [2];
    let prime = new Array(n).fill(true);

    for (let p = 3; p*p < n; p += 2) {
        if (prime[p]) {
            for (let i = p*p; i < n; i += 2*p) {
                prime[i] = false;
            }
        }
    }

    for (let i = 3; i < n; i += 2) {
        if (prime[i]) {
            primes.push(i)
        }
    }

    return primes;
}

console.log(getPrimes(1000000000).length);
import math
import time

def primes(n):
    lis = [True] * n
    for p in range(3,int(n**0.5)+1,2):
        if lis[p]:
            for i in range(p*p,n+1,2*p):
                lis[i] = False
    return [2] + [p for p in range(3,n,2) if lis[p]]

def getFactors(n):
    prime = primes(math.isqrt(n)+1)

    for x in prime:
        if n % x == 0:
            return [x, int(n / x)]
        
    return [0,0]

start = time.time()*1000.0
print(primes(100000000))
# print(getFactors(9999996000000320))
end = time.time()*1000.0
print(end-start)
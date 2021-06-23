package com.way;

public class SuperPrimeNum {

	// Generate all prime
    // numbers less than n.
    static void SieveOfEratosthenes
                (int n, boolean isPrime[])
    {
        // Initialize all entries of boolean
        // array as true. A value in isPrime[i]
        // will finally be false if i is Not
        // a prime, else true bool isPrime[n+1];
        isPrime[0] = isPrime[1] = false;
        for (int i=2; i<=n; i++)
            isPrime[i] = true;
     
        for (int p=2; p*p<=n; p++)
        {
            // If isPrime[p] is not changed,
            // then it is a prime
            if (isPrime[p] == true)
            {
                // Update all multiples of p
                for (int i=p*2; i<=n; i += p)
                    isPrime[i] = false;
            }
        }
    }
     
    // Primts all super primes less
    // than or equal to n.
    static void superPrimes(int n)
    {
         
        // Generating primes using Sieve
        boolean isPrime[]=new boolean[n+1];
        SieveOfEratosthenes(n, isPrime);
     
        // Storing all the primes generated
        // in a an array primes[]
        int primes[] = new int[n+1];
        int j = 0;
         
        System.out.print(0 + " " + 0 + " ");
        
        for (int p=2; p<=n; p++) {
        	if(isPrime[p]) {
        		System.out.print("1 ");	
        	}else {
        		System.out.print("0 ");
        	}
        	
        }
        
        System.out.println("");
        
        System.out.print(primes[0] + " " + primes[1] + " ");
        
        for (int p=2; p<=n; p++) {
            if (isPrime[p]) {
                primes[j++] = p;
                System.out.print(p + " ");
            }
        }
     
        System.out.println("");
        
        // Printing all those prime numbers that
        // occupy prime numbered position in
        // sequence of prime numbers.
        for (int k=0; k<j; k++)
            if (isPrime[k+1])
                System.out.print(primes[k]+ " ");
    }
     
    // Driven program
    public static void main(String args[])
    {
        int n = 241;
        System.out.println("Super-Primes less than or equal to "
                            +n+" are :");
        superPrimes(n);
    }
	
}

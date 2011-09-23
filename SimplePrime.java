/* Xiao G. Wu
 * CS111A - Assignment 5
 * 09/23/2010
 */

/** This class implements a sieve that displays all prime numbers up to a given limit. This sieve uses the trial division algorithm */ 

public class SimplePrime 
{
    public static void main(String[] args) 
    {
        final int MAX = 1000000; // Number of integers to check for Primality
        int i;
        int f;
        int r0Count = 0; // Remainder Zero Count
        int largestPrime = 0; // Keep track of largest Prime number
        int numPrimes = 0; // Keep track of number of prime numbers found

        for (i = 2; i <= MAX; i++) // Outerloop: integers to check for primality 
        {
            for (f = 1; f <= Math.sqrt(i); f++) // Innerloop: according to wikipedia, using the trial division method, divide each integer by possible factor starting from 1 to square root of the integer.
            {
                if (i % f == 0)
                {
                    r0Count++; // Count the number of Remainder Zero Occurences
                }
            }    
            if (r0Count == 1) // If the number of Remainder Zero Occurences is 1, then that integer is prime
            {    
                System.out.print(i + " ");
                largestPrime = Math.max(i, largestPrime);
                numPrimes++;
            }
            r0Count = 0; // Reset Remainder Zero Occurences
        }
        System.out.println(); // Add new line to keep interface clean.
        System.out.printf("There are %d prime numbers\n", numPrimes);
        System.out.printf("Largest prime number less than %d is %d\n", MAX, largestPrime);
    }
}

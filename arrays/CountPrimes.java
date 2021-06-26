//Count the number of prime numbers less than a non-negative number, n.
//We need to create a function that returns the count of prime numbers till n.
//Logic: using sieve of eratosthenes.
//Time complexity: O(n^2) , Space complexity: O(n);
class Solution
{
  public int coutPrimes(int n)
  {
    boolean[] primes = new boolean[n];
    for(int i=0;i<primes.length;i++)
    {
      primes[i]=true;
    }
    for(int i=2;i*i<primes.length;i++)
    {
      if(primes[i])
      {
        for(int j=2;j*i<primes.length;j++)
        {
          //if the numbers are multiples then they are not primes.
          primes[i*j]=false;
        }
      }
    }
    int primeCount=0;
    for(int i=2;i<primes.length;i++)
    {
        if(primes[i])
        {
          primeCount++;
        }
    }
    return primeCount;
  }
}

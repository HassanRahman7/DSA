package sieve_of_erastosthenes;

public class Count_Primes
{
    public static int countPrimes(int n)
    {
        if(n==0||n==1)
            return 0;
        int i=2,j;
        boolean primes[]=new boolean[n];
        primes[0]=false;
        primes[1]=false;
        while(i!=n)
            primes[i++]=true;
        i=2;
        while(i<=(int)Math.sqrt(n))
        {
            if(primes[i]==true)
            {
                for(j=i*i;j<n;j=j+i)
                    primes[j]=false;
            }
            i++;
        }
        int ans=0;
        i=2;
        while(i!=n)
        {
            if(primes[i]==true)
                ans++;
            i++;
        }
        return ans;

    }
    public static void main(String[] args)
    {
        System.out.println(countPrimes(0));
    }
}
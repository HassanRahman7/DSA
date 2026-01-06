package sieve_of_erastosthenes;

public class find_the_count_of_numbers_which_are_not_special
{
    public static int nonSpecialCount(int l, int r)
    {
        // From observation I understood that the special numbers are those numbers which are the square of prime numbers. Toh pehle limit ka sqrt root nikal kr let me find out all the prime numbers
        int left=(int) Math.sqrt(l);
        int right=(int) Math.sqrt(r);
        // Now I will find out all the prime numbers in the range left to right.
        boolean primes[]=new boolean[right+1];
        primes[0]=false;
        primes[1]=false;
        int i=2;
        while(i<=right)
            primes[i++]=true;
        i=2;
        int j;
        while(i<=right)
        {
            if(primes[i]==true)
            {
                for(j=i*i;j<primes.length;j=j+i)
                    primes[j]=false;
            }
            i++;
        }
        // System.out.println(primes[2]);
        i=left;
        int special=0;
        while(i<=right)
        {
            if(primes[i]==true)
            {
                if(i*i>=l && i*i<=r)
                    special++;
            }
            i++;
        }
//        System.out.println(special);
        // System.out.println(special);
        return r-l+1-special;
    }
    public static void main(String[] args)
    {
        System.out.println(nonSpecialCount(5,7));
    }
}

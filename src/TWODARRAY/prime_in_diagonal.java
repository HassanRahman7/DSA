package TWODARRAY;

public class prime_in_diagonal
{
    public static int diagonalPrime(int[][] arr)
    {
        int i=0,j=0;
        int ans=0;
        // First we will get the largest number in the arr
        int max=0;
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr[0].length;j++)
            {
                max=(int)Math.max(arr[i][j],max);
            }
        }
        // Now we shall use the sieve of erastosthenens method
        boolean primes[]=new boolean[max+1];
        primes[0]=false;
        primes[1]=false;
        i=2;
        while(i!=max+1)
            primes[i++]=true;
        i=2;
        // int j;
        while(i<=(int)Math.sqrt(max+1))
        {
            if(primes[i]==true)
            {
                for(j=i*i;j<max;j=j+i)
                    primes[j]=false;
                // i++;
            }
            i++;
        }
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr[0].length;j++)
            {
                if(i==j || i+j==arr.length-1)
                {
                    if(primes[arr[i][j]]==true)
                        ans=(int)Math.max(ans,arr[i][j]);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int arr[][]={{1,2,3},{5,6,7},{9,10,11}};
        System.out.println(diagonalPrime(arr));
    }
}

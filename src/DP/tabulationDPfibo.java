package DP;

public class tabulationDPfibo
{
    public static int fib(int n)
    {
        if(n==0)
            return 0;
        else if(n==1 || n==2)
            return 1;
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        int i=2;
        while(i!=n+1)
        {
            dp[i]=dp[i-1]+dp[i-2];
            i++;
        }
        return dp[n];
    }

    public static void main(String[] args)
    {
        System.out.println(fib(4));
    }
}

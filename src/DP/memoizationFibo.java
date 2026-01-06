package DP;

public class memoizationFibo
{
    public static int fibo(int n,int dp[])
    {
        if(n==0)
            return 0;
        else if(n==1||n==2)
            return 1;
        if(dp[n]!=0)
            return dp[n];
        int ans=fibo(n-1,dp)+fibo(n-2,dp);
        dp[n]=ans;
        return ans;
    }
    public static int fib(int n)
    {
        int dp[]=new int[n+1];
        return fibo(n,dp);
    }

    public static void main(String[] args)
    {
        System.out.println(fib(4));
    }
}

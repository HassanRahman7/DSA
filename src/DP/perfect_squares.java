package DP;

import java.util.HashMap;

public class perfect_squares 
{
    public static boolean isPersq(int n)
    {
        if((int)Math.sqrt(n)*(int)Math.sqrt(n)==n)
            return true;
        else
            return false;
    }
    public static int numSquares2(int n,HashMap<Integer,Integer> map) 
    {
        if(isPersq(n)==true)
        {
            map.put(n,1);
            return 1;
        }
        if(map.containsKey(n)==true)
            return map.get(n);
        int i=1,ans=Integer.MAX_VALUE;
        for(i=1;i*i<=n;i++)
            ans=(int)Math.min(ans,numSquares2(n-i*i,map)+numSquares2(i*i,map));
        map.put(n,ans);
        return ans;
    }
    public static int numSquares(int n)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        return numSquares2(n,map);
    }
    public static int Tabulation(int n)
    {
        int dp[]=new int[n+1];
        int j,i=1,ans=Integer.MAX_VALUE;        
        while(i!=dp.length)
        {
            if(isPersq(i)==true)
                dp[i]=1;
            else
            {
                ans=Integer.MAX_VALUE;
                for(j=1;j*j<=i;j++)
                    ans=(int)Math.min(ans,dp[j*j]+dp[i-(j*j)]);
                dp[i]=ans;
            }
            i++;
        }
        return dp[n];
    }
    public static void main(String[] args) 
    {
        System.out.println(numSquares(33));
        System.out.println(Tabulation(13));
    }
}

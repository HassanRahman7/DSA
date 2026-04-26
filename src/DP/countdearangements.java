package DP;

import java.util.Arrays;
import java.util.HashMap;

public class countdearangements 
{
    public static int helper(int n,HashMap<Integer,Integer> map)
    {
        if(n==1)
            return 0;
        if(n==2)
            return 1;
        if(map.containsKey(n)==true)
            return map.get(n);
        int ans=(n-1)*(helper(n-2,map)+helper(n-1,map));
        map.put(n,ans);
        return ans;
    }
    public static int tabu(int n,int dp[])
    {
        if(n==1)
            return dp[n];
        if(n==2)
            return dp[n];
        int i=3;
        while(i!=dp.length)
        {
            dp[i]=(i-1)*(dp[i-2]+dp[i-1]);
            i++;
        }
        return dp[n];
    }
    public static int derangeCount(int n) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        dp[1]=0;
        if(n==1)
            return 0;
        
        dp[2]=1;
        return tabu(n,dp);
        // return helper(n,map);
    }
    public static void main(String[] args) 
    {
        System.out.println(derangeCount(5));
        
    }
    
}

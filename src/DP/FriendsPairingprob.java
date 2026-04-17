package DP;

import java.util.HashMap;

public class FriendsPairingprob 
{
    public static long helper(int n,HashMap<Integer,Long> map)
    {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        if(n==3)
            return 4;
        if(map.containsKey(n)==true)
            return map.get(n);
        long ans=helper(n-1,map)+(n-1)*helper(n-2,map);
        map.put(n,ans);
        return ans;
    }
    public static long countFriendsPairings(int n) 
    {
        HashMap<Integer,Long> map=new HashMap<>();
        return helper(n,map);
    }
    public static long solvingwithtabu(int n)
    {
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        dp[3]=4;
        int i=4;
        while(i!=dp.length)
        {
            dp[i]=dp[i-1]+(i-1)*dp[i-2];
            i++;
        }
        return dp[n];
    }
    public static void main(String[] args)     
    {
        System.out.println(countFriendsPairings(12));
        System.out.println(solvingwithtabu(12));   
    }    
}

package DP;

import java.util.Arrays;

public class HouseRobbermemo 
{
    public static int amount(int arr[],int i,int dp[])
    {
        if(i>=arr.length)
            return 0;
        if(dp[i]!=-1)
            return dp[i];
        int take=arr[i]+amount(arr,i+2,dp);
        int skip=amount(arr,i+1,dp);
        dp[i]=(int)Math.max(take,skip);
        return dp[i];
    }
    public static int rob(int[] arr) 
    {
        int dp[]=new int[arr.length];
        Arrays.fill(dp,-1);
        return amount(arr,0,dp);   
    }
    public static int tabu(int arr[],int dp[])
    {
        if(arr.length==1)
            return arr[arr.length-1];
        int i=2;
        dp[0]=arr[0];
        dp[1]=(int)Math.max(dp[0],arr[1]);
        while(i!=dp.length)
        {
            dp[i]=(int)Math.max(arr[i]+dp[i-2],dp[i-1]);       
            i++; 
        }
        return dp[dp.length-1];
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,1};
        System.out.println(rob(arr));
        // System.out.println(tabu(arr,))
        int dp[]={0,0,0,0};
        System.out.println(tabu(arr,dp));
    }    
}

package DP;
import java.util.Arrays;
//https://leetcode.com/problems/house-robber-ii/description/
public class HouseRobberIItabu 
{
    public static int tabu(int dp[],int na[])
    {
        dp[0]=na[0];
        dp[1]=(int)Math.max(dp[0],na[1]);
        // System.out.print(dp[0]+" "+dp[1]+" ");
        int i=2;
        while(i!=na.length)
        {
            dp[i]=(int)Math.max(na[i]+dp[i-2],dp[i-1]);
            // System.out.print(dp[i]+" ");
            i++;
        }
        return dp[dp.length-1];
    }
    public static int rob(int[] arr) 
    {
        // So we will try to solve it twice first by removing the first house and then by not taking the last house and then return the max of those 2
        if(arr.length==1)
            return arr[0];
        if(arr.length==2)
            return (int)Math.max(arr[0],arr[1]);
        int na[]=new int[arr.length-1];
        int i=0;
        while(i!=na.length)
        {
            na[i]=arr[i+1];
            i++;
        }  
        int dp[]=new int[na.length];
        Arrays.fill(dp,0);
        int max1=tabu(dp,na);
        Arrays.fill(na,0);
        i=0;
        while(i!=na.length)
            na[i]=arr[i++];
        Arrays.fill(dp,0);
        int max2=tabu(dp,na);
        return (int)Math.max(max1,max2);
    }
    public static void main(String[] args) 
    {
        int arr[]={1,2,3};
        System.out.println(rob(arr));        
    }    
}

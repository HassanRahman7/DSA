package DP;

public class partition_equal_subset_sum 
{
    public static int solve(int curr_sum,int target,int arr[],int idx,int dp[][])
    {
        if(idx>=arr.length)
        {
            if(curr_sum==target)
                return 1;
            else 
                return 0;
        }
        if(curr_sum>target)
            return 0;
        if(dp[idx][curr_sum]!=-1)
            return dp[idx][curr_sum];
        int skip=solve(curr_sum,target,arr,idx+1,dp);
        if(curr_sum==target)
        {
            dp[idx][curr_sum]=1;
            return 1;
        }
        int take=solve(curr_sum+arr[idx],target,arr,idx+1,dp);
        dp[idx][curr_sum]=skip+take;
        return skip+take;
    }
    public static boolean solve2(int curr_sum,int target,int arr[],int idx)
    {
        int dp[][]=new int[arr.length][target+1];
        int i=0,j=0;
        while(i!=dp.length)
        {
            j=0;
            while(j!=dp[0].length)
            {
                dp[i][j++]=-1;
            }
            i++;
        }
        if(solve(curr_sum, target, arr, idx,dp)>=1)
            return true;
        else
            return false;
    }
    // Tell if there exists a subset of the array with sum==target
    public static void main(String[] args) 
    {
        int arr[]={8,6,2,4},target=11;
        System.out.println(solve2(0,target,arr,0));
    }   
}

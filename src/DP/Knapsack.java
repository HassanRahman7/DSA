package DP;

public class Knapsack 
{
    public static int profit(int weight[],int val[],int C,int idx,int dp[][])
    {
        if(idx==weight.length)
            return 0;
        if(dp[idx][C]!=-1)
            return dp[idx][C];
        int skip=profit(weight,val,C,idx+1,dp);
        if(weight[idx]>C)
        {
            dp[idx][C]=skip;
            return skip;
        }
        int pick=val[idx]+profit(weight,val,C-weight[idx],idx+1,dp);
        int ans= (int)Math.max(pick,skip);
        dp[idx][C]=ans;
        return ans;
    }
    public static void main(String[] args) 
    {
        int val[]={5,3,7,16};
        int wt[]={1,2,8,10};
        int C=8;
        // For dp array first check which are the variables whose values are changing repeatedly. The 2 variables are 
        //-> i from 0 to wt.length-1
        // -> C from C to 0.
        // So we shall make a 2D dp
        int dp[][]=new int[wt.length][C+1];
        int i,j;
        for(i=0;i<dp.length;i++)
        {
            for(j=0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        System.out.println(profit(wt,val,C,0,dp));
    }
    
}

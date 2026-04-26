package DP;

public class Profitable_schemes 
{
    //https://leetcode.com/problems/profitable-schemes/?utm=codolio
    public static int helper(int idx,int P,int peoples,int n,int minProfit,int group[],int profit[],int dp[][][])
    {
        if(idx>=group.length)
        {
            if(P>=minProfit && peoples<=n)
            {
                dp[idx][P][peoples]=1;
                return 1;
            }
            else
                return 0;
        }
        if(peoples>n)
            return 0;
        if(dp[idx][P][peoples]!=-1)
            return dp[idx][P][peoples];
        int skip=helper(idx+1,P,peoples,n,minProfit,group,profit,dp);
        int take=helper(idx+1,(int)Math.min(P+profit[idx],minProfit),peoples+group[idx],n,minProfit,group,profit,dp);
        dp[idx][P][peoples]=(skip+take)%1000000007;
        return (skip+take)%1000000007;
    }
    public static int profitableSchemes(int n, int minProfit, int[] group, int[] profit) 
    {
        // 0/1 Knapsack hai first you need to study that to solve this problem.
        int dp[][][]=new int[group.length+1][minProfit+1][n+1];
        int i,j,k;
        for(i=0;i<dp.length;i++)
        {
            for(j=0;j<dp[0].length;j++)
            {
                for(k=0;k<dp[0][0].length;k++)
                {
                    dp[i][j][k]=-1;
                }
            }
        }
        return helper(0,0,0,n,minProfit,group,profit,dp);
    }
    public static void main(String[] args) 
    {
        int n=1,minProfit=1;
        int group[]={2,2,2,2,2,2,1,2,1,1,2,1,2,2,2,1,2,1,1,2,1,2,1,2,2,2,2,1,1,2,2,2,1,1,2,1,2,2,2,1,2,2,2,2,1,2,2,1,2,2,1,1,1,1,1,1,2,2,2,2,1,1,1,2,1,1,1,2,1,1,1,2,1,1,1,2,2,1,1,2,2,2,1,1,2,2,1,1,2,2,1,2,2,1,1,2,2,2,2,2};
        int profit[]={2,1,2,2,2,1,0,1,2,0,0,2,2,1,1,1,2,0,1,1,2,0,2,2,1,0,1,0,1,2,2,1,1,2,0,2,1,1,1,1,1,2,0,1,0,2,2,2,2,2,0,1,1,2,1,0,1,0,0,2,1,0,2,0,2,1,1,1,0,1,0,1,2,2,0,1,1,2,2,0,1,0,0,1,1,2,2,2,2,1,0,0,1,2,1,1,1,1,0,1};
        System.out.println(profitableSchemes(n,minProfit,group,profit));
    }    
}
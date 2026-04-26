package DP;
public class unique_paths 
{
    public static int solver(int i,int j,int m,int n,int dp[][])
    {
        if(i>=m||j>=n)
            return 0;
        if(i==m-1 && j==n-1)
            return 1;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int rw=solver(i+1,j,m,n,dp);
        int dw=solver(i,j+1,m,n,dp);
        // map.put(new Pair(i,j),rw+dw);
        dp[i][j]=rw+dw;
        return rw+dw;
    }
    public static int uniquePaths(int m, int n) 
    {
        // HashMap<Pair,Integer> map=new HashMap<>();
        int dp[][]=new int[m][n];
        // Arrays.fill(dp,-1);
        int i=0,j=0;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                dp[i][j]=-1;
            }
        }
        return solver(0,0,m,n,dp);
    }
    public static int opt_no_copy(int m,int n)
    {
        if(m==1)
            return 1;
        int dp[][]=new int[2][n];
        int i=0,j=0;
        while(i!=2)
            dp[i++][0]=1;
        i=0;
        while(i!=n)
            dp[0][i++]=1;
        i=0;
        int c=0;
        for(i=1;i<=m-1;i++)
        {
            if(c%2==0)
            {
                for(j=1;j<n;j++)
                {
                    dp[1][j]=dp[1][j-1]+dp[0][j];
                }
                c++;
                continue;
            }
            else
            {
                for(j=1;j<n;j++)
                {
                    dp[0][j]=dp[0][j-1]+dp[1][j];
                }
                c++;
                continue;
            }
        }    
        if(c%2==0)
            return dp[0][n-1];
        else
            return dp[1][n-1];
    }
    public static int optimized_sol(int m,int n)
    {
        if(m==1)
            return 1;
        int dp[][]=new int[2][n];
        int i=0,j=0;
        while(i!=2)
            dp[i++][0]=1;
        i=0;
        while(i!=n)
            dp[0][i++]=1;
        for(i=1;i<=m-1;i++)
        {
            for(j=1;j<n;j++)
            {
                dp[1][j]=dp[1][j-1]+dp[0][j];
                dp[0][j]=dp[1][j];
            }
        }
        return dp[1][n-1];
    }
    public static int solver_tabu(int m,int n)
    {
        if(m==1 && n==1)
            return 1;
        int dp[][]=new int[m][n];
        int i=1,j=0;
        while(i!=m)
            dp[i++][0]=1;
        i=1;
        while(i!=n)
            dp[0][i++]=1;
        for(i=1;i<m;i++)
        {
            for(j=1;j<n;j++)
            {
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
    public static void main(String[] args) 
    {
        System.out.println(uniquePaths(3,7));
        System.out.println(solver_tabu(23,12));
        System.out.println(opt_no_copy(3, 7));
    }
}

package TWODARRAY;

public class leetcode2201
{
    public static int digArtifacts(int n, int[][] artifacts, int[][] dig)
    {
        boolean vis_array[][]=new boolean[n][n];
        int i=0,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                vis_array[i][j]=false;
            }
        }
        int k=0;
        while(k!=dig.length)
        {
            vis_array[dig[k][0]][dig[k][1]]=true;
            k++;
        }
        k=0;
        int ans=0;
        while(k!=artifacts.length)
        {
            int sr=artifacts[k][0];
            int er=artifacts[k][2];
            int sc=artifacts[k][1];
            int ec=artifacts[k][3];
            boolean flag=true;
            for(i=sr;i<=er;i++)
            {
                for(j=sc;j<=ec;j++)
                {
                    if(vis_array[i][j]==true)
                        continue;
                    else
                    {
                        flag=false;
                        break;
                    }
                }
            }
            if(flag==true)
                ans++;
            k++;
        }
        return ans;
    }

    public static void main(String[] args)
    {
        int n=2, artifacts[][]={{0,0,0,0},{0,1,1,1}},dig[][]={{0,0},{0,1}};
        System.out.println(digArtifacts(n,artifacts,dig));

    }
}

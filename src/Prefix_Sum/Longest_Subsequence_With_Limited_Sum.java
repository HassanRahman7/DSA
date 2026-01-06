package Prefix_Sum;
import java.util.*;
public class Longest_Subsequence_With_Limited_Sum
{
    //https://leetcode.com/problems/longest-subsequence-with-limited-sum/
    public static int[] answerQueries(int[] arr, int[] queries)
    {
        int ans[]=new int[queries.length];
        Arrays.sort(arr);
        int i=1;
        int pre[]=new int[arr.length];
        pre[0]=arr[0];
        while(i!=pre.length)
            pre[i]=pre[i-1]+arr[i++];
        i=0;
        int c=0;
        while(i!=queries.length)
        {
            int target=queries[i++];
            int mid=0,lo=0,hi=pre.length-1;
            boolean found=false;
            while(lo<=hi)
            {
                mid=lo+(hi-lo)/2;
                if(pre[mid]==target)
                {
                    found=true;
                    break;
                }
                else if(pre[mid]>target)
                    hi=mid-1;
                else
                    lo=mid+1;
            }
            if(found==true)
                ans[c++]=mid+1;
            else
                ans[c++]=hi+1;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int nums[]={4,5,2,1};
        int queries[]={3,10,21};
        int ans[]=answerQueries(nums,queries);
        int i=0;
        while(i!=ans.length)
            System.out.print(ans[i++]+" ");



    }
}

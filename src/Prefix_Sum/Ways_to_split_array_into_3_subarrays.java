package Prefix_Sum;

public class Ways_to_split_array_into_3_subarrays
{
    //https://leetcode.com/problems/ways-to-split-array-into-three-subarrays/description/
    private static final int MOD = 1_000_000_007;
    public static int findLowerBound(int prefixSum[],int i,int n)
    {
        int low=i+1;
        int high=n-2;
        int ans=-1;
        int sum_left=prefixSum[i+1];
        while(low<=high)
        {
            int mid_j=low+(high-low)/2;
            int sum_mid=prefixSum[mid_j+1]-prefixSum[i+1];
            if(sum_left<=sum_mid)
            {
                ans=mid_j;
                high=mid_j-1;
            }
            else
                low=mid_j+1;
        }
        return ans;
    }
    public static int findUpperBound(int prefixSum[],int i,int n)
    {
        int low=i+1;
        int high=n-2;
        int ans=-1;
        int totalSum=prefixSum[n];
        while(low<=high)
        {
            int mid_j=low+(high-low)/2;
            int sum_mid=prefixSum[mid_j+1]-prefixSum[i+1];
            int sum_right=totalSum-prefixSum[mid_j+1];
            if(sum_mid<=sum_right)
            {
                ans=mid_j;
                low=mid_j+1;
            }
            else
                high=mid_j-1;
        }
        return ans;
    }
    public static int waysToSplit(int[] nums)
    {
        int n=nums.length;
        int prefixSum[]=new int[n+1];
        int i;
        for(i=0;i<n;i++)
            prefixSum[i+1]=prefixSum[i]+nums[i];
        long count=0;
        for(i=0;i<n-2;i++)
        {
            int j_min=findLowerBound(prefixSum,i,n);
            int j_max=findUpperBound(prefixSum,i,n);
            if(j_min!=-1 && j_max!=-1 && j_min<=j_max)
                count=(count+(j_max-j_min+1))%MOD;
        }
        return (int)count;
    }
    public static void main(String[] args)
    {
        int nums[]={3,2,1};
        System.out.println(waysToSplit(nums));
    }
}

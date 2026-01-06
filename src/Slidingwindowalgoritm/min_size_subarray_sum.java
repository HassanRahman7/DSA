package Slidingwindowalgoritm;

public class min_size_subarray_sum
{
    public static int minSubArrayLen(int target, int[] arr)
    {
        int i=0,j=0;
        int sum=arr[i];
        // while(i!=arr.length && j!=arr.length)
        // {
        //     sum=sum+arr[j++];
        //     if(sum>=target)
        //         break;
        // }
        int ans=Integer.MAX_VALUE;
        while(i!=arr.length && j!=arr.length)
        {
            if(sum>=target)
            {
                ans=(int)Math.min(ans,j-i+1);
                sum=sum-arr[i++];
            }
            else
            {
                if(j!=arr.length-1)
                    sum=sum+arr[++j];
                else
                    break;
            }
            // sum=sum-arr[i++];
        }
        if(ans==Integer.MAX_VALUE)
            return 0;
        else
            return ans;
    }
    public static void main(String[] args)
    {
        int target=11,nums[]={1,1,1,1,1,1,1,1};
        System.out.println(minSubArrayLen(target,nums));
    }
}

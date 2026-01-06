package leetcode;

public class maximumsumcircularsubarray 
{
    // 918. Maximum Sum Circular Subarray
    // https://leetcode.com/problems/maximum-sum-circular-subarray/description/
    public static int maxSubarraySumCircular(int[] arr) 
    {
        int ts=0,max_sum=arr[0],curr_max=0,min_sum=arr[0],curr_min=0,i=0;
        for(i=0;i<arr.length;i++)
        {
            //Max value of Max subarray sum
            curr_max=Math.max(curr_max+arr[i],arr[i]);
            max_sum=Math.max(max_sum,curr_max);
            //Min value of Min subarray sum
            curr_min=Math.min(curr_min+arr[i],arr[i]);
            min_sum=Math.min(min_sum,curr_min);
            ts=ts+arr[i];
        }
        if(max_sum>0)
        return Math.max(max_sum,ts-min_sum);
        else
        return max_sum;
    }
    public static void main(String[] args) 
    {
        int arr[]={-3,-2,-3};
        //Output should be -2.
        System.out.println(maxSubarraySumCircular(arr));
        
    }

    
}

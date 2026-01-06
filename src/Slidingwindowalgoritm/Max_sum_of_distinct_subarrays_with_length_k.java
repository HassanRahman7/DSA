package Slidingwindowalgoritm;
import java.util.HashSet;
public class Max_sum_of_distinct_subarrays_with_length_k
{
    public static long maximumSubarraySum(int[] arr, int k)
    {
        int n=arr.length;
        long res=0;
        long curr_sum=0;
        HashSet<Integer> set=new HashSet<>();
        int i=0,j=0;
        while(j<n)
        {
            while(set.contains(arr[j])==true)
            {
                curr_sum=curr_sum-arr[i];
                set.remove(arr[i]);
                i++;
            }
            curr_sum=curr_sum+arr[j];
            set.add(arr[j]);
            if(j-i+1==k)
            {
                res=(long)Math.max(res,curr_sum);
                curr_sum=curr_sum-arr[i];
                set.remove(arr[i]);
                i++;
            }
            j++;
        }
        return res;
    }
    public static void main(String[] args)
    {
        int arr[]={1,5,4,2,9,9,9};
        int k=3;
        System.out.println(maximumSubarraySum(arr,k));
    }
}

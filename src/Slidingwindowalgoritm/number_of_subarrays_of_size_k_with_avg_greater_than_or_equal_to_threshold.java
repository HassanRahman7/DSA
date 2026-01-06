package Slidingwindowalgoritm;

public class number_of_subarrays_of_size_k_with_avg_greater_than_or_equal_to_threshold
{
    public static int numOfSubarrays(int[] arr, int k, int threshold)
    {
        int i=0,j=k-1,sum=0;
        for(i=0;i<=j;i++)
            sum=sum+arr[i];
        i=0;
        int ans=0;
        while(i!=arr.length && j!=arr.length)
        {
            // System.out.println(sum);
            double avg=sum/k;
            if(avg>=threshold)
                ans++;
            sum=sum-arr[i];
            i++;
            j++;
            if(j==arr.length)
                break;
            sum=sum+arr[j];
        }
        return ans;

    }
    public static void main(String[] args)
    {
        int arr[]={2,2,2,2,5,5,5,8},k=3,threshold=4;
        System.out.println(numOfSubarrays(arr,k,threshold));
    }
}

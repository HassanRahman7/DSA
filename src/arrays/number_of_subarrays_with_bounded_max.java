package arrays;

public class number_of_subarrays_with_bounded_max
{
    public static int numSubarrayBoundedMax(int[] arr, int left, int right)
    {
        int i=0,j=0,count=0,m=0;
        while(i!=arr.length && j!=arr.length)
        {
            if(arr[j]>right)
            {
                i=j+1;
                m=0;
            }
            if(arr[j]>=left && arr[j]<=right)
            {
                m=j-i+1;
                count=count+m;
            }
            if(arr[j]<left)
                count=count+m;
            j++;
        }
        return count;
    }
    public static void main(String[] args)
    {
        int arr[]={2,1,4,3},left=2,right=3;
        System.out.println(numSubarrayBoundedMax(arr,left,right));
    }
}

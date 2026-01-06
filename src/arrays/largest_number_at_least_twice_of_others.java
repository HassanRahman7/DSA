package arrays;

public class largest_number_at_least_twice_of_others
{
    public static int dominantIndex(int[] arr)
    {
        int i=0,max=Integer.MIN_VALUE,max_idx=-1;
        while(i!=arr.length)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                max_idx=i;
            }
            i++;
        }
        i=0;
        while(i!=arr.length)
        {
            if(i==max_idx)
            {
                i++;
                continue;
            }
            else if(arr[i]*2<=max)
            {
                i++;
                continue;
            }
            else
                return -1;
        }
        return max_idx;
    }
    public static void main(String[] args)
    {
        int arr[]={3,6,1,0};
        System.out.println(dominantIndex(arr));
    }
}

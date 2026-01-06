package Binarysearch;

public class minlimit_of_balls_in_a_bag
{
    public static boolean isPossible(int mid,int arr[],int maxOperations)
    {
        int i=0,tot_op=0;
        while(i!=arr.length)
        {
            int op=(int)Math.ceil((double)arr[i++]/mid)-1;
            tot_op=tot_op+op;
            if(tot_op>maxOperations)
                return false;
        }
        return true;
    }
    public static int minimumSize(int[] arr, int maxOperations)
    {
        int max=Integer.MIN_VALUE;
        int i=0;
        while(i!=arr.length)
            max=(int)Math.max(arr[i++],max);
        // min=(int)Math.min(arr[i++],min);
        // search space joh hai mera that is from 1 to max if there is only a single element otherwise the search space shall be from low to max
        // boolean size1=false;
        // if(arr.length==1)
        // size1=true;
        int lo=1,hi=max,mid=0,posans=max;
        // if(size1==false)
        // lo=min;
        while(lo<=hi)
        {
            mid=lo+(hi-lo)/2;
            // System.out.println("mid="+mid);
            // int tot_op=(int)Math.ceil(max/mid)-1;
            if(isPossible(mid,arr,maxOperations)==false)
                lo=mid+1;
            else if(isPossible(mid,arr,maxOperations)==true)
            {
                posans=(int)Math.min(posans,mid);
                // System.out.println("posans="+posans);
                hi=mid-1;
            }
        }
        return posans;
    }
    public static void main(String[] args)
    {
        int arr[]={7,17};
        System.out.println(minimumSize(arr,2));
    }
}

package Prefix_Sum;

public class Runningsumof1darray
{
    public static int[] runningSum(int[] arr)
    {
        int i=1;
        int ans[]=new int[arr.length];
        ans[0]=arr[0];
        while(i!=arr.length)
            ans[i]=ans[i-1]+arr[i++];
        return ans;
    }
    public static void print(int arr[])
    {
        int i=0;
        while(i!=arr.length)
            System.out.print(arr[i++]+" ");
    }
    public static void main(String[] args)
    {
        int arr[]={3,1,2,10,1};
        int ans[]=new int[arr.length];
        ans=runningSum(arr);
        print(ans);
    }
}

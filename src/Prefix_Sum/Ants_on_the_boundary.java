package Prefix_Sum;

public class Ants_on_the_boundary
{
    public static int returnToBoundaryCount(int[] arr)
    {
        int ans[]=new int[arr.length];
        int i=1;
        int count=0;
        ans[0]=arr[0];
        while(i!=arr.length)
        {
            ans[i]=ans[i-1]+arr[i];
            if(ans[i]==0)
                count++;
            i++;
        }
        return count;
    }

    public static void main(String[] args)
    {
        int arr[]={2,3,-5};
        System.out.println(returnToBoundaryCount(arr));

    }
}

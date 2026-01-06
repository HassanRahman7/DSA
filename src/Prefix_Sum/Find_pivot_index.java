package Prefix_Sum;

public class Find_pivot_index
{
    public static int pivotIndex(int[] arr)
    {
        int arr2[]=new int[arr.length];
        int arr3[]=new int[arr.length];
        int i=1;
        arr2[0]=arr[0];
        arr3[arr.length-1]=arr[arr.length-1];
        while(i!=arr.length)
        {
            arr2[i]=arr[i]+arr2[i-1];
            i++;
        }
        i=arr.length-2;
        while(i!=-1)
        {
            arr3[i]=arr3[i+1]+arr[i];
            i--;
        }
        i=0;
        while(i!=arr.length)
        {
            if(arr2[i]==arr3[i])
                return i;
            i++;
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int arr[]={2,1,-1};
        System.out.println(pivotIndex(arr));
    }
}

package arrays;

public class Replace_elements_with_greater_element_on_right_side
{
    public static int[] replaceElements(int[] arr)
    {
        int ans[]=new int[arr.length];
        int i=arr.length-1;
        int max=-1;
        ans[arr.length-1]=-1;
        // i--;
        while(i!=-1)
        {
            max=(int)Math.max(arr[i],max);
            if(i!=0)
                ans[--i]=max;
            else
                break;
        }
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
        int arr[]={17,18,5,4,6,1};
        int res[]=replaceElements(arr);
        print(res);
    }
}

package Prefix_Sum;

public class Product_of_Array_except_self
{
    public static int[] productExceptSelf(int[] arr)
    {
        int req1[]=new int[arr.length];
        int req2[]=new int[arr.length];
        int i=1;
        req1[0]=1;
        while(i!=arr.length)
        {
            req1[i]=arr[i-1]*req1[i-1];
            i++;
        }
        req2[req2.length-1]=1;
        i=req2.length-2;
        while(i!=-1)
        {
            req2[i]=req2[i+1]*arr[i+1];
            i--;
        }
        i=0;
        while(i!=arr.length)
            req1[i]=req1[i]*req2[i++];
        return req1;
    }
    public static void main(String[] args)
    {
        int nums[]={1,2,3,4};
        int ans[]=productExceptSelf(nums);
        int i=0;
        while(i!=ans.length)
            System.out.print(ans[i++]+" ");
    }
}

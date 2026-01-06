package leetcode;

import java.util.Arrays;

public class leetcode1752 
{
    public static void copyarray(int arr[],int brr[])
    {
        int i=0;
        for(i=0;i<arr.length;i++)
        brr[i]=arr[i];
    }
    public static  boolean check2(int arr[],int brr[],int x)
    {
        int i=0;
        while(i!=arr.length)
        {
            if(arr[i]==brr[(i+x)%arr.length])
            {
                i++;
                continue;
            }
            else
                return false;
        }
        return true;
    }
    public static boolean check(int[] arr) 
    {
        int brr[]=new int[arr.length];
        copyarray(arr,brr);
        Arrays.sort(arr);
        int i=0,x;
        for(x=0;x<arr.length;x++)
        {
            if(check2(arr,brr,x)==false)
            continue;
            else
            return true;
        }
        return false;        
    }
    public static void main(String[] args) 
    {
        int arr[]={1,2,3};
        System.out.println(check(arr));

        
    }
    
}

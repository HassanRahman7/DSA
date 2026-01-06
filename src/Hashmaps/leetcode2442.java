package Hashmaps;

import java.util.HashSet;

public class leetcode2442 
{
    //2442. Count Number of Distinct Integers After Reverse Operations
    //https://leetcode.com/problems/count-number-of-distinct-integers-after-reverse-operations/description/
    public static int reverse(int n)
    {
        int rev=0,d;
        while(n>0)
        {
            d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        return rev;
    }
    public static void copyarray(int arr[],int brr[])
    {
        int i=0;
        while(i!=arr.length)
            brr[i]=arr[i++];
    }
    public static int countDistinctIntegers(int[] arr) 
    {
        int brr[]=new int[arr.length*2];
        copyarray(arr,brr);
        int i=0;
        while(i!=arr.length)
            arr[i]=reverse(arr[i++]);
        i=arr.length;
        int c=0;
        while(i!=brr.length)
        brr[i++]=arr[c++];
        HashSet<Integer> ans=new HashSet<>();
        for(i=0;i<brr.length;i++)
            ans.add(brr[i]);
        return ans.size();
    }
    public static void main(String[] args) 
    {
        int arr[]={1,13,10,12,31};
        System.out.println(countDistinctIntegers(arr));
    }
}

package Sorting;

public class Number_of_ways_to_split_array
{
    // https://leetcode.com/problems/number-of-ways-to-split-array/description/
    public static int waysToSplitArray(int[] arr)
    {
        long req[]=new long[arr.length];
        long req2[]=new long[arr.length];
        int i=1;
        req[0]=arr[0];
        while(i!=arr.length)
            req[i]=req[i-1]+arr[i++];
        req2[req2.length-1]=arr[arr.length-1];
        i=arr.length-2;
        while(i!=-1)
            req2[i]=req2[i+1]+arr[i--];
        i=0;
        long count=0;
        while(i!=req.length-1)
        {
            if(req[i]>=req2[i+1])
                count++;
            i++;
        }
        return (int)count;
    }
    public static void main(String[] args)
    {
        System.out.println(waysToSplitArray(new int[]{10, 4, -8, 7}));
    }
}

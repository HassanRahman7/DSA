package arrays;

import java.util.Arrays;

public class leetcode2733 
{
    public static int findNonMinOrMax(int[] arr) 
    {
        if(arr.length<=2)
        return -1;
        Arrays.sort(arr);
        return arr[1];
    }   
    public static void main(String[] args) 
    {
        int arr[]={2,1,3};
        System.out.println(findNonMinOrMax(arr));
    }
}

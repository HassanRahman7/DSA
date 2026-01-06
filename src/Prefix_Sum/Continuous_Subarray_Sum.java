package Prefix_Sum;
import java.util.*;
public class Continuous_Subarray_Sum
{
    //https://leetcode.com/problems/continuous-subarray-sum/description/
    public static boolean checkSubarraySum(int[] arr, int k)
    {
        //first step apna pre[] array banao
        if(arr.length==1)
            return false;
        int pre[]=new int[arr.length];
        int i=1;
        pre[0]=arr[0];
        while(i!=arr.length)
            pre[i]=pre[i-1]+arr[i++];
        // Abh ek hashmap jisme remainder,index store karenge
        HashMap<Integer,Integer> map=new HashMap<>();
        i=0;
        while(i!=pre.length)
        {
            int remainder=pre[i]%k;
            if(remainder==0 && i!=0)
                return true;
            if(map.containsKey(remainder)==false)
                map.put(remainder,i);
            else
            {
                if(i-map.get(remainder)>=2)
                    return true;
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args)
    {
        int nums[]={23,2,6,4,7},k=13;
        System.out.println(checkSubarraySum(nums,k));
    }
}

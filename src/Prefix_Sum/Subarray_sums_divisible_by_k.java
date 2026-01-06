package Prefix_Sum;
import java.util.*;
public class Subarray_sums_divisible_by_k
{
    public static int subarraysDivByK(int[] arr, int k)
    {
        int pre[]=new int[arr.length];
        int i=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        i=1;
        pre[0]=arr[0];
        while(i!=arr.length)
            pre[i]=pre[i-1]+arr[i++];
        i=0;
        int counter=0;
        while(i!=pre.length)
        {
            int remainder=pre[i]%k;
            if(remainder<0)
                remainder=remainder+k;
            if(map.containsKey(remainder)==true)
            {
                counter=counter+map.get(remainder);
                map.put(remainder,map.get(remainder)+1);
            }
            else
                map.put(remainder,1);
            i++;
        }
        return counter;
    }

    public static void main(String[] args)
    {
        int arr[]={4,5,0,-2,-3,1},k=5;
        System.out.println(subarraysDivByK(arr,k));
    }

}

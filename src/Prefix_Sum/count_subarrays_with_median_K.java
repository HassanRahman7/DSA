package Prefix_Sum;
import java.util.HashMap;
//https://leetcode.com/problems/count-subarrays-with-median-k/
public class count_subarrays_with_median_K
{
    public static int countSubarrays(int[] arr, int k)
    {
        int i=0;
        int k_idx=-1;
        while(i!=arr.length)
        {
            if(arr[i]<k)
                arr[i]=-1;
            else if(arr[i]==k)
            {
                k_idx=i;
                arr[i]=0;
            }
            else
                arr[i]=1;
            i++;
        }
        // Now we just need to find the number of subarrays whose sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        i=k_idx-1;
        int bal=0;
        while(i!=-1)
        {
            bal=bal+arr[i];
            if(map.containsKey(bal)==false)
                map.put(bal,1);
            else
                map.put(bal,map.get(bal)+1);
            i--;
        }
        int count=0;
        i=k_idx;
        bal=0;
        while(i!=arr.length)
        {
            bal=bal+arr[i];
            if(map.containsKey(-1*bal)==true)
                count=count+map.get(-1*bal);
            // i++;
            if(map.containsKey(1-bal)==true)
                count=count+map.get(1-bal);
            i++;
        }
        return count;
    }
    public static void main(String[] args)
    {
        int arr[]={5,19,11,15,13,16,4,6,2,7,10,8,18,20,1,3,17,9,12,14},k=6;
        System.out.println(countSubarrays(arr,k));
    }
}

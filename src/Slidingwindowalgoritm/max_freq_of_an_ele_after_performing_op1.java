package Slidingwindowalgoritm;

import java.util.HashMap;

public class max_freq_of_an_ele_after_performing_op1
{
    public static int maxFrequency(int[] arr, int k, int numOperations)
    {
        if(numOperations==0)
        {
            HashMap<Integer,Integer> map=new HashMap<>();
            int i=0;
            while(i!=arr.length)
            {
                if(map.containsKey(arr[i])==false)
                    map.put(arr[i],1);
                else
                    map.put(arr[i],map.get(arr[i])+1);
                i++;
            }
            int max=Integer.MIN_VALUE;
            for(int val:map.values())
                max=(int)Math.max(max,val);
            return max;
        }
        int i=0,max=Integer.MIN_VALUE;
        while(i!=arr.length)
            max=(int)Math.max(max,arr[i++]);
        int max_bound=max+k+1;
        int brr[]=new int[max_bound];
        i=0;
        while(i!=arr.length)
            brr[arr[i++]]++;
        int pre[]=new int[brr.length];
        i=0;
        pre[0]=brr[0];
        i=1;
        while(i!=pre.length)
            pre[i]=pre[i-1]+brr[i++];
        int global_max_freq=0;
        int T=1;
        int count_l;
        while(T<max_bound)
        {
            int r_idx=(int)Math.min(T+k,max_bound-1);
            int l_idx=T-k-1;
            int count_r=pre[r_idx];
            if(l_idx<0)
                count_l=0;
            else
                count_l=pre[l_idx];
            int tot_range=count_r-count_l;
            int already_eq=brr[T];
            int not_eq=tot_range-already_eq;
            int ele_we_can_change=(int)Math.min(numOperations,not_eq);
            int curr_freq=already_eq+ele_we_can_change;
            global_max_freq=(int)Math.max(global_max_freq,curr_freq);
            T++;
        }
        return global_max_freq;
    }

    public static void main(String[] args)
    {
        int arr[]={2,49},k=97,numOperartions=0;
        System.out.println(maxFrequency(arr,k,numOperartions));
    }
}

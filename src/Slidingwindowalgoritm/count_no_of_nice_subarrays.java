package Slidingwindowalgoritm;

import java.util.ArrayList;
import java.util.List;

public class count_no_of_nice_subarrays
{
    public static int numberOfSubarrays(int[] arr, int k)
    {
        int i=0;
        while(i!=arr.length)
            arr[i]=arr[i++]%2;
        List<Integer> odd=new ArrayList<>();
        i=0;
        odd.add(-1);
        while(i!=arr.length)
        {
            if(arr[i]==1)
                odd.add(i);
            i++;
        }
        if(odd.size()<k)
            return 0;
        odd.add(arr.length);
        int count=0;
        int o=1;
        while(o<=odd.size()-k-1)
        {
            int a=odd.get(o-1);
            i=odd.get(o);
            int j=odd.get(o+k-1);
            int b=odd.get(o+k);
            int l=i-a;
            int r=b-j;
            count=count+l*r;
            o++;
        }
        return count;
    }
    public static void main(String[] args)
    {
        int arr[]={2,2,2,1,2,2,1,2,2,2},k=2;
        System.out.println(numberOfSubarrays(arr,k));
    }
}

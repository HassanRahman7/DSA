package Hashmaps;
import java.util.*;
public class minimum_array_changes_to_make_diff_equal
{
    public static class pair
    {
        int num1;
        int num2;
        pair(int num1,int num2)
        {
            this.num1=num1;
            this.num2=num2;
        }
    }
    public static int lowerBound(int max_diff[], int ele)
    {
        if(ele<max_diff[0])
            return 0;
        else if(ele>max_diff[max_diff.length-1])
            return max_diff.length;
        else
        {
            int hi,lo,mid=0,lb=max_diff.length;
            lo=0;
            hi=max_diff.length-1;
            while(lo<=hi)
            {
                mid=lo+(hi-lo)/2;
                if(max_diff[mid]<ele)
                    lo=mid+1;
                else if(max_diff[mid]>=ele)
                {
                    hi=mid-1;
                    lb=(int)Math.min(lb,mid);
                }
            }
            return lb;
        }
    }
    public static int minChanges(int[] arr, int k)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        int j=arr.length-1;
        int c=0;
        pair pairing[]=new pair[arr.length/2];
        while(i<j)
        {
            int num1=arr[i];
            int num2=arr[j];
            int a=(int)Math.min(num1,num2);
            int b=(int)Math.max(num1,num2);
            pair p=new pair(a,b);
            pairing[c++]=p;
            int diff=(int)Math.abs(num1-num2);
            if(map.containsKey(diff)==false)
                map.put(diff,1);
            else
                map.put(diff,map.get(diff)+1);
            i++;
            j--;
        }
        int max_diff[]=new int[arr.length/2];
        for(i=0;i<max_diff.length;i++)
        {
            pair p=pairing[i];
            int a=p.num1;
            int b=p.num2;
            int maximum_diff=(int)Math.max(b,k-a);
            max_diff[i]=maximum_diff;
        }
        Arrays.sort(max_diff);
        // HashMap<Integer,Integer> map2=new HashMap<>();
        int ans=Integer.MAX_VALUE;
        for(int ele:map.keySet())
        {
            int numberOfpairs=arr.length/2-map.get(ele);
            int diff=ele;
            int lb=lowerBound(max_diff,ele);
            ans=(int)Math.min(ans,numberOfpairs+lb);
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int nums[]={1,0,1,2,4,3};
        int k=4;
        System.out.println(minChanges(nums,k));
    }
}

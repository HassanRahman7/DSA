package Slidingwindowalgoritm;
import java.util.HashSet;
public class longest_array_of_1s_after_deleting_1_element
{
    public static int longestSubarray(int[] arr)
    {
        HashSet<Integer> set=new HashSet<>();
        int n=arr.length,i=0,j=0;
        while(i!=n)
        {
            set.add(arr[i]);
            if(set.contains(0)==true && set.contains(1)==true)
            {
                i=0;
                break;
            }
            i++;
        }
        if(set.contains(0)==false)
            return arr.length-1;
        if(set.contains(1)==false)
            return 0;
        i=0;
        j=0;
        int zeros=0,maxLen=0;
        while(i<n && arr[i]==0)
            i++;
        j=i;
        while(j<n)
        {
            if(arr[j]==1)
                j++;
            else
            {
                if(zeros==0)
                {
                    j++;
                    zeros++;
                }
                else
                {
                    int length=j-i-1;
                    maxLen=(int)Math.max(maxLen,length);
                    j++;
                    while(i<arr.length && arr[i]==1)
                        i++;
                    i++;
                }
            }
        }
        // if(zeros==1)
        // {
        if(zeros==0)
            return j-i;
        int length=j-i-1;
        maxLen=(int)Math.max(maxLen,length);
        // }
        return maxLen;
    }
    public static void main(String[] args)
    {
        int arr[]={1,1,1};
        System.out.println(longestSubarray(arr));
    }
}

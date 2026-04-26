package Hashmaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arithmetic_subarrrays 
{
    public static List<Boolean> checkArithmeticSubarrays(int[] arr, int[] l, int[] r) 
    {
        int i=0,j;
        List<Boolean> ans2=new ArrayList<>();
        // List<Integer> l=new ArrayList<>();
        while(i!=l.length)
        {
            int left=l[i];
            int end=r[i];
            j=left;
            List<Integer> l2=new ArrayList<>();
            while(j!=end+1)
            {
                // List<Integer> l=new ArrayList<>();
                l2.add(arr[j++]);
            }
            Collections.sort(l2);
            int diff=l2.get(1)-l2.get(0);
            int k=0;
            boolean ans=true;
            while(k!=l2.size()-1)
            {
                if(l2.get(k+1)-l2.get(k)==diff)
                {
                    k++;
                    continue;
                }
                else
                {
                    ans=false;
                    break;
                }
            } 
            ans2.add(ans);
            i++;
        }
        return ans2;
    }
    public static void main(String[] args) 
    {
        int arr[]={4,6,5,9,3,7},l[]={0,0,2},r[]={2,3,5};
        List<Boolean> arr2=checkArithmeticSubarrays(arr, l, r);
        int i=0;
        while(i!=arr2.size())
            System.out.println(arr2.get(i++));
    }
    
}

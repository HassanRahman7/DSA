package Hashmaps;

import java.util.HashMap;

public class twosum 
{
    // Two sum (Leetcode=1)
    // https://leetcode.com/problems/two-sum/description/
    public static int[] twoSum(int[] arr, int target) 
    {
        int ans[]={-1,-1};
        HashMap<Integer,Integer> map = new HashMap<>();
        int i,key,rem;
        for(i=0;i<arr.length;i++)
        {
            key=arr[i];
            rem=target-key;
            if(map.containsKey(rem)==true)
            {
                ans[0]=map.get(rem);
                ans[1]=i;
                return ans;
            }
            else
                map.put(key,i);
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        int nums[] = {3,3}, target = 6;
        int ans[]=new int[2];
        ans=twoSum(nums,target);
        int i=0;
        while(i!=ans.length)
            System.out.print(ans[i++]+" ");
        


    }
    
}

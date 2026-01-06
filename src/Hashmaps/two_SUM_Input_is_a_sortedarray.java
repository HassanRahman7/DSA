package Hashmaps;

import java.util.HashMap;
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
//167. Two Sum II - Input Array Is Sorted
// Also check out the BST version of this problem:
// https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
public class two_SUM_Input_is_a_sortedarray 
{
    public static int[] twoSum(int[] arr, int target) 
    {
        int ans[]={-1,-1};
        int i=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(i!=arr.length)
        {
            int key=arr[i];
            if(map.containsKey(target-key)==true)
            {
                ans[1]=i+1;
                ans[0]=map.get(target-key)+1;
                return ans;
            }
            else
            map.put(key,i++);
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        int arr[]={-1,0},target=-1;
        int ans[]=new int[2];
        ans=twoSum(arr,target);
        int i=0;
        while(i!=ans.length)
        {
            System.out.println(ans[i++]);
        }
    }
    
}

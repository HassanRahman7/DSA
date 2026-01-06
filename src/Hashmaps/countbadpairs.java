package Hashmaps;

import java.util.HashMap;

public class countbadpairs 
{
    //https://leetcode.com/problems/count-number-of-bad-pairs/?envType=daily-question&envId=2025-02-09
     public static long countBadPairs(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long goodPairs = 0;
        int n = arr.length;
        int i=0;
        while(i!=arr.length) 
        {
            // int key = i - arr[i];
            if (map.containsKey(i-arr[i])==true) 
            {
                goodPairs += map.get(i-arr[i]);
                map.put(i-arr[i],map.get(i-arr[i])+1);
                  // Count pairs with same key
            }
            else
            map.put(i-arr[i],1);
            i++;
            // map.put(key, map.getOrDefault(key, 0) + 1);
        }

        long totalPairs = (long) n * (n - 1) / 2;
        return totalPairs - goodPairs;
    }
    public static void main(String[] args) 
    {
        int arr[]={4,1,3,3};
        System.out.println(countBadPairs(arr));
    }
}

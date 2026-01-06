package leetcode;

public class leetcode1800 
{
    //1800. Maximum Ascending Subarray Sum
    //https://leetcode.com/problems/maximum-ascending-subarray-sum/description/?envType=daily-question&envId=2025-02-04
    public static int maxAscendingSum(int[] arr) 
    {
        int i=0,as=arr[0],posans=arr[0];
        while(i!=arr.length)
        {
            if((i+1!=arr.length)&&(arr[i]<arr[i+1]))
            {
                if(as==0)
                as=arr[i];
                if((i+1)!=arr.length)
                as=as+arr[i+1];
                posans=Math.max(as,posans);
                i++;
            }
            else
            {
                as=0;
                i++;
            }
        }
        return posans;

        
    }
    public static void main(String[] args) 
    {
        int nums[] = {12,17,15,13,10,11,12};
        System.out.println(maxAscendingSum(nums));
    }
}

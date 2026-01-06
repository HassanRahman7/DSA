package Prefix_Sum;

public class Find_the_Score_of_All_prefixes_of_an_array
{
    public static long[] findPrefixScore(int[] arr)
    {
        long conver[]=new long[arr.length];
        int i=0;
        long max=0;
        while(i!=arr.length)
        {
            max=(long)Math.max(max,arr[i]);
            conver[i]=arr[i]+max;
            i++;
        }
        long ans[]=new long[conver.length];
        i=1;
        ans[0]=conver[0];
        while(i!=conver.length)
        {
            ans[i]=ans[i-1]+conver[i];
            i++;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int nums[]={2,3,7,5,10};
        long ans[]=findPrefixScore(nums);
        int i=0;
        while(i!=nums.length)
            System.out.print(ans[i++]+" ");
    }
}

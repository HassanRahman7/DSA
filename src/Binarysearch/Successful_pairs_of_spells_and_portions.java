package Binarysearch;
import java.util.*;
public class Successful_pairs_of_spells_and_portions
{
    public static int get_pot_ans(int num,int potions[],long success)
    {
        int lb=potions.length,mid=0,i=0,lo=0,hi=potions.length-1;
        long target=(long)(Math.ceil((success*1.0)/num)); // isko dhundhna hai humko.
        if(target>potions[potions.length-1])
            return 0;
        while(lo<=hi)
        {
            mid=lo+(hi-lo)/2;
            if(potions[mid]>=target)
            {
                hi=mid-1;
                lb=(int)Math.min(lb,mid);
            }
            else
                lo=mid+1;
        }
        return potions.length-lb;
    }
    public static int[] successfulPairs(int[] spells, int[] potions, long success)
    {
        // long pot_ans[]=new long[potions.length];
        int i=0,j=0,count=0;
        int ans[]=new int[spells.length];
        Arrays.sort(potions);
        while(i!=spells.length)
            ans[i]=get_pot_ans(spells[i++],potions,success);
        return ans;
    }
    public static void print(int ans[])
    {
        int i=0;
        while(i!=ans.length)
            System.out.print(ans[i++]+" ");
    }
    public static void main(String[] args)
    {
        int spells[]={5,1,3};
        int potions[]={1,2,3,4,5};
        int succcess=7;
        int ans[]=new int[spells.length];
        ans=successfulPairs(spells,potions,succcess);
        print(ans);
    }
}

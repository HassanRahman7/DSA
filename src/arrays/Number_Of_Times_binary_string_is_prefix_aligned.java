package arrays;
import java.util.*;
public class Number_Of_Times_binary_string_is_prefix_aligned
{
    public static boolean check_con(char arr[],int idx)
    {
        int i=1;
        if(idx==0)
        {
            // that means sirf pehla vaala check karna hai that means kee agar arr[0]=='1 hai toh true otherwise false'
            if(arr[idx]=='1')
                return true;
            else
                return false;
        }
        while(i<=idx)
        {
            if(arr[i]=='1')
                i++;
            else
                return false;
        }
        return true;
    }
    public static int numTimesAllBlue(int[] flips)
    {
        char arr[]=new char[flips.length+1];
        int i=0;
        while(i!=arr.length)
            arr[i++]='0';
        i=0;
        int ans=0;
        while(i!=flips.length)
        {
            arr[flips[i]]='1';
            if(check_con(arr,i+1)==true)
                ans++;
            i++;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int flips[]={3,2,4,1,5};
        System.out.println(numTimesAllBlue(flips));
    }
}

package math;

import java.util.ArrayList;
import java.util.List;

public class number_of_laser_beams_in_a_bank 
{
    public static int numberOfBeams(String[] bank) 
    {
        List<Integer> arr=new ArrayList<>();
        int i=0,j=0,c1;
        while(i!=bank.length)
        {
            String str=bank[i];
            j=0;
            c1=0;
            while(j!=str.length())
            {
                if(str.charAt(j++)=='1')
                    c1++;
            }
            if(c1!=0)
                arr.add(c1);
            i++;
        }   
        int ans=0;
        i=0;
        if(arr.size()<=1)
            return 0;
        while(i!=arr.size()-1)
        {
            ans=ans+arr.get(i)*arr.get(i+1);
            i++;
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        String bank[]={"0"};
        System.out.println(numberOfBeams(bank));   
    }
    
}

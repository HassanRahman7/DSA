package math;

import java.util.HashMap;

public class Excel_Sheet_column
{
    public static String convertToTitle(int n)
    {
        // return ""+columnNumber/26;
        String ans="";
        HashMap<Integer,Character> map=new HashMap<>();
        int i=65;
        while(i!=91)
        {
            char ch=(char)(i);
            map.put(i-64,ch);
            i++;
        }
        // System.out.println(map);
        // return ans;
        while(n>0)
        {
            int d=n%26;
            // System.out.println("d="+d);
            if(d!=0)
                ans=ans+map.get(d);
            else
            {
                ans=ans+map.get(26);
                n=(n-26);
            }
            // System.out.println("ans="+ans);
            n=n/26;
            // System.out.println("n="+n);
        }
        i=ans.length()-1;
        String ans2="";
        while(i!=-1)
            ans2=ans2+ans.charAt(i--);
        return ans2;
    }
    public static void main(String[] args)
    {
        System.out.println(convertToTitle(701));
    }
}

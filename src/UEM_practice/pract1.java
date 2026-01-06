package UEM_practice;

import java.util.ArrayList;
import java.util.*;
public class pract1
{
    public static List<String> Substringsnikalo(String s)
    {
        List<String> ans=new ArrayList<>();
        int i,j;
        for(i=0;i<s.length();i++)
        {
            for(j=i;j<s.length();j++)
            {
                ans.add(s.substring(i,j+1));
            }
        }
        return ans;
    }
    public static boolean checkpal(String s)
    {
        int i=0,j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i++)==s.charAt(j--))
                continue;
            else
                return false;
        }
        return true;
    }
    public static String longestPal(String s)
    {
        List<String> allsubs=new ArrayList<>();
        allsubs=Substringsnikalo(s);
        int i=0,l=0;
        String posans="";
        while(i!=allsubs.size())
        {
            if(checkpal(allsubs.get(i))==true)
            {
                if(allsubs.get(i).length()>l)
                {
                    l=allsubs.get(i).length();
                    posans= allsubs.get(i);
                }
            }
            i++;
        }
        return posans;
    }
    public static void main(String[] args)
    {
        System.out.println(longestPal("cbbd"));
    }
}

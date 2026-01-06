package leetcode;

import java.util.ArrayList;
import java.util.List;
//Problem link.
//https://leetcode.com/problems/string-matching-in-an-array/description/?envType=daily-question&envId=2025-01-07
public class stringmatchiginanarray 
{
    // class Solution 
    public static boolean isMatching(String str1,String str2)
    {
        //str1="blue"
        //str2="green"
        int str1len=str1.length();
        int str2len=str2.length();
        if(str1len==str2len)
        {
            if(str1.equals(str2)==true)
            return true;
            else
            return false;
        }
        else
        {
            if(str2len>str1len)
            {
                int i=0;
                String str="";
                // Now we will generate substring of length equal to str1len and then check if they are equal or not. If equal then true otherwise false.
                while(str1len+i<=str2len)
                {
                    str=str2.substring(i,str1len+i);
                    if(str.equals(str1)==true)
                    return true;
                    i++;
                }
                return false;
            }
            else
            {
                int i=0;
                String str="";
                // In this case the length of str2 is smaller than that of str1. So you have to solve accordingly now.
                while(str2len+i<=str1len)
                {
                    str=str1.substring(i,str2len+i);
                    if(str.equals(str2)==true)
                    return true;
                    i++;
                }
                return false;
            }
        }
    }
    public static boolean isavailable(List<String> ans,String str)
    {
        int i=0;
        while(i!=ans.size())
        {
            if(ans.get(i++).equals(str)==true)
            return true;
        }
        return false;
    }
    public static List<String> stringMatching(String[] words) 
        {
            int i=0,j=1;
            List<String> ans=new ArrayList<>();
            for(i=0;i<words.length;i++)
            {
                for(j=i+1;j<words.length;j++)
                {
                    if(isMatching(words[i],words[j])==true)
                    {
                        if(words[i].length()>words[j].length())
                        {
                            if(isavailable(ans,words[j])==true)
                            continue;
                            else
                            ans.add(words[j]);
                        }
                        else if(words[i].length()<words[j].length())
                        {
                            if(isavailable(ans,words[i])==true)
                            continue;
                            else
                            ans.add(words[i]);
                        }
                        else
                        {
                            if(isavailable(ans,words[i])==true)
                            continue;
                            else
                            ans.add(words[i]);
                        }
                    }
                    else
                        continue;
                }
            }
            return ans;
        }
        public static void main(String[] args) 
        {
            String words[]={"blue","green","bu"};
            List<String> ans=new ArrayList<>();
            ans=stringMatching(words);
            int i=0;
            while(i!=ans.size())
                System.out.println(ans.get(i++));
        
        }


}
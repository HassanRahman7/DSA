package leetcode;

import java.util.ArrayList;
import java.util.List;

public class cleardigits 
{
    public static String clearDigits(String s) 
    {
        int digcount=0;
        int i=0;
        char ch[]=s.toCharArray();
        while(i!=s.length())
        {
            if(Character.isDigit(ch[i++])==true)
            digcount++;
        }
        if(digcount==0)
        return s;
        List<Character> ans=new ArrayList<>();
        i=0;
        while(i!=s.length())
        {
            if(Character.isAlphabetic(s.charAt(i))==true)
            ans.add(s.charAt(i));
            else
            ans.remove(ans.size()-1);
            i++;
        }
        i=0;
        String ans2="";
        while(i!=ans.size())
            ans2=ans2+ans.get(i++);
        return ans2;

    }
    public static void main(String[] args) 
    {
        String s="abc";
        System.out.println(clearDigits(s));
        
    }
}
    


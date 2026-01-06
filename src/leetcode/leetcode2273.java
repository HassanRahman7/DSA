package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode2273 
{
    //2273. Find Resultant Array After Removing Anagrams
    //https://leetcode.com/problems/find-resultant-array-after-removing-anagrams/description/
    public static boolean isAnagram(String s,String t)
    {
        if(s.length()!=t.length())
        return false;
        char ch[]=s.toCharArray();
        char ch2[]=t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch2);
        int i=0;
        while(i!=s.length())
        {
            if(ch[i]==ch2[i])
            i++;
            else
            return false;
        }
        return true;
    }
    public static List<String> removeAnagrams(String[] words) 
    {
        List<String> words2=new ArrayList<>();
        int i=0;
        while(i!=words.length)
            words2.add(words[i++]);
        i=1;
        while(i!=words2.size())
        {
            if(isAnagram(words2.get(i),words2.get(i-1))==true)
            {
                words2.remove(i);
                i=1;
            }
            else
            i++;
        }
        return words2;

        
    }
    public static void main(String[] args) 
    {
        String words[] = {"abba","baba","bbaa","cd","cd"};
        List<String> ans=new ArrayList<>();
        ans=removeAnagrams(words);
        System.out.println(ans);
    }
    
}

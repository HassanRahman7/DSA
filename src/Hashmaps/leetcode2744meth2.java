package Hashmaps;

import java.util.HashSet;
//2744. Find Maximum Number of String Pairs
//https://leetcode.com/problems/find-maximum-number-of-string-pairs/description/
// T.C.=O(n*l) l=avg length of string.
public class leetcode2744meth2 
{
    public static String reverse(String wrd)
    {
        String ans="";
        int j=wrd.length()-1;
        while(j!=-1)
        ans=ans+wrd.charAt(j--);
        return ans;
    }
    public static int maximumNumberOfStringPairs(String[] words)
    {
        int i=0,c=0;
        HashSet<String> set=new HashSet<>();
        while(i!=words.length)
        {
            if(set.contains(reverse(words[i])))
            c++;
            else
            set.add(words[i]);
            i++;
        }
        return c;
    }
    public static void main(String[] args) 
    {
        String words[]={"aa","ab"};
        System.out.println(maximumNumberOfStringPairs(words));
    }
}

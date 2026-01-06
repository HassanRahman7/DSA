package leetcode;

public class countwordswithagivenprefix 
{
    // 2185. Counting Words With a Given Prefix
    // Leetcode https://leetcode.com/problems/counting-words-with-a-given-prefix/description/?envType=daily-question&envId=2025-01-09
    public static boolean isavailable(String word,String pref)
    {
        String str="";
        int preflen=pref.length();
        if(preflen>word.length())
        return false;
        str=word.substring(0,preflen);
        // System.out.printf("%s",str);
        if(str.equals(pref)==true)
        return true;
        else
        return false;
    }
    public static int prefixCount(String[] words, String pref) 
    {
        int i=0,c=0;
        for(i=0;i<words.length;i++)
        {
            if(isavailable(words[i],pref)==true)
            c++;
        }
        return c;   
    }
    public static void main(String[] args) 
    {
        String words[]={"pay","attention","practice","attend"};
        String pref="at";
        System.out.println(prefixCount(words,pref));
    }
}

package Hashmaps;
public class leetcode2744 
{
    // 2744. Find Maximum Number of String Pairs
    // https://leetcode.com/problems/find-maximum-number-of-string-pairs/description/
    // This is one approach. T.C.=O(n2)
    public String reverse(String wrd)
    {
        String ans="";
        int j=wrd.length()-1;
        while(j!=-1)
        ans=ans+wrd.charAt(j--);
        return ans;
    }
    public int maximumNumberOfStringPairs(String[] words)
    {
        int i=0,j,c=0;
        for(i=0;i<words.length;i++)
        {
            for(j=i+1;j<words.length;j++)
            {
                if(words[i].equals(reverse(words[j]))==true)
                c++;
            }
        }
        return c;

    }
    public static void main(String[] args) 
    {

    }
}

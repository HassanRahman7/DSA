package leetcode;

import java.util.Arrays;

public class leetcode2124 
{
    //2124. Check if All A's Appears Before All B's
    // https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/description/
    public static boolean checkString(String s) 
    {
        char ch[]=s.toCharArray();
        int i=0;
        Arrays.sort(ch);
        while(i!=s.length())
        {
            // System.out.print(ch[i]+" ");
            if(ch[i]==s.charAt(i))
            i++;
            else
            return false;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        String s="bbb";
        System.out.println(checkString(s));


        
    }
    
}

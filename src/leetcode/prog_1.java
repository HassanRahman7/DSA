package leetcode;

import java.util.ArrayList;
//https://www.geeksforgeeks.org/batch/gfg-160-problems/track/string-gfg-160/problem/search-pattern0205
public class prog_1 
{
    static ArrayList<Integer> search(String pat, String txt) 
    {
        ArrayList<String> pos=new ArrayList<>();
        int i=0;
        ArrayList<Integer> index=new ArrayList<>();
        while(i+pat.length()<=txt.length())
        {
            String str=txt.substring(i,i+pat.length());
            pos.add(str);
            i++;
        }
        System.out.println(pos);
        i=0;
        int c=0;
        while(i!=pos.size())
        {
            if(pos.get(i).equals(pat)==true)
            index.add(c++);
            else
            c++;
        }
        return index;
    }
    public static void main(String[] args) 
    {
        String txt="abcab",pat="ab";
        ArrayList<Integer> ans=new ArrayList<>();
        ans=search(pat,txt);
        System.out.println(ans);
        
    }
    
}

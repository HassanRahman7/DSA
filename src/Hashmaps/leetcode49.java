package Hashmaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class leetcode49 
{
    public static String sort_string(String s)
    {
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        int i=0;
        String str="";
        // char ch2;
        while(i!=s.length())
            str=str+ch[i++];
        return str;
    }
    public static List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        int i=0;
        while(i!=strs.length)
        {
            String str=sort_string(strs[i]);
            if(map.containsKey(str)==true)
            {
                map.get(str).add(strs[i]);
                i++;
            }
            else
            {
                map.put(str,new ArrayList<>());
                map.get(str).add(strs[i]);
                i++;
            }
        }
        // System.out.println(map);
        List<List<String>> ans=new ArrayList<>();
        for(String key:map.keySet())
            ans.add(map.get(key));
        return ans;

        
        
    }
    public static void main(String[] args) 
    {
        List<List<String>> ans=new ArrayList<>();
        String strs[] = {"a"};
        ans=groupAnagrams(strs);
        System.out.println(ans);
        
    }
    
}

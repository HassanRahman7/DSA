package Hashmaps;
import java.util.*;
public class Match_Substring_after_replacement
{
    public static boolean check_con(String str,String sub, HashMap<Character,HashSet<Character>> map)
    {
        int i=0;
        for(i=0;i<sub.length();i++)
        {
            char ch=str.charAt(i);
            char ch2=sub.charAt(i);
            if(ch==ch2)
                continue;
            else
            {
                if(map.containsKey(ch2)==false)
                    return false;
                else
                {
                    HashSet<Character> set=map.get(ch2);
                    if(set.contains(ch)==false)
                        return false;
                    else
                        continue;
                }
            }
        }
        return true;
    }
    public static boolean matchReplacement(String s, String sub, char[][] mappings)
    {
        HashMap<Character,HashSet<Character>> map=new HashMap<>();
        int i=0;
        while(i!=mappings.length)
        {
            if(map.containsKey(mappings[i][0])==false)
            {
                HashSet<Character> set=new HashSet<>();
                set.add(mappings[i][1]);
                map.put(mappings[i][0],set);
            }
            else
            {
                HashSet<Character> set2=map.get(mappings[i][0]);
                set2.add(mappings[i][1]);
                map.put(mappings[i][0],set2);
            }
            i++;
        }
        if(s.length()<sub.length())
            return false;
        else
        {
            i=0;
            int j,window_length;
            window_length=sub.length();
            j=i+window_length;
            while(i<=s.length()&&j<=s.length())
            {
                String str=s.substring(i,j);
                if(check_con(str,sub,map)==true)
                    return true;
                else
                {
                    i++;
                    j++;
                    continue;
                }
            }
            return false;
        }
    }
    public static void main(String[] args)
    {
        String s="Fool33tbaR",sub="leetd";
        char mappings[][]={{'e','3'},{'t','7'},{'t','8'},{'d','b'},{'p','b'}};
        System.out.println(matchReplacement(s,sub,mappings));
    }
}

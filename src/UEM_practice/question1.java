package UEM_practice;

import java.util.HashMap;

public class question1
{
    public static int meth(String s1,String s2)
    {
        HashMap<Character,Integer> map=new HashMap<>();
        char ch;
        int i=0;
        while(i!=s2.length())
        {
            ch=s2.charAt(i++);
            if(map.containsKey(ch)==false)
                map.put(ch,1);
            else
                map.put(ch,map.get(ch)+1);
        }
        String unchar="";
        for(Character key: map.keySet())
        {
            if(map.get(key)==1)
                unchar=unchar+key;
        }
        i=0;
        HashMap<Character,Integer> map2=new HashMap<>();
        while(i!=s1.length())
        {
            ch=s1.charAt(i++);
            if(map2.containsKey(ch)==false)
                map2.put(ch,1);
            else
                map2.put(ch,map2.get(ch)+1);
        }
        int ans=0;
        i=0;
        while(i!=unchar.length())
        {
            ch=unchar.charAt(i++);
            ans=ans+map2.get(ch);
        }
        return ans;
    }
    public static void main(String[] args)
    {
        System.out.println(meth("abacabadabacaba","abcd"));
    }
}

package Hashmaps;

import java.util.HashMap;

public class itereatemap 
{
    public static void main(String[] args) 
    {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Hassan",44);
        map.put("Gaurav",23);
        map.put("Sana",34);
        map.put("Harsh",21);
        map.put("Faishal",43);
        int i;
        for(String key:map.keySet())
        System.out.println(key+" "+map.get(key));
        System.out.println();
        for(int val:map.values())
        System.out.println(val); // Not useful utna.
        System.out.println();
        for(Object pair:map.entrySet())
        System.out.println(pair);
    }
}

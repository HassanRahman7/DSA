package Hashmaps;

import java.util.HashMap;

public class Mapbasics 
{
    public static void main(String[] args) 
    {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Hassan",44);
        map.put("Gaurav",23);
        map.put("Sana",34);
        map.put("Harsh",21);
        map.put("Faishal",43);
        System.out.println(map);
        System.out.println(map.containsKey("Hassan"));
        System.out.println(map.containsValue(23));
        map.put("Hassan",12);// Same key mai overwrite hoga
        System.out.println(map);// Order random hoga 
        // Har ek map mai unique keys hote hai.
        System.out.println(map.size());
        map.remove("Sana");
        System.out.println(map);
        map.remove("Saubia");
        System.out.println(map); // no change
        System.out.println(map.get("Faishal"));
    }

    
}

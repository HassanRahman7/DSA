package Hashmaps;

import java.util.HashSet;

public class basicset 
{
    public static void main(String[] args) 
    {
        HashSet<Integer> set= new HashSet<>();
        set.add(20);
        set.add(100);
        set.add(10);
        set.add(-8);
        System.out.println(set);// Always while printing tumhara elements random order mai aata hai.
        //search- true/false: TC=o(1)
        System.out.println(set.contains(12));
        set.add(23);
        System.out.println(set.contains(23));
        System.out.println("Size is="+set.size());
        set.remove(100);
        System.out.println(set);
        Object[] arr=set.toArray();
        int i;
        for(i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
        // Set ka size infinite hota hai.
    }
    
}

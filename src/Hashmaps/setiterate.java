package Hashmaps;

import java.util.HashSet;

public class setiterate 
{
    public static void main(String[] args) 
    {
        HashSet<Integer> s=new HashSet<>();
        int arr[]={3,4,523,45,34};
        for(int ele:arr)
        System.out.print(ele+" ");
        System.out.println();
        s.add(22);
        s.add(34);
        s.add(36);
        s.add(544);
        s.add(45);
        for(int ele:s)
        {
            System.out.print(ele+" ");
            // s.add(1); During iteration you cannot add any elements in the set.
        }
        System.out.println();
        s.clear();// s ko khatam karne kai liye.
        System.out.println(s);
        s.add(12);
        s.add(3);
        s.add(34);
        s.add(3);  // Ek element sirf ek baar hee aata hai in a set.
        System.out.println(s);
        HashSet<String> set=new HashSet<>();
        set.add("Rahul");
        set.add("Rahul");
        set.add("Rahul");
        set.add("Rahul");
        set.remove("Rahul");
        System.out.println(set.size());
    }
    
}

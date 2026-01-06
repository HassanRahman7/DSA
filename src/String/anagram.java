package String;

import java.util.Arrays;
import java.util.Scanner;
//leetcode 242
public class anagram 
{
    public static boolean isAnagram(String s1,String s2) 
    {
        if(s1.length()!=s2.length())
        return false;
        else
        {
            char arr[]=s1.toCharArray();
            char arr2[]=s2.toCharArray();
            Arrays.sort(arr);
            Arrays.sort(arr2);
            int i;
            for(i=0;i<s1.length();i++)
            {
                if(arr[i]==arr2[i])
                continue;
                else
                return false;
            }
            return true;
        }
    }

        
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        System.out.println("Enter 2 strings:");
        s1=sc.nextLine();
        s2=sc.nextLine();
        if(isAnagram(s1,s2)==true)
        System.out.println("Both strings are anagram of each other.");
        else
        System.out.println("Both strings are not anagram of each other.");
        
    }
}


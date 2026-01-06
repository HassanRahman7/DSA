package String;

import java.util.Scanner;

//leetcode 2486
public class appendcharacterstostringtomakesubsequence 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s,t;
        System.out.println("Enter the string s:");
        s=sc.next();
        System.out.println("Enter the string t:");
        t=sc.next();
        char c[]=s.toCharArray();
        char c2[]=t.toCharArray();
        int i=0,j=0,k=0;
        while(i<c.length&&j<c2.length)
        {
            if(c[i]!=c2[j])
            {
                i++;
                continue;
            }
            else
            {
                k++;
                j++;
                i=i+1;
            }
        }
        System.out.println((t.length()-k));
        


        
    }
    
}

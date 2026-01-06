package stringsassignment;

import java.util.Scanner;

public class countvowelsubstring 
{
    public static boolean isVowel(char ch) 
    {
        if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u')
        return true;
        else
        return false;
    }
    public static boolean isA(char ch) 
    {
        if(ch=='a')
        return true;
        else
        return false;
    }
    public static boolean isE(char ch) 
    {
        if(ch=='e')
        return true;
        else
        return false;
    }
    public static boolean isI(char ch) 
    {
        if(ch=='i')
        return true;
        else
        return false;
        
    }
    public static boolean isO(char ch) 
    {
        if(ch=='o')
        return true;
        else
        return false;
        
    }
    public static boolean isU(char ch) 
    {
        if(ch=='u')
        return true;
        else 
        return false;
    }
    public static boolean solve(String s) 
    {
        int i=0,j=0,k=0,v1=0,v2=0,v3=0,v4=0,v5=0,ns=0;
        char c[]=s.toCharArray();
        while(i<s.length())
        {
            if(isVowel(c[i])==false)
            {
                j++;
                i++;
                k=0;
                continue;
            }
            else
            {
                if(isA(c[i])==true)
                {
                    v1++;
                    k++;
                    i++;
                }
                else if(isE(c[i])==true)
                {
                    v2++;
                    k++;
                    i++;
                }
                else if(isI(c[i])==true)
                {
                    v3++;
                    k++;
                    i++;
                }
                else if(isO(c[i])==true)
                {
                    v4++;
                    k++;
                    i++;
                }
                else if(isU(c[i])==true)
                {
                    v5++;
                    k++;
                    i++;
                }
                if(k>=5&&v1>=1&&v2>=1&&v3>=1&&v4>=1&&v5>=1)
                ns++;
            }
    }
    if(ns==1)
    return true;
    else
    return false;
}
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter a string:");
        s=sc.next();
        int i,k=0,j;
        for(i=0;i<s.length();i++)
        {
            for(j=i+1;j<s.length();j++)
            {
                if(solve(s.substring(i,j))==true)
                k++;
            }
        }
        System.out.println(k);
    }
}
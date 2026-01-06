package String;

import java.util.Scanner;

//leetcode 917
public class reverseonlyletter 
{
    public static boolean isAlphabet(char ch) 
    {
        int k=(int)ch;
        if((k>=65&&k<=90)||(k>=97&&k<=122))
        return true;
        else
        return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s,s2="";
        System.out.println("Enter a string:");
        s=sc.next();
        char temp;
        char c[]=s.toCharArray();
        int i,cna=0,k=0,start=0,end,f=0;
        for(i=0;i<s.length();i++)
        {
            if(isAlphabet(s.charAt(i))==false)
            cna++;
        }
        char c2[]=new char[c.length-cna];
        for(i=0;i<s.length();i++)
        {
            if(isAlphabet(s.charAt(i))==true)
            c2[k++]=c[i];
            else
            continue;
        }
        //reversing
        end=c2.length-1;
        while(end>start)
        {
            temp=c2[start];
            c2[start++]=c2[end];
            c2[end--]=temp;

        }
        for(i=0;i<s.length();i++)
        {
            if(isAlphabet(s.charAt(i))==true)
            s2=s2+c2[f++];
            else
            s2=s2+s.charAt(i);
        }
        System.out.println(s2);

        




    }
    
}

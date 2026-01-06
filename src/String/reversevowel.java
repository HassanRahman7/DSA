package String;

import java.util.Scanner;

public class reversevowel 
{
    public static boolean isvowel(char ch) 
    {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
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
        int i,c=0,p=0,j;
        for(i=0;i<s.length();i++)
        {
            if(isvowel(s.charAt(i))==true)
            c++;
        }
        char arr[]=new char[c];
        for(i=0;i<s.length();i++)
        {
            if(isvowel(s.charAt(i))==true)
                arr[p++]=s.charAt(i);
        }
        j=c-1;
        char temp;
        for(i=0;i<c/2;i++)
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        p=0;
        for(i=0;i<s.length();i++)
        {
            if(isvowel(s.charAt(i))==false)
            s2=s2+s.charAt(i);
            else
            s2=s2+arr[p++];
        }
        System.out.println(s2);


        
    }
    
}

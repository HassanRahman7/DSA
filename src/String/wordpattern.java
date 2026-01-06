package String;

import java.util.Scanner;

//leetcode 290
public class wordpattern 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s,pattern;
        System.out.println("Enter the pattern:");
        pattern=sc.next();
        System.out.println("Enter a string:");
        s=sc.nextLine();
        char c[]=pattern.toCharArray();
        int i,sp=0,p1=0,co=0,j,k=0;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            sp++;
        }
        String arr[]=new String[sp+1];
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                arr[co++]=s.substring(p1, i);
                p1=i+1;
            }
        }
        for(i=0;i<c.length;i++)
        System.out.println(c[i]);
        for(i=0;i<c.length;i++)
        {
            for(j=1;j<c.length;j++)
            {
                if(c[i]==c[j])
                {
                    if(arr[i]!=arr[j])
                    {
                        System.out.println("false.");
                        k++;
                        break;
                    }
                }
                if(c[i]!=c[j])
                {
                    if(arr[i]!=arr[j])
                    continue;
                    else
                    {
                        System.out.println("false");
                        k++;
                        break;
                    }

                }
            }
            if(k==1)
            break;
        }
        if(k==0)
        System.out.println("true");

        
    }
    
}

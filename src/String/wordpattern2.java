package String;

import java.util.Scanner;

public class wordpattern2 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s,pattern;
        System.out.println("Enter the pattern:");
        pattern=sc.next();
        System.out.println("Enter the string:");
        s=sc.nextLine();
        s=s+" ";
        int k=0,i,sp=0,p1=0,co=0,j;
        char c[]=pattern.toCharArray();
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
        {
            for(j=1;j<c.length;j++)
            {
                if(c[i]==c[j])
                {
                    if(arr[i].equals(arr[j]))
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
        System.out.println("True");
        
    }
    
}

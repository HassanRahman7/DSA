package String;

import java.util.Scanner;

public class faultykeyboard 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter a string:");
        s=sc.next();
        int i,start=0,end;
        char c[]=s.toCharArray();
        String s2="";
        char temp;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='i')
            {
                end=i-1;
                while(s.charAt(end)=='i')
                end--;
                while(end>start)
                {
                    temp=c[start];
                    c[start++]=c[end];
                    c[end--]=temp;
                }
                start=0;
            }
        }
        for(i=0;i<s.length();i++)
        {
            if(c[i]!='i')
            s2=s2+c[i];
            else
            continue;
        }
        System.out.println(s2);


        
    }
    
}

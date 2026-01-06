package stringsassignment;

import java.util.Scanner;

public class reversehalf 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter a string:");
        s=sc.nextLine();
        if(s.length()%2!=0)
        {
            System.out.println("Length is not even.");
            System.exit(0);
        }
        else
        {
            char c[]=s.toCharArray();
            int start=c.length/2;
            int end=c.length-1;
            char temp;
            int i;
            while(end>start)
            {
                temp=c[start];
                c[start++]=c[end];
                c[end--]=temp;
            }
            String s2="";
            start=c.length/2;
            s2=s2+s.substring(0,start);
            for(i=start;i<c.length;i++)
            s2=s2+c[i];
            System.out.println(s2);

        }
        
    }
    
}

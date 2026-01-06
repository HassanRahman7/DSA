package stringsassignment;

import java.util.Scanner;

//Input a string and concatenate with its reverse string and print it.
public class concatinatestringwithreversestring 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter a string:");
        s=sc.nextLine();
        char c[]=s.toCharArray();
        int i;
        String s2="";
        s2=s2+s;
        char temp;
        int start=0,end=s.length()-1;
        while(end>start)
        {
            temp=c[start];
            c[start++]=c[end];
            c[end--]=temp;
        }
        for(i=0;i<c.length;i++)
        s2=s2+c[i];
        System.out.println(s2);
        
    }
}
